package com.office.entity;

import java.util.ArrayList;
import java.util.List;

public class DeptDetailsExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptDetailsExample() {
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

        public Criteria andDeptDetailIdIsNull() {
            addCriterion("dept_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdIsNotNull() {
            addCriterion("dept_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdEqualTo(Integer value) {
            addCriterion("dept_detail_id =", value, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdNotEqualTo(Integer value) {
            addCriterion("dept_detail_id <>", value, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdGreaterThan(Integer value) {
            addCriterion("dept_detail_id >", value, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_detail_id >=", value, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdLessThan(Integer value) {
            addCriterion("dept_detail_id <", value, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_detail_id <=", value, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdIn(List<Integer> values) {
            addCriterion("dept_detail_id in", values, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdNotIn(List<Integer> values) {
            addCriterion("dept_detail_id not in", values, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_detail_id between", value1, value2, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_detail_id not between", value1, value2, "deptDetailId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptEmpIsNull() {
            addCriterion("dept_emp is null");
            return (Criteria) this;
        }

        public Criteria andDeptEmpIsNotNull() {
            addCriterion("dept_emp is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEmpEqualTo(String value) {
            addCriterion("dept_emp =", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpNotEqualTo(String value) {
            addCriterion("dept_emp <>", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpGreaterThan(String value) {
            addCriterion("dept_emp >", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpGreaterThanOrEqualTo(String value) {
            addCriterion("dept_emp >=", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpLessThan(String value) {
            addCriterion("dept_emp <", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpLessThanOrEqualTo(String value) {
            addCriterion("dept_emp <=", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpLike(String value) {
            addCriterion("dept_emp like", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpNotLike(String value) {
            addCriterion("dept_emp not like", value, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpIn(List<String> values) {
            addCriterion("dept_emp in", values, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpNotIn(List<String> values) {
            addCriterion("dept_emp not in", values, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpBetween(String value1, String value2) {
            addCriterion("dept_emp between", value1, value2, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptEmpNotBetween(String value1, String value2) {
            addCriterion("dept_emp not between", value1, value2, "deptEmp");
            return (Criteria) this;
        }

        public Criteria andDeptManagerIsNull() {
            addCriterion("dept_manager is null");
            return (Criteria) this;
        }

        public Criteria andDeptManagerIsNotNull() {
            addCriterion("dept_manager is not null");
            return (Criteria) this;
        }

        public Criteria andDeptManagerEqualTo(String value) {
            addCriterion("dept_manager =", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerNotEqualTo(String value) {
            addCriterion("dept_manager <>", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerGreaterThan(String value) {
            addCriterion("dept_manager >", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerGreaterThanOrEqualTo(String value) {
            addCriterion("dept_manager >=", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerLessThan(String value) {
            addCriterion("dept_manager <", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerLessThanOrEqualTo(String value) {
            addCriterion("dept_manager <=", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerLike(String value) {
            addCriterion("dept_manager like", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerNotLike(String value) {
            addCriterion("dept_manager not like", value, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerIn(List<String> values) {
            addCriterion("dept_manager in", values, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerNotIn(List<String> values) {
            addCriterion("dept_manager not in", values, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerBetween(String value1, String value2) {
            addCriterion("dept_manager between", value1, value2, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptManagerNotBetween(String value1, String value2) {
            addCriterion("dept_manager not between", value1, value2, "deptManager");
            return (Criteria) this;
        }

        public Criteria andDeptImgIsNull() {
            addCriterion("dept_img is null");
            return (Criteria) this;
        }

        public Criteria andDeptImgIsNotNull() {
            addCriterion("dept_img is not null");
            return (Criteria) this;
        }

        public Criteria andDeptImgEqualTo(String value) {
            addCriterion("dept_img =", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgNotEqualTo(String value) {
            addCriterion("dept_img <>", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgGreaterThan(String value) {
            addCriterion("dept_img >", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgGreaterThanOrEqualTo(String value) {
            addCriterion("dept_img >=", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgLessThan(String value) {
            addCriterion("dept_img <", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgLessThanOrEqualTo(String value) {
            addCriterion("dept_img <=", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgLike(String value) {
            addCriterion("dept_img like", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgNotLike(String value) {
            addCriterion("dept_img not like", value, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgIn(List<String> values) {
            addCriterion("dept_img in", values, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgNotIn(List<String> values) {
            addCriterion("dept_img not in", values, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgBetween(String value1, String value2) {
            addCriterion("dept_img between", value1, value2, "deptImg");
            return (Criteria) this;
        }

        public Criteria andDeptImgNotBetween(String value1, String value2) {
            addCriterion("dept_img not between", value1, value2, "deptImg");
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