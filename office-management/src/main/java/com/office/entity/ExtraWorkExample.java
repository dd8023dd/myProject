package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class ExtraWorkExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtraWorkExample() {
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

        public Criteria andExtraWorkIdIsNull() {
            addCriterion("extra_work_id is null");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdIsNotNull() {
            addCriterion("extra_work_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdEqualTo(Integer value) {
            addCriterion("extra_work_id =", value, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdNotEqualTo(Integer value) {
            addCriterion("extra_work_id <>", value, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdGreaterThan(Integer value) {
            addCriterion("extra_work_id >", value, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("extra_work_id >=", value, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdLessThan(Integer value) {
            addCriterion("extra_work_id <", value, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("extra_work_id <=", value, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdIn(List<Integer> values) {
            addCriterion("extra_work_id in", values, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdNotIn(List<Integer> values) {
            addCriterion("extra_work_id not in", values, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("extra_work_id between", value1, value2, "extraWorkId");
            return (Criteria) this;
        }

        public Criteria andExtraWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("extra_work_id not between", value1, value2, "extraWorkId");
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

        public Criteria andExtraWorkTimeIsNull() {
            addCriterion("extra_work_time is null");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeIsNotNull() {
            addCriterion("extra_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeEqualTo(String value) {
            addCriterion("extra_work_time =", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeNotEqualTo(String value) {
            addCriterion("extra_work_time <>", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeGreaterThan(String value) {
            addCriterion("extra_work_time >", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("extra_work_time >=", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeLessThan(String value) {
            addCriterion("extra_work_time <", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("extra_work_time <=", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeLike(String value) {
            addCriterion("extra_work_time like", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeNotLike(String value) {
            addCriterion("extra_work_time not like", value, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeIn(List<String> values) {
            addCriterion("extra_work_time in", values, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeNotIn(List<String> values) {
            addCriterion("extra_work_time not in", values, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeBetween(String value1, String value2) {
            addCriterion("extra_work_time between", value1, value2, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andExtraWorkTimeNotBetween(String value1, String value2) {
            addCriterion("extra_work_time not between", value1, value2, "extraWorkTime");
            return (Criteria) this;
        }

        public Criteria andIsHolidyIsNull() {
            addCriterion("is_holidy is null");
            return (Criteria) this;
        }

        public Criteria andIsHolidyIsNotNull() {
            addCriterion("is_holidy is not null");
            return (Criteria) this;
        }

        public Criteria andIsHolidyEqualTo(Integer value) {
            addCriterion("is_holidy =", value, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyNotEqualTo(Integer value) {
            addCriterion("is_holidy <>", value, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyGreaterThan(Integer value) {
            addCriterion("is_holidy >", value, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_holidy >=", value, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyLessThan(Integer value) {
            addCriterion("is_holidy <", value, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyLessThanOrEqualTo(Integer value) {
            addCriterion("is_holidy <=", value, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyIn(List<Integer> values) {
            addCriterion("is_holidy in", values, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyNotIn(List<Integer> values) {
            addCriterion("is_holidy not in", values, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyBetween(Integer value1, Integer value2) {
            addCriterion("is_holidy between", value1, value2, "isHolidy");
            return (Criteria) this;
        }

        public Criteria andIsHolidyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_holidy not between", value1, value2, "isHolidy");
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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