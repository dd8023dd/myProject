package com.office.entity;

public class AskToLeave {
    private Integer leaveId;

    private Integer empId;

    private String leaveTimeStart;

    private Integer leaveTime;

    private String leaveEvidence;

    private String leaveReason;

    private String leaveTimeEnd;

    private Integer approvalId;
    
    private Approval approval;
    private Employee emp;
    
    
    public Approval getApproval() {
		return approval;
	}

	public void setApproval(Approval approval) {
		this.approval = approval;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getLeaveTimeStart() {
        return leaveTimeStart;
    }

    public void setLeaveTimeStart(String leaveTimeStart) {
        this.leaveTimeStart = leaveTimeStart == null ? null : leaveTimeStart.trim();
    }

    public Integer getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Integer leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLeaveEvidence() {
        return leaveEvidence;
    }

    public void setLeaveEvidence(String leaveEvidence) {
        this.leaveEvidence = leaveEvidence == null ? null : leaveEvidence.trim();
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason == null ? null : leaveReason.trim();
    }

    public String getLeaveTimeEnd() {
        return leaveTimeEnd;
    }

    public void setLeaveTimeEnd(String leaveTimeEnd) {
        this.leaveTimeEnd = leaveTimeEnd == null ? null : leaveTimeEnd.trim();
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }
}