package com.office.entity;

public class CheckTimeStatistics {
    private Integer checkTimeStatisticsId;

    private Integer checkTimeEmpid;

    private Integer checkTimeStatisticsDay;

    private Integer leaveDay;

    private Integer absenteeism;

    private Integer outTime;

    private Double salary;

    public Integer getCheckTimeStatisticsId() {
        return checkTimeStatisticsId;
    }

    public void setCheckTimeStatisticsId(Integer checkTimeStatisticsId) {
        this.checkTimeStatisticsId = checkTimeStatisticsId;
    }

    public Integer getCheckTimeEmpid() {
        return checkTimeEmpid;
    }

    public void setCheckTimeEmpid(Integer checkTimeEmpid) {
        this.checkTimeEmpid = checkTimeEmpid;
    }

    public Integer getCheckTimeStatisticsDay() {
        return checkTimeStatisticsDay;
    }

    public void setCheckTimeStatisticsDay(Integer checkTimeStatisticsDay) {
        this.checkTimeStatisticsDay = checkTimeStatisticsDay;
    }

    public Integer getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(Integer leaveDay) {
        this.leaveDay = leaveDay;
    }

    public Integer getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(Integer absenteeism) {
        this.absenteeism = absenteeism;
    }

    public Integer getOutTime() {
        return outTime;
    }

    public void setOutTime(Integer outTime) {
        this.outTime = outTime;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}