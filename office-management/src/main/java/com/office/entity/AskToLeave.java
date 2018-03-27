package com.office.entity;

import java.util.Date;

public class AskToLeave {
    private Integer leaveId;

    private Integer empId;

    private Date leaveTimeStart;

    private Integer leaveTime;

    private String leaveEvidence;

    private String leaveReason;

    private Date leaveTimeEnd;

    private Integer approvalId;

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

    public Date getLeaveTimeStart() {
        return leaveTimeStart;
    }

    public void setLeaveTimeStart(Date leaveTimeStart) {
        this.leaveTimeStart = leaveTimeStart;
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

    public Date getLeaveTimeEnd() {
        return leaveTimeEnd;
    }

    public void setLeaveTimeEnd(Date leaveTimeEnd) {
        this.leaveTimeEnd = leaveTimeEnd;
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }
}