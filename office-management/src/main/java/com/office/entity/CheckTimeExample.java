package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class CheckTimeExample extends BaseExample{
    protected String orderByClause;
    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckTimeExample() {
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

        public Criteria andCheckTimeIdIsNull() {
            addCriterion("check_time_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdIsNotNull() {
            addCriterion("check_time_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdEqualTo(Integer value) {
            addCriterion("check_time_id =", value, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdNotEqualTo(Integer value) {
            addCriterion("check_time_id <>", value, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdGreaterThan(Integer value) {
            addCriterion("check_time_id >", value, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_time_id >=", value, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdLessThan(Integer value) {
            addCriterion("check_time_id <", value, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("check_time_id <=", value, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdIn(List<Integer> values) {
            addCriterion("check_time_id in", values, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdNotIn(List<Integer> values) {
            addCriterion("check_time_id not in", values, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("check_time_id between", value1, value2, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("check_time_id not between", value1, value2, "checkTimeId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataIsNull() {
            addCriterion("check_time_data is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataIsNotNull() {
            addCriterion("check_time_data is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataEqualTo(String value) {
            addCriterion("check_time_data =", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataNotEqualTo(String value) {
            addCriterion("check_time_data <>", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataGreaterThan(String value) {
            addCriterion("check_time_data >", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataGreaterThanOrEqualTo(String value) {
            addCriterion("check_time_data >=", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataLessThan(String value) {
            addCriterion("check_time_data <", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataLessThanOrEqualTo(String value) {
            addCriterion("check_time_data <=", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataLike(String value) {
            addCriterion("check_time_data like", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataNotLike(String value) {
            addCriterion("check_time_data not like", value, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataIn(List<String> values) {
            addCriterion("check_time_data in", values, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataNotIn(List<String> values) {
            addCriterion("check_time_data not in", values, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataBetween(String value1, String value2) {
            addCriterion("check_time_data between", value1, value2, "checkTimeData");
            return (Criteria) this;
        }

        public Criteria andCheckTimeDataNotBetween(String value1, String value2) {
            addCriterion("check_time_data not between", value1, value2, "checkTimeData");
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

        public Criteria andCheckTimeOutIsNull() {
            addCriterion("check_time_out is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutIsNotNull() {
            addCriterion("check_time_out is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutEqualTo(Integer value) {
            addCriterion("check_time_out =", value, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutNotEqualTo(Integer value) {
            addCriterion("check_time_out <>", value, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutGreaterThan(Integer value) {
            addCriterion("check_time_out >", value, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_time_out >=", value, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutLessThan(Integer value) {
            addCriterion("check_time_out <", value, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutLessThanOrEqualTo(Integer value) {
            addCriterion("check_time_out <=", value, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutIn(List<Integer> values) {
            addCriterion("check_time_out in", values, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutNotIn(List<Integer> values) {
            addCriterion("check_time_out not in", values, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutBetween(Integer value1, Integer value2) {
            addCriterion("check_time_out between", value1, value2, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeOutNotBetween(Integer value1, Integer value2) {
            addCriterion("check_time_out not between", value1, value2, "checkTimeOut");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstIsNull() {
            addCriterion("check_time_first is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstIsNotNull() {
            addCriterion("check_time_first is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstEqualTo(String value) {
            addCriterion("check_time_first =", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstNotEqualTo(String value) {
            addCriterion("check_time_first <>", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstGreaterThan(String value) {
            addCriterion("check_time_first >", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstGreaterThanOrEqualTo(String value) {
            addCriterion("check_time_first >=", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstLessThan(String value) {
            addCriterion("check_time_first <", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstLessThanOrEqualTo(String value) {
            addCriterion("check_time_first <=", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstLike(String value) {
            addCriterion("check_time_first like", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstNotLike(String value) {
            addCriterion("check_time_first not like", value, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstIn(List<String> values) {
            addCriterion("check_time_first in", values, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstNotIn(List<String> values) {
            addCriterion("check_time_first not in", values, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstBetween(String value1, String value2) {
            addCriterion("check_time_first between", value1, value2, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeFirstNotBetween(String value1, String value2) {
            addCriterion("check_time_first not between", value1, value2, "checkTimeFirst");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveIsNull() {
            addCriterion("check_time_leave is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveIsNotNull() {
            addCriterion("check_time_leave is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveEqualTo(String value) {
            addCriterion("check_time_leave =", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveNotEqualTo(String value) {
            addCriterion("check_time_leave <>", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveGreaterThan(String value) {
            addCriterion("check_time_leave >", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveGreaterThanOrEqualTo(String value) {
            addCriterion("check_time_leave >=", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveLessThan(String value) {
            addCriterion("check_time_leave <", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveLessThanOrEqualTo(String value) {
            addCriterion("check_time_leave <=", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveLike(String value) {
            addCriterion("check_time_leave like", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveNotLike(String value) {
            addCriterion("check_time_leave not like", value, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveIn(List<String> values) {
            addCriterion("check_time_leave in", values, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveNotIn(List<String> values) {
            addCriterion("check_time_leave not in", values, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveBetween(String value1, String value2) {
            addCriterion("check_time_leave between", value1, value2, "checkTimeLeave");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLeaveNotBetween(String value1, String value2) {
            addCriterion("check_time_leave not between", value1, value2, "checkTimeLeave");
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