package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andAuthorityIdIsNull() {
            addCriterion("\"authority _id\" is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("\"authority _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Integer value) {
            addCriterion("\"authority _id\" =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Integer value) {
            addCriterion("\"authority _id\" <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Integer value) {
            addCriterion("\"authority _id\" >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"authority _id\" >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Integer value) {
            addCriterion("\"authority _id\" <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"authority _id\" <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Integer> values) {
            addCriterion("\"authority _id\" in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Integer> values) {
            addCriterion("\"authority _id\" not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("\"authority _id\" between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"authority _id\" not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpIsNull() {
            addCriterion("authority_emp is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpIsNotNull() {
            addCriterion("authority_emp is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpEqualTo(Integer value) {
            addCriterion("authority_emp =", value, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpNotEqualTo(Integer value) {
            addCriterion("authority_emp <>", value, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpGreaterThan(Integer value) {
            addCriterion("authority_emp >", value, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_emp >=", value, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpLessThan(Integer value) {
            addCriterion("authority_emp <", value, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpLessThanOrEqualTo(Integer value) {
            addCriterion("authority_emp <=", value, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpIn(List<Integer> values) {
            addCriterion("authority_emp in", values, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpNotIn(List<Integer> values) {
            addCriterion("authority_emp not in", values, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpBetween(Integer value1, Integer value2) {
            addCriterion("authority_emp between", value1, value2, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityEmpNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_emp not between", value1, value2, "authorityEmp");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptIsNull() {
            addCriterion("authority_dept is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptIsNotNull() {
            addCriterion("authority_dept is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptEqualTo(Integer value) {
            addCriterion("authority_dept =", value, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptNotEqualTo(Integer value) {
            addCriterion("authority_dept <>", value, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptGreaterThan(Integer value) {
            addCriterion("authority_dept >", value, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_dept >=", value, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptLessThan(Integer value) {
            addCriterion("authority_dept <", value, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptLessThanOrEqualTo(Integer value) {
            addCriterion("authority_dept <=", value, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptIn(List<Integer> values) {
            addCriterion("authority_dept in", values, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptNotIn(List<Integer> values) {
            addCriterion("authority_dept not in", values, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptBetween(Integer value1, Integer value2) {
            addCriterion("authority_dept between", value1, value2, "authorityDept");
            return (Criteria) this;
        }

        public Criteria andAuthorityDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_dept not between", value1, value2, "authorityDept");
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