package com.office.entity;

public class ExtraWork extends ApprovalGroupMember{
    private Integer extraWorkId;

    private Integer empId;

    private String extraWorkTime;

    private Integer isHolidy;

    private Integer approvalId;

    private String time;
    
    private Employee emp;
    private Approval approval;

    public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Approval getApproval() {
		return approval;
	}

	public void setApproval(Approval approval) {
		this.approval = approval;
	}

	public Integer getExtraWorkId() {
        return extraWorkId;
    }

    public void setExtraWorkId(Integer extraWorkId) {
        this.extraWorkId = extraWorkId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getExtraWorkTime() {
        return extraWorkTime;
    }

    public void setExtraWorkTime(String extraWorkTime) {
        this.extraWorkTime = extraWorkTime == null ? null : extraWorkTime.trim();
    }

    public Integer getIsHolidy() {
        return isHolidy;
    }

    public void setIsHolidy(Integer isHolidy) {
        this.isHolidy = isHolidy;
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}