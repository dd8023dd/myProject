package com.office.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.Employee;
import com.office.service.EmployeeService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

@Controller
@RequestMapping("employee/")
public class EmployeeControl {
	
	@Autowired
	private EmployeeService empservice;
	
	@RequestMapping("toAddEmp.do")
	public String toAddEmp() {
		return "employee/addEmployee";
	}
	
	@RequestMapping("toEmpPhone.do")
	public String toEmpPhone() {
		return "employee/empPhone";
	}
	
	@RequestMapping("toModifyEmp.do")
	public String toModifyEmp() {
		return "employee/modifyEmployee";
	}
	
	
	@RequestMapping("addEmp.do")
	@ResponseBody
	public AjaxResult addEmp(Employee emp) {
		Employee empc = changeDate(emp);
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = empservice.addEmployees(empc);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"添加成功":"添加失败");
		return ajaxresult;
	}
	
	public Employee changeDate(Employee emp) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			try {
				if(emp.getB1() != null && !"".equals(emp.getB1())) {
					Date empBirth = fmt.parse(emp.getB1());//b1b2为备注字段,这边用来作为转换日期格式作用
					emp.setEmpBirth(empBirth);
				}
				if(emp.getB2() != null && !"".equals(emp.getB2())) {
					Date empHiredate = fmt.parse(emp.getB2());
					emp.setEmpHiredate(empHiredate);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return emp;
	}
	
	@RequestMapping("delEmp.do")
	@ResponseBody
	public AjaxResult delEmp(int id) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = empservice.removeEmployees(id);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"删除成功":"删除失败");
		return ajaxresult;
	}
	
	@RequestMapping("modifyEmp.do")
	@ResponseBody
	public AjaxResult modifyEmp(Employee emp) {
		Employee empc = changeDate(emp);
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = empservice.modifyEmployees(empc);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"修改成功":"修改失败");
		return ajaxresult;
	}
	
	@RequestMapping("empTable.do")
	public String empTable() {
		return "employee/empTable";
	}
	
	@RequestMapping("empPage.do")
	@ResponseBody
	public DataTables empPage(Employee emp,int start,int length) {
		DataTables dt = new DataTables();
		List<Employee> list = empservice.searchEmpByPage(emp, start, length);
		int count = empservice.searchEmpPageCount(emp);
		dt.setData(list);
		dt.setRecordsTotal(count);
		dt.setRecordsFiltered(count);
		return dt;
	}
}