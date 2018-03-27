package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class CheckTimeStatisticsExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckTimeStatisticsExample() {
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

        public Criteria andCheckTimeStatisticsIdIsNull() {
            addCriterion("\"check_time_ statistics_id\" is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdIsNotNull() {
            addCriterion("\"check_time_ statistics_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_id\" =", value, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdNotEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_id\" <>", value, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdGreaterThan(Integer value) {
            addCriterion("\"check_time_ statistics_id\" >", value, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_id\" >=", value, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdLessThan(Integer value) {
            addCriterion("\"check_time_ statistics_id\" <", value, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_id\" <=", value, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdIn(List<Integer> values) {
            addCriterion("\"check_time_ statistics_id\" in", values, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdNotIn(List<Integer> values) {
            addCriterion("\"check_time_ statistics_id\" not in", values, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdBetween(Integer value1, Integer value2) {
            addCriterion("\"check_time_ statistics_id\" between", value1, value2, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"check_time_ statistics_id\" not between", value1, value2, "checkTimeStatisticsId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidIsNull() {
            addCriterion("check_time_empid is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidIsNotNull() {
            addCriterion("check_time_empid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidEqualTo(Integer value) {
            addCriterion("check_time_empid =", value, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidNotEqualTo(Integer value) {
            addCriterion("check_time_empid <>", value, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidGreaterThan(Integer value) {
            addCriterion("check_time_empid >", value, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_time_empid >=", value, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidLessThan(Integer value) {
            addCriterion("check_time_empid <", value, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("check_time_empid <=", value, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidIn(List<Integer> values) {
            addCriterion("check_time_empid in", values, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidNotIn(List<Integer> values) {
            addCriterion("check_time_empid not in", values, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidBetween(Integer value1, Integer value2) {
            addCriterion("check_time_empid between", value1, value2, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("check_time_empid not between", value1, value2, "checkTimeEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayIsNull() {
            addCriterion("\"check_time_ statistics_day\" is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayIsNotNull() {
            addCriterion("\"check_time_ statistics_day\" is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_day\" =", value, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayNotEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_day\" <>", value, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayGreaterThan(Integer value) {
            addCriterion("\"check_time_ statistics_day\" >", value, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_day\" >=", value, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayLessThan(Integer value) {
            addCriterion("\"check_time_ statistics_day\" <", value, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayLessThanOrEqualTo(Integer value) {
            addCriterion("\"check_time_ statistics_day\" <=", value, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayIn(List<Integer> values) {
            addCriterion("\"check_time_ statistics_day\" in", values, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayNotIn(List<Integer> values) {
            addCriterion("\"check_time_ statistics_day\" not in", values, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayBetween(Integer value1, Integer value2) {
            addCriterion("\"check_time_ statistics_day\" between", value1, value2, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andCheckTimeStatisticsDayNotBetween(Integer value1, Integer value2) {
            addCriterion("\"check_time_ statistics_day\" not between", value1, value2, "checkTimeStatisticsDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayIsNull() {
            addCriterion("leave_day is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDayIsNotNull() {
            addCriterion("leave_day is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDayEqualTo(Integer value) {
            addCriterion("leave_day =", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayNotEqualTo(Integer value) {
            addCriterion("leave_day <>", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayGreaterThan(Integer value) {
            addCriterion("leave_day >", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_day >=", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayLessThan(Integer value) {
            addCriterion("leave_day <", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayLessThanOrEqualTo(Integer value) {
            addCriterion("leave_day <=", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayIn(List<Integer> values) {
            addCriterion("leave_day in", values, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayNotIn(List<Integer> values) {
            addCriterion("leave_day not in", values, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayBetween(Integer value1, Integer value2) {
            addCriterion("leave_day between", value1, value2, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_day not between", value1, value2, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismIsNull() {
            addCriterion("absenteeism is null");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismIsNotNull() {
            addCriterion("absenteeism is not null");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismEqualTo(Integer value) {
            addCriterion("absenteeism =", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismNotEqualTo(Integer value) {
            addCriterion("absenteeism <>", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismGreaterThan(Integer value) {
            addCriterion("absenteeism >", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismGreaterThanOrEqualTo(Integer value) {
            addCriterion("absenteeism >=", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismLessThan(Integer value) {
            addCriterion("absenteeism <", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismLessThanOrEqualTo(Integer value) {
            addCriterion("absenteeism <=", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismIn(List<Integer> values) {
            addCriterion("absenteeism in", values, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismNotIn(List<Integer> values) {
            addCriterion("absenteeism not in", values, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismBetween(Integer value1, Integer value2) {
            addCriterion("absenteeism between", value1, value2, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismNotBetween(Integer value1, Integer value2) {
            addCriterion("absenteeism not between", value1, value2, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Integer value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Integer value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Integer value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Integer value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Integer value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Integer> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Integer> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Integer value1, Integer value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("salary not between", value1, value2, "salary");
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