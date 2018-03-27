package com.office.entity;

public class ExtraWork {
    private Integer extraWorkId;

    private Integer empId;

    private String extraWorkTime;

    private Integer isHolidy;

    private Integer approvalId;

    private String time;

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