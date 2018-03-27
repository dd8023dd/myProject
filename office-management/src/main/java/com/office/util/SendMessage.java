package com.office.util;


/**
 * @author zhangmj
 * @date 2018年2月28日
 */
public class SendMessage {
	
	/*
	 * 发送信息
	 * @return 1:成功 0:失败
	 */
	public int SendMessageToEmp(int Emp_id,String content) {
		return 0;
	}
	
	/*
	 * 发送失败则发送第二次
	 */
	public int SendMessageToEmp(String emp_list,String content) {
		int res = -1;
		String[] split = emp_list.split(",");
		for (String string : split) {
			res = SendMessageToEmp(Integer.parseInt(string),content);
			if(res>=1) {
				continue;
			}else {
				SendMessageToEmp(Integer.parseInt(string),content);
				continue;
			}
		}
		return 0;
	}

}
