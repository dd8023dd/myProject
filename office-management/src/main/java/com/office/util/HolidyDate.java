package com.office.util;

import java.util.List;

public class HolidyDate {
	
 
	List<String> holidyList;
 
	public HolidyDate(){
		holidyList.add("0101");
		holidyList.add("0102");
		holidyList.add("0103");
		holidyList.add("0501");
		holidyList.add("0502");
		holidyList.add("0503");
		holidyList.add("0504");
		holidyList.add("0505");
		holidyList.add("0506");
		holidyList.add("0507");
		holidyList.add("1001");
		holidyList.add("1002");
		holidyList.add("1003");
		holidyList.add("1004");
		holidyList.add("1005");
		holidyList.add("1006");
		holidyList.add("1007");
	}
	public List<String> getHolidyList(){
		return holidyList;
	}
}
