package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class ApprovalGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalGroupExample() {
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

        public Criteria andApprovalGroupIdIsNull() {
            addCriterion("approval_group_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdIsNotNull() {
            addCriterion("approval_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdEqualTo(Integer value) {
            addCriterion("approval_group_id =", value, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdNotEqualTo(Integer value) {
            addCriterion("approval_group_id <>", value, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdGreaterThan(Integer value) {
            addCriterion("approval_group_id >", value, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_group_id >=", value, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdLessThan(Integer value) {
            addCriterion("approval_group_id <", value, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_group_id <=", value, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdIn(List<Integer> values) {
            addCriterion("approval_group_id in", values, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdNotIn(List<Integer> values) {
            addCriterion("approval_group_id not in", values, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_group_id between", value1, value2, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_group_id not between", value1, value2, "approvalGroupId");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidIsNull() {
            addCriterion("approval_group_empId is null");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidIsNotNull() {
            addCriterion("approval_group_empId is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidEqualTo(Integer value) {
            addCriterion("approval_group_empId =", value, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidNotEqualTo(Integer value) {
            addCriterion("approval_group_empId <>", value, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidGreaterThan(Integer value) {
            addCriterion("approval_group_empId >", value, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_group_empId >=", value, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidLessThan(Integer value) {
            addCriterion("approval_group_empId <", value, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("approval_group_empId <=", value, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidIn(List<Integer> values) {
            addCriterion("approval_group_empId in", values, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidNotIn(List<Integer> values) {
            addCriterion("approval_group_empId not in", values, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidBetween(Integer value1, Integer value2) {
            addCriterion("approval_group_empId between", value1, value2, "approvalGroupEmpid");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_group_empId not between", value1, value2, "approvalGroupEmpid");
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