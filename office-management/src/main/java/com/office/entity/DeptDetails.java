package com.office.entity;

public class DeptDetails {
    private Integer deptDetailId;

    private Integer deptId;

    private String deptEmp;

    private String deptManager;

    private String deptImg;

    public Integer getDeptDetailId() {
        return deptDetailId;
    }

    public void setDeptDetailId(Integer deptDetailId) {
        this.deptDetailId = deptDetailId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptEmp() {
        return deptEmp;
    }

    public void setDeptEmp(String deptEmp) {
        this.deptEmp = deptEmp == null ? null : deptEmp.trim();
    }

    public String getDeptManager() {
        return deptManager;
    }

    public void setDeptManager(String deptManager) {
        this.deptManager = deptManager == null ? null : deptManager.trim();
    }

    public String getDeptImg() {
        return deptImg;
    }

    public void setDeptImg(String deptImg) {
        this.deptImg = deptImg == null ? null : deptImg.trim();
    }
}