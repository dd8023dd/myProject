package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingRoomExample() {
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

        public Criteria andMeetingRoomCapacityIsNull() {
            addCriterion("meeting_room_capacity is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityIsNotNull() {
            addCriterion("meeting_room_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityEqualTo(Integer value) {
            addCriterion("meeting_room_capacity =", value, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityNotEqualTo(Integer value) {
            addCriterion("meeting_room_capacity <>", value, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityGreaterThan(Integer value) {
            addCriterion("meeting_room_capacity >", value, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_capacity >=", value, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityLessThan(Integer value) {
            addCriterion("meeting_room_capacity <", value, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_capacity <=", value, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityIn(List<Integer> values) {
            addCriterion("meeting_room_capacity in", values, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityNotIn(List<Integer> values) {
            addCriterion("meeting_room_capacity not in", values, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_capacity between", value1, value2, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_capacity not between", value1, value2, "meetingRoomCapacity");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusIsNull() {
            addCriterion("meeting_room_status is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusIsNotNull() {
            addCriterion("meeting_room_status is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusEqualTo(Integer value) {
            addCriterion("meeting_room_status =", value, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusNotEqualTo(Integer value) {
            addCriterion("meeting_room_status <>", value, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusGreaterThan(Integer value) {
            addCriterion("meeting_room_status >", value, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_status >=", value, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusLessThan(Integer value) {
            addCriterion("meeting_room_status <", value, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_status <=", value, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusIn(List<Integer> values) {
            addCriterion("meeting_room_status in", values, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusNotIn(List<Integer> values) {
            addCriterion("meeting_room_status not in", values, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_status between", value1, value2, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_status not between", value1, value2, "meetingRoomStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameIsNull() {
            addCriterion("meeting_room_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameIsNotNull() {
            addCriterion("meeting_room_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameEqualTo(String value) {
            addCriterion("meeting_room_name =", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotEqualTo(String value) {
            addCriterion("meeting_room_name <>", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameGreaterThan(String value) {
            addCriterion("meeting_room_name >", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room_name >=", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameLessThan(String value) {
            addCriterion("meeting_room_name <", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_room_name <=", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameLike(String value) {
            addCriterion("meeting_room_name like", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotLike(String value) {
            addCriterion("meeting_room_name not like", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameIn(List<String> values) {
            addCriterion("meeting_room_name in", values, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotIn(List<String> values) {
            addCriterion("meeting_room_name not in", values, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameBetween(String value1, String value2) {
            addCriterion("meeting_room_name between", value1, value2, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotBetween(String value1, String value2) {
            addCriterion("meeting_room_name not between", value1, value2, "meetingRoomName");
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