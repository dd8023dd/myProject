package com.office.entity;

public class User {
    private Integer userId;

    private String userPassword;

    private String userName;

    private Integer bindEmp;
    
    private Employee emp;
    
    public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getBindEmp() {
        return bindEmp;
    }

    public void setBindEmp(Integer bindEmp) {
        this.bindEmp = bindEmp;
    }
}