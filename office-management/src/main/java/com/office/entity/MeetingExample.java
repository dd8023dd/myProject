package com.office.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingExample() {
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

        public Criteria andMeetingIdIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Integer value) {
            addCriterion("meeting_id =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Integer value) {
            addCriterion("meeting_id <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Integer value) {
            addCriterion("meeting_id >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_id >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Integer value) {
            addCriterion("meeting_id <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_id <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Integer> values) {
            addCriterion("meeting_id in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Integer> values) {
            addCriterion("meeting_id not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNull() {
            addCriterion("meeting_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNotNull() {
            addCriterion("meeting_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameEqualTo(String value) {
            addCriterion("meeting_name =", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotEqualTo(String value) {
            addCriterion("meeting_name <>", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThan(String value) {
            addCriterion("meeting_name >", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_name >=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThan(String value) {
            addCriterion("meeting_name <", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_name <=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLike(String value) {
            addCriterion("meeting_name like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotLike(String value) {
            addCriterion("meeting_name not like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIn(List<String> values) {
            addCriterion("meeting_name in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotIn(List<String> values) {
            addCriterion("meeting_name not in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameBetween(String value1, String value2) {
            addCriterion("meeting_name between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotBetween(String value1, String value2) {
            addCriterion("meeting_name not between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIsNull() {
            addCriterion("meeting_room_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIsNotNull() {
            addCriterion("meeting_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdEqualTo(Integer value) {
            addCriterion("meeting_room_id =", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotEqualTo(Integer value) {
            addCriterion("meeting_room_id <>", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdGreaterThan(Integer value) {
            addCriterion("meeting_room_id >", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_id >=", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLessThan(Integer value) {
            addCriterion("meeting_room_id <", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_id <=", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIn(List<Integer> values) {
            addCriterion("meeting_room_id in", values, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotIn(List<Integer> values) {
            addCriterion("meeting_room_id not in", values, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_id between", value1, value2, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_id not between", value1, value2, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdIsNull() {
            addCriterion("meeting_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdIsNotNull() {
            addCriterion("meeting_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdEqualTo(String value) {
            addCriterion("meeting_emp_id =", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdNotEqualTo(String value) {
            addCriterion("meeting_emp_id <>", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdGreaterThan(String value) {
            addCriterion("meeting_emp_id >", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_emp_id >=", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdLessThan(String value) {
            addCriterion("meeting_emp_id <", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdLessThanOrEqualTo(String value) {
            addCriterion("meeting_emp_id <=", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdLike(String value) {
            addCriterion("meeting_emp_id like", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdNotLike(String value) {
            addCriterion("meeting_emp_id not like", value, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdIn(List<String> values) {
            addCriterion("meeting_emp_id in", values, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdNotIn(List<String> values) {
            addCriterion("meeting_emp_id not in", values, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdBetween(String value1, String value2) {
            addCriterion("meeting_emp_id between", value1, value2, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingEmpIdNotBetween(String value1, String value2) {
            addCriterion("meeting_emp_id not between", value1, value2, "meetingEmpId");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartIsNull() {
            addCriterion("meeting_time_start is null");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartIsNotNull() {
            addCriterion("meeting_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartEqualTo(Date value) {
            addCriterion("meeting_time_start =", value, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartNotEqualTo(Date value) {
            addCriterion("meeting_time_start <>", value, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartGreaterThan(Date value) {
            addCriterion("meeting_time_start >", value, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("meeting_time_start >=", value, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartLessThan(Date value) {
            addCriterion("meeting_time_start <", value, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("meeting_time_start <=", value, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartIn(List<Date> values) {
            addCriterion("meeting_time_start in", values, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartNotIn(List<Date> values) {
            addCriterion("meeting_time_start not in", values, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartBetween(Date value1, Date value2) {
            addCriterion("meeting_time_start between", value1, value2, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andMeetingTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("meeting_time_start not between", value1, value2, "meetingTimeStart");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNull() {
            addCriterion("booking_time is null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNotNull() {
            addCriterion("booking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeEqualTo(Integer value) {
            addCriterion("booking_time =", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotEqualTo(Integer value) {
            addCriterion("booking_time <>", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThan(Integer value) {
            addCriterion("booking_time >", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("booking_time >=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThan(Integer value) {
            addCriterion("booking_time <", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("booking_time <=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIn(List<Integer> values) {
            addCriterion("booking_time in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotIn(List<Integer> values) {
            addCriterion("booking_time not in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeBetween(Integer value1, Integer value2) {
            addCriterion("booking_time between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("booking_time not between", value1, value2, "bookingTime");
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