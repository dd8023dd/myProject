package com.office.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;
    
	protected List<Criteria> oredCriteria;

    public EmployeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpBirthIsNull() {
            addCriterion("emp_birth is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthIsNotNull() {
            addCriterion("emp_birth is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birth =", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birth <>", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_birth >", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birth >=", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthLessThan(Date value) {
            addCriterionForJDBCDate("emp_birth <", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birth <=", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthIn(List<Date> values) {
            addCriterionForJDBCDate("emp_birth in", values, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_birth not in", values, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_birth between", value1, value2, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_birth not between", value1, value2, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateIsNull() {
            addCriterion("emp_hiredate is null");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateIsNotNull() {
            addCriterion("emp_hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateEqualTo(Date value) {
            addCriterionForJDBCDate("emp_hiredate =", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_hiredate <>", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_hiredate >", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_hiredate >=", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateLessThan(Date value) {
            addCriterionForJDBCDate("emp_hiredate <", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_hiredate <=", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateIn(List<Date> values) {
            addCriterionForJDBCDate("emp_hiredate in", values, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_hiredate not in", values, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_hiredate between", value1, value2, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_hiredate not between", value1, value2, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNull() {
            addCriterion("emp_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNotNull() {
            addCriterion("emp_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressEqualTo(String value) {
            addCriterion("emp_address =", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotEqualTo(String value) {
            addCriterion("emp_address <>", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThan(String value) {
            addCriterion("emp_address >", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_address >=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThan(String value) {
            addCriterion("emp_address <", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_address <=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLike(String value) {
            addCriterion("emp_address like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotLike(String value) {
            addCriterion("emp_address not like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIn(List<String> values) {
            addCriterion("emp_address in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotIn(List<String> values) {
            addCriterion("emp_address not in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressBetween(String value1, String value2) {
            addCriterion("emp_address between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotBetween(String value1, String value2) {
            addCriterion("emp_address not between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiIsNull() {
            addCriterion("emp_depti is null");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiIsNotNull() {
            addCriterion("emp_depti is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiEqualTo(Integer value) {
            addCriterion("emp_depti =", value, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiNotEqualTo(Integer value) {
            addCriterion("emp_depti <>", value, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiGreaterThan(Integer value) {
            addCriterion("emp_depti >", value, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_depti >=", value, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiLessThan(Integer value) {
            addCriterion("emp_depti <", value, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiLessThanOrEqualTo(Integer value) {
            addCriterion("emp_depti <=", value, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiIn(List<Integer> values) {
            addCriterion("emp_depti in", values, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiNotIn(List<Integer> values) {
            addCriterion("emp_depti not in", values, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiBetween(Integer value1, Integer value2) {
            addCriterion("emp_depti between", value1, value2, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpDeptiNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_depti not between", value1, value2, "empDepti");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNull() {
            addCriterion("emp_email is null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNotNull() {
            addCriterion("emp_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailEqualTo(String value) {
            addCriterion("emp_email =", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotEqualTo(String value) {
            addCriterion("emp_email <>", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThan(String value) {
            addCriterion("emp_email >", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("emp_email >=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThan(String value) {
            addCriterion("emp_email <", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThanOrEqualTo(String value) {
            addCriterion("emp_email <=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLike(String value) {
            addCriterion("emp_email like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotLike(String value) {
            addCriterion("emp_email not like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIn(List<String> values) {
            addCriterion("emp_email in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotIn(List<String> values) {
            addCriterion("emp_email not in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailBetween(String value1, String value2) {
            addCriterion("emp_email between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotBetween(String value1, String value2) {
            addCriterion("emp_email not between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumIsNull() {
            addCriterion("emp_phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumIsNotNull() {
            addCriterion("emp_phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumEqualTo(String value) {
            addCriterion("emp_phoneNum =", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumNotEqualTo(String value) {
            addCriterion("emp_phoneNum <>", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumGreaterThan(String value) {
            addCriterion("emp_phoneNum >", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("emp_phoneNum >=", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumLessThan(String value) {
            addCriterion("emp_phoneNum <", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumLessThanOrEqualTo(String value) {
            addCriterion("emp_phoneNum <=", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumLike(String value) {
            addCriterion("emp_phoneNum like", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumNotLike(String value) {
            addCriterion("emp_phoneNum not like", value, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumIn(List<String> values) {
            addCriterion("emp_phoneNum in", values, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumNotIn(List<String> values) {
            addCriterion("emp_phoneNum not in", values, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumBetween(String value1, String value2) {
            addCriterion("emp_phoneNum between", value1, value2, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPhonenumNotBetween(String value1, String value2) {
            addCriterion("emp_phoneNum not between", value1, value2, "empPhonenum");
            return (Criteria) this;
        }

        public Criteria andEmpPosIsNull() {
            addCriterion("emp_pos is null");
            return (Criteria) this;
        }

        public Criteria andEmpPosIsNotNull() {
            addCriterion("emp_pos is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPosEqualTo(Integer value) {
            addCriterion("emp_pos =", value, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosNotEqualTo(Integer value) {
            addCriterion("emp_pos <>", value, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosGreaterThan(Integer value) {
            addCriterion("emp_pos >", value, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_pos >=", value, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosLessThan(Integer value) {
            addCriterion("emp_pos <", value, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosLessThanOrEqualTo(Integer value) {
            addCriterion("emp_pos <=", value, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosIn(List<Integer> values) {
            addCriterion("emp_pos in", values, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosNotIn(List<Integer> values) {
            addCriterion("emp_pos not in", values, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosBetween(Integer value1, Integer value2) {
            addCriterion("emp_pos between", value1, value2, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpPosNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_pos not between", value1, value2, "empPos");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIsNull() {
            addCriterion("emp_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIsNotNull() {
            addCriterion("emp_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmpGenderEqualTo(Integer value) {
            addCriterion("emp_gender =", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotEqualTo(Integer value) {
            addCriterion("emp_gender <>", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderGreaterThan(Integer value) {
            addCriterion("emp_gender >", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_gender >=", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLessThan(Integer value) {
            addCriterion("emp_gender <", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLessThanOrEqualTo(Integer value) {
            addCriterion("emp_gender <=", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIn(List<Integer> values) {
            addCriterion("emp_gender in", values, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotIn(List<Integer> values) {
            addCriterion("emp_gender not in", values, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderBetween(Integer value1, Integer value2) {
            addCriterion("emp_gender between", value1, value2, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_gender not between", value1, value2, "empGender");
            return (Criteria) this;
        }

        public Criteria andB1IsNull() {
            addCriterion("b1 is null");
            return (Criteria) this;
        }

        public Criteria andB1IsNotNull() {
            addCriterion("b1 is not null");
            return (Criteria) this;
        }

        public Criteria andB1EqualTo(String value) {
            addCriterion("b1 =", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotEqualTo(String value) {
            addCriterion("b1 <>", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThan(String value) {
            addCriterion("b1 >", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThanOrEqualTo(String value) {
            addCriterion("b1 >=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThan(String value) {
            addCriterion("b1 <", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThanOrEqualTo(String value) {
            addCriterion("b1 <=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1Like(String value) {
            addCriterion("b1 like", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotLike(String value) {
            addCriterion("b1 not like", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1In(List<String> values) {
            addCriterion("b1 in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotIn(List<String> values) {
            addCriterion("b1 not in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1Between(String value1, String value2) {
            addCriterion("b1 between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotBetween(String value1, String value2) {
            addCriterion("b1 not between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB2IsNull() {
            addCriterion("b2 is null");
            return (Criteria) this;
        }

        public Criteria andB2IsNotNull() {
            addCriterion("b2 is not null");
            return (Criteria) this;
        }

        public Criteria andB2EqualTo(String value) {
            addCriterion("b2 =", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotEqualTo(String value) {
            addCriterion("b2 <>", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2GreaterThan(String value) {
            addCriterion("b2 >", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2GreaterThanOrEqualTo(String value) {
            addCriterion("b2 >=", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2LessThan(String value) {
            addCriterion("b2 <", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2LessThanOrEqualTo(String value) {
            addCriterion("b2 <=", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2Like(String value) {
            addCriterion("b2 like", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotLike(String value) {
            addCriterion("b2 not like", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2In(List<String> values) {
            addCriterion("b2 in", values, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotIn(List<String> values) {
            addCriterion("b2 not in", values, "b2");
            return (Criteria) this;
        }

        public Criteria andB2Between(String value1, String value2) {
            addCriterion("b2 between", value1, value2, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotBetween(String value1, String value2) {
            addCriterion("b2 not between", value1, value2, "b2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}