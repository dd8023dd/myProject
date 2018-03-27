package com.office.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private Integer empId;

    private String empNo;

    private Date empBirth;

    private String empBirthS;
    
    private Depts dept;
    
    public Depts getDept() {
		return dept;
	}

	public void setDept(Depts dept) {
		this.dept = dept;
	}

	private String empHiredateS;
    public String getEmpBirthS() {
    	SimpleDateFormat dt  = new SimpleDateFormat("yyyy-MM-dd");
    	empBirthS = dt.format(empBirth);
		return empBirthS;
	}

	public void setEmpBirthS(String empBirthS) {
		this.empBirthS = empBirthS;
	}

	public String getEmpHiredateS() {
	 	SimpleDateFormat dt  = new SimpleDateFormat("yyyy-MM-dd");
	 	empHiredateS = dt.format(empHiredate);
		return empHiredateS;
	}

	public void setEmpHiredateS(String empHiredateS) {
		this.empHiredateS = empHiredateS;
	}

	private Date empHiredate;

    private String empName;

    private String empAddress;

    private Integer empDepti;

    private String empEmail;

    private String empPhonenum;

    private Integer empPos;

    private Integer empGender;

    private String b1;

    private String b2;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public Date getEmpBirth() {
        return empBirth;
    }

    public void setEmpBirth(Date empBirth) {
        this.empBirth = empBirth;
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress == null ? null : empAddress.trim();
    }

    public Integer getEmpDepti() {
        return empDepti;
    }

    public void setEmpDepti(Integer empDepti) {
        this.empDepti = empDepti;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public String getEmpPhonenum() {
        return empPhonenum;
    }

    public void setEmpPhonenum(String empPhonenum) {
        this.empPhonenum = empPhonenum == null ? null : empPhonenum.trim();
    }

    public Integer getEmpPos() {
        return empPos;
    }

    public void setEmpPos(Integer empPos) {
        this.empPos = empPos;
    }

    public Integer getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Integer empGender) {
        this.empGender = empGender;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1 == null ? null : b1.trim();
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2 == null ? null : b2.trim();
    }
}