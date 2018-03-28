package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class AskToLeaveExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AskToLeaveExample() {
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

        public Criteria andLeaveIdIsNull() {
            addCriterion("leave_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("leave_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(Integer value) {
            addCriterion("leave_id =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(Integer value) {
            addCriterion("leave_id <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(Integer value) {
            addCriterion("leave_id >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_id >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(Integer value) {
            addCriterion("leave_id <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("leave_id <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<Integer> values) {
            addCriterion("leave_id in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<Integer> values) {
            addCriterion("leave_id not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(Integer value1, Integer value2) {
            addCriterion("leave_id between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_id not between", value1, value2, "leaveId");
            return (Criteria) this;
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

        public Criteria andLeaveTimeStartIsNull() {
            addCriterion("leave_time_start is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartIsNotNull() {
            addCriterion("leave_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartEqualTo(String value) {
            addCriterion("leave_time_start =", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartNotEqualTo(String value) {
            addCriterion("leave_time_start <>", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartGreaterThan(String value) {
            addCriterion("leave_time_start >", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time_start >=", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartLessThan(String value) {
            addCriterion("leave_time_start <", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartLessThanOrEqualTo(String value) {
            addCriterion("leave_time_start <=", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartLike(String value) {
            addCriterion("leave_time_start like", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartNotLike(String value) {
            addCriterion("leave_time_start not like", value, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartIn(List<String> values) {
            addCriterion("leave_time_start in", values, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartNotIn(List<String> values) {
            addCriterion("leave_time_start not in", values, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartBetween(String value1, String value2) {
            addCriterion("leave_time_start between", value1, value2, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStartNotBetween(String value1, String value2) {
            addCriterion("leave_time_start not between", value1, value2, "leaveTimeStart");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Integer value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Integer value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Integer value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Integer value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Integer> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Integer> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Integer value1, Integer value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceIsNull() {
            addCriterion("leave_evidence is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceIsNotNull() {
            addCriterion("leave_evidence is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceEqualTo(String value) {
            addCriterion("leave_evidence =", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceNotEqualTo(String value) {
            addCriterion("leave_evidence <>", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceGreaterThan(String value) {
            addCriterion("leave_evidence >", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceGreaterThanOrEqualTo(String value) {
            addCriterion("leave_evidence >=", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceLessThan(String value) {
            addCriterion("leave_evidence <", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceLessThanOrEqualTo(String value) {
            addCriterion("leave_evidence <=", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceLike(String value) {
            addCriterion("leave_evidence like", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceNotLike(String value) {
            addCriterion("leave_evidence not like", value, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceIn(List<String> values) {
            addCriterion("leave_evidence in", values, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceNotIn(List<String> values) {
            addCriterion("leave_evidence not in", values, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceBetween(String value1, String value2) {
            addCriterion("leave_evidence between", value1, value2, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveEvidenceNotBetween(String value1, String value2) {
            addCriterion("leave_evidence not between", value1, value2, "leaveEvidence");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNull() {
            addCriterion("leave_reason is null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNotNull() {
            addCriterion("leave_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonEqualTo(String value) {
            addCriterion("leave_reason =", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotEqualTo(String value) {
            addCriterion("leave_reason <>", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThan(String value) {
            addCriterion("leave_reason >", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("leave_reason >=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThan(String value) {
            addCriterion("leave_reason <", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThanOrEqualTo(String value) {
            addCriterion("leave_reason <=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLike(String value) {
            addCriterion("leave_reason like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotLike(String value) {
            addCriterion("leave_reason not like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIn(List<String> values) {
            addCriterion("leave_reason in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotIn(List<String> values) {
            addCriterion("leave_reason not in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonBetween(String value1, String value2) {
            addCriterion("leave_reason between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotBetween(String value1, String value2) {
            addCriterion("leave_reason not between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndIsNull() {
            addCriterion("leave_time_end is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndIsNotNull() {
            addCriterion("leave_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndEqualTo(String value) {
            addCriterion("leave_time_end =", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndNotEqualTo(String value) {
            addCriterion("leave_time_end <>", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndGreaterThan(String value) {
            addCriterion("leave_time_end >", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time_end >=", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndLessThan(String value) {
            addCriterion("leave_time_end <", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndLessThanOrEqualTo(String value) {
            addCriterion("leave_time_end <=", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndLike(String value) {
            addCriterion("leave_time_end like", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndNotLike(String value) {
            addCriterion("leave_time_end not like", value, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndIn(List<String> values) {
            addCriterion("leave_time_end in", values, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndNotIn(List<String> values) {
            addCriterion("leave_time_end not in", values, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndBetween(String value1, String value2) {
            addCriterion("leave_time_end between", value1, value2, "leaveTimeEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEndNotBetween(String value1, String value2) {
            addCriterion("leave_time_end not between", value1, value2, "leaveTimeEnd");
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