package com.office.entity;

public class ApprovalGroup {
    private Integer approvalGroupId;

    private Integer approvalGroupEmpid;
    private Employee emp;
    public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Integer getApprovalGroupId() {
        return approvalGroupId;
    }

    public void setApprovalGroupId(Integer approvalGroupId) {
        this.approvalGroupId = approvalGroupId;
    }

    public Integer getApprovalGroupEmpid() {
        return approvalGroupEmpid;
    }

    public void setApprovalGroupEmpid(Integer approvalGroupEmpid) {
        this.approvalGroupEmpid = approvalGroupEmpid;
    }
}