package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class ApprovalMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalMemberExample() {
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

        public Criteria andApprovalMemberIdIsNull() {
            addCriterion("approval_member_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdIsNotNull() {
            addCriterion("approval_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdEqualTo(Integer value) {
            addCriterion("approval_member_id =", value, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdNotEqualTo(Integer value) {
            addCriterion("approval_member_id <>", value, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdGreaterThan(Integer value) {
            addCriterion("approval_member_id >", value, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_member_id >=", value, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdLessThan(Integer value) {
            addCriterion("approval_member_id <", value, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_member_id <=", value, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdIn(List<Integer> values) {
            addCriterion("approval_member_id in", values, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdNotIn(List<Integer> values) {
            addCriterion("approval_member_id not in", values, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_member_id between", value1, value2, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_member_id not between", value1, value2, "approvalMemberId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdIsNull() {
            addCriterion("approval_accpeter_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdIsNotNull() {
            addCriterion("approval_accpeter_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdEqualTo(Integer value) {
            addCriterion("approval_accpeter_id =", value, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdNotEqualTo(Integer value) {
            addCriterion("approval_accpeter_id <>", value, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdGreaterThan(Integer value) {
            addCriterion("approval_accpeter_id >", value, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_accpeter_id >=", value, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdLessThan(Integer value) {
            addCriterion("approval_accpeter_id <", value, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_accpeter_id <=", value, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdIn(List<Integer> values) {
            addCriterion("approval_accpeter_id in", values, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdNotIn(List<Integer> values) {
            addCriterion("approval_accpeter_id not in", values, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_accpeter_id between", value1, value2, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalAccpeterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_accpeter_id not between", value1, value2, "approvalAccpeterId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdIsNull() {
            addCriterion("approval_sender_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdIsNotNull() {
            addCriterion("approval_sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdEqualTo(Integer value) {
            addCriterion("approval_sender_id =", value, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdNotEqualTo(Integer value) {
            addCriterion("approval_sender_id <>", value, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdGreaterThan(Integer value) {
            addCriterion("approval_sender_id >", value, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_sender_id >=", value, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdLessThan(Integer value) {
            addCriterion("approval_sender_id <", value, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_sender_id <=", value, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdIn(List<Integer> values) {
            addCriterion("approval_sender_id in", values, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdNotIn(List<Integer> values) {
            addCriterion("approval_sender_id not in", values, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_sender_id between", value1, value2, "approvalSenderId");
            return (Criteria) this;
        }

        public Criteria andApprovalSenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_sender_id not between", value1, value2, "approvalSenderId");
            return (Criteria) this;
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