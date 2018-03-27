package com.office.service;



import java.util.List;

import com.office.entity.Employee;
/*
 *员工service接口 
 */
public interface EmployeeService {
	
	public int addEmployees(Employee emp);
	public int modifyEmployees(Employee emp);
	public int removeEmployees(int emp_id);
	public List<Employee> searchEmpByExample(Employee emp);
	public List<Employee> searchEmpByPage(Employee emp,int start,int length);
	public int searchEmpPageCount(Employee emp);
	public Employee searchById(int id);
}
