package com.office.control;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.CheckTime;
import com.office.service.CheckTimeService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

/**
 * @author zhangmj
 * @date 2018年3月22日
 */
@Controller
@RequestMapping("checkOnWork/")
public class CheckTimeControl {

	@Autowired
	private CheckTimeService ckService;
	
	@RequestMapping("toDoCheckSelf.do")
	public String toDoCheckSelf() {
		return "checkOnWork/doCheckSelf";
	}

	private int returnEmpId(HttpServletRequest request) {
		Object empId = request.getSession().getAttribute("emp_id");
		String emp_id =empId != null ?empId.toString():null;
		int parseInt = Integer.parseInt(emp_id);
		return parseInt;
	}
	
	@RequestMapping("toCheckTimeAll.do")
	public String toCheckAll() {
		return "checkOnWork/allCheck";
	}
	
	@RequestMapping("doCheck.do")
	@ResponseBody
	public AjaxResult doCheck(HttpServletRequest request) {
		AjaxResult result = new AjaxResult();
		int tag = -1;
		int returnEmpId = returnEmpId(request);
		tag = ckService.insertCheckTime(returnEmpId);
		result.setTag(tag);
		if(tag == 1) {
			result.setMessage("打卡成功");
		}else if(tag == 99) {
			result.setMessage("打卡成功,你迟到了");
		}else if(tag == 93){
			result.setMessage("打卡成功,早退打卡,若为误打卡请在正确的时间再打一次!");
		}else {
			result.setMessage("打卡失败,请重试!");
		}
		return result;
	}
	
	@RequestMapping("checkTimeSeP.do")
	@ResponseBody
	public DataTables checkTimeSeP(HttpServletRequest request) {
		DataTables dt = new DataTables();
		int returnEmpId = returnEmpId(request);
		List<CheckTime> searchCheckTimeByEmp = ckService.searchCheckTimeByEmp(returnEmpId);
		int countByEmp = ckService.searchCheckTimeCountByEmp(returnEmpId);
		dt.setRecordsFiltered(countByEmp);
		dt.setRecordsTotal(countByEmp);
		dt.setData(searchCheckTimeByEmp);
		return dt;
	}
	
	@RequestMapping("checkTimeAll.do")
	@ResponseBody
	public DataTables checkTimeAll(CheckTime ck, int start, int length) {
		System.out.println(ck);
		List<CheckTime> searchCheckTimeByTime = ckService.searchCheckTimeByCondition(ck,start,length);
		int searchCountAll = (int)ckService.searchCountByCondition(ck);
		DataTables dt = new DataTables();
		dt.setData(searchCheckTimeByTime);
		dt.setRecordsFiltered(searchCountAll);
		dt.setRecordsTotal(searchCountAll);
		return dt;
	}
	
	@RequestMapping("exprotExcel.do")
	@ResponseBody
	public AjaxResult exportExcel(CheckTime ck,HttpServletResponse res) {
		AjaxResult result =  new AjaxResult();
		SimpleDateFormat dft = new SimpleDateFormat("yyyyMMddHHmm");
		Date dt = new Date();
		String address = "C:\\CheckTimeFile\\"+"CheckTime"+dft.format(dt)+".xls";
		String fileName = "CheckTime"+dft.format(dt)+".xls";
		List<CheckTime> list = ckService.searchCheckTimeByConditionAll(ck);
		HSSFWorkbook excel = ckService.exportToExcel(list,res);
		FileOutputStream fos;
		try {
			/**
			 * 服务端保存文件
			 */
			fos= new FileOutputStream(address);
			excel.write(fos);
			excel.close();							
			/**
			 * 客户端
			 */
			res.setHeader("Content-disposition", "attachment;filename=" +
			 new String(fileName.getBytes("gb2312"), "ISO8859-1"));
            res.setContentType("application/vnd.ms-excel");
            OutputStream outputStream = res.getOutputStream();
            excel.write(outputStream);
            outputStream.flush();
            outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setMessage("文件生成失败,请重试");
		} catch (IOException e) {
			result.setMessage("文件生成失败,请重试");
			e.printStackTrace();
		}
		System.out.println("导出成功");
		result.setMessage("文件生成成功");
		return result;
	}
}
