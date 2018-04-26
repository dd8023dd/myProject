package com.office.entity;

public class CheckTime {
    private Integer checkTimeId;

    private String checkTimeData;

    private Integer checkTimeEmpid;

    private Integer checkTimeOut;

    private String checkTimeFirst;

    private String checkTimeLeave;

    private Employee emp;
    
    public String getEmpName() {
		return emp.getEmpName();
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Integer getCheckTimeId() {
        return checkTimeId;
    }

    public void setCheckTimeId(Integer checkTimeId) {
        this.checkTimeId = checkTimeId;
    }

    public String getCheckTimeData() {
        return checkTimeData;
    }

    public void setCheckTimeData(String checkTimeData) {
        this.checkTimeData = checkTimeData == null ? null : checkTimeData.trim();
    }

    public Integer getCheckTimeEmpid() {
        return checkTimeEmpid;
    }

    public void setCheckTimeEmpid(Integer checkTimeEmpid) {
        this.checkTimeEmpid = checkTimeEmpid;
    }

    public Integer getCheckTimeOut() {
        return checkTimeOut;
    }

    public void setCheckTimeOut(Integer checkTimeOut) {
        this.checkTimeOut = checkTimeOut;
    }

    public String getCheckTimeFirst() {
        return checkTimeFirst;
    }

    public void setCheckTimeFirst(String checkTimeFirst) {
        this.checkTimeFirst = checkTimeFirst == null ? null : checkTimeFirst.trim();
    }

    public String getCheckTimeLeave() {
        return checkTimeLeave;
    }

    public void setCheckTimeLeave(String checkTimeLeave) {
        this.checkTimeLeave = checkTimeLeave == null ? null : checkTimeLeave.trim();
    }

	@Override
	public String toString() {
		return "打卡签到表 [打卡日期=" + checkTimeData + ", 打卡员工=" + checkTimeEmpid + ", 打卡状态="
				+ checkTimeOut + "]";
	}
    
}