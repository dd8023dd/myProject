package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class ApprovalExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalExample() {
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

        public Criteria andApprovalIdIsNull() {
            addCriterion("approval_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIdIsNotNull() {
            addCriterion("approval_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalIdEqualTo(Integer value) {
            addCriterion("approval_id =", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdNotEqualTo(Integer value) {
            addCriterion("approval_id <>", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdGreaterThan(Integer value) {
            addCriterion("approval_id >", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_id >=", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdLessThan(Integer value) {
            addCriterion("approval_id <", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_id <=", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdIn(List<Integer> values) {
            addCriterion("approval_id in", values, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdNotIn(List<Integer> values) {
            addCriterion("approval_id not in", values, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_id between", value1, value2, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_id not between", value1, value2, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIsNull() {
            addCriterion("approval_type is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIsNotNull() {
            addCriterion("approval_type is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeEqualTo(String value) {
            addCriterion("approval_type =", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotEqualTo(String value) {
            addCriterion("approval_type <>", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeGreaterThan(String value) {
            addCriterion("approval_type >", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("approval_type >=", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLessThan(String value) {
            addCriterion("approval_type <", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLessThanOrEqualTo(String value) {
            addCriterion("approval_type <=", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLike(String value) {
            addCriterion("approval_type like", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotLike(String value) {
            addCriterion("approval_type not like", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIn(List<String> values) {
            addCriterion("approval_type in", values, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotIn(List<String> values) {
            addCriterion("approval_type not in", values, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeBetween(String value1, String value2) {
            addCriterion("approval_type between", value1, value2, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotBetween(String value1, String value2) {
            addCriterion("approval_type not between", value1, value2, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelIsNull() {
            addCriterion("approval_level is null");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelIsNotNull() {
            addCriterion("approval_level is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelEqualTo(Integer value) {
            addCriterion("approval_level =", value, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelNotEqualTo(Integer value) {
            addCriterion("approval_level <>", value, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelGreaterThan(Integer value) {
            addCriterion("approval_level >", value, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_level >=", value, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelLessThan(Integer value) {
            addCriterion("approval_level <", value, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelLessThanOrEqualTo(Integer value) {
            addCriterion("approval_level <=", value, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelIn(List<Integer> values) {
            addCriterion("approval_level in", values, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelNotIn(List<Integer> values) {
            addCriterion("approval_level not in", values, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelBetween(Integer value1, Integer value2) {
            addCriterion("approval_level between", value1, value2, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_level not between", value1, value2, "approvalLevel");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(Integer value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(Integer value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(Integer value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(Integer value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<Integer> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<Integer> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(Integer value1, Integer value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalNoIsNull() {
            addCriterion("approval_no is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNoIsNotNull() {
            addCriterion("approval_no is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNoEqualTo(String value) {
            addCriterion("approval_no =", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotEqualTo(String value) {
            addCriterion("approval_no <>", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoGreaterThan(String value) {
            addCriterion("approval_no >", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoGreaterThanOrEqualTo(String value) {
            addCriterion("approval_no >=", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoLessThan(String value) {
            addCriterion("approval_no <", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoLessThanOrEqualTo(String value) {
            addCriterion("approval_no <=", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoLike(String value) {
            addCriterion("approval_no like", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotLike(String value) {
            addCriterion("approval_no not like", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoIn(List<String> values) {
            addCriterion("approval_no in", values, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotIn(List<String> values) {
            addCriterion("approval_no not in", values, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoBetween(String value1, String value2) {
            addCriterion("approval_no between", value1, value2, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotBetween(String value1, String value2) {
            addCriterion("approval_no not between", value1, value2, "approvalNo");
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