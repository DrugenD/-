package com.cduestc.keep.model;

import java.util.ArrayList;
import java.util.List;

public class PlanProgressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public PlanProgressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
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

        public Criteria andPlanProgressidIsNull() {
            addCriterion("plan_ProgressID is null");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidIsNotNull() {
            addCriterion("plan_ProgressID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidEqualTo(Long value) {
            addCriterion("plan_ProgressID =", value, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidNotEqualTo(Long value) {
            addCriterion("plan_ProgressID <>", value, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidGreaterThan(Long value) {
            addCriterion("plan_ProgressID >", value, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_ProgressID >=", value, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidLessThan(Long value) {
            addCriterion("plan_ProgressID <", value, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidLessThanOrEqualTo(Long value) {
            addCriterion("plan_ProgressID <=", value, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidIn(List<Long> values) {
            addCriterion("plan_ProgressID in", values, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidNotIn(List<Long> values) {
            addCriterion("plan_ProgressID not in", values, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidBetween(Long value1, Long value2) {
            addCriterion("plan_ProgressID between", value1, value2, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andPlanProgressidNotBetween(Long value1, Long value2) {
            addCriterion("plan_ProgressID not between", value1, value2, "planProgressid");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("owner_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("owner_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("owner_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("owner_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("owner_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("owner_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("owner_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("owner_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("owner_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("owner_ID not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andStartPlanidIsNull() {
            addCriterion("start_planID is null");
            return (Criteria) this;
        }

        public Criteria andStartPlanidIsNotNull() {
            addCriterion("start_planID is not null");
            return (Criteria) this;
        }

        public Criteria andStartPlanidEqualTo(Long value) {
            addCriterion("start_planID =", value, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidNotEqualTo(Long value) {
            addCriterion("start_planID <>", value, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidGreaterThan(Long value) {
            addCriterion("start_planID >", value, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidGreaterThanOrEqualTo(Long value) {
            addCriterion("start_planID >=", value, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidLessThan(Long value) {
            addCriterion("start_planID <", value, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidLessThanOrEqualTo(Long value) {
            addCriterion("start_planID <=", value, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidIn(List<Long> values) {
            addCriterion("start_planID in", values, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidNotIn(List<Long> values) {
            addCriterion("start_planID not in", values, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidBetween(Long value1, Long value2) {
            addCriterion("start_planID between", value1, value2, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andStartPlanidNotBetween(Long value1, Long value2) {
            addCriterion("start_planID not between", value1, value2, "startPlanid");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNull() {
            addCriterion("current_state is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNotNull() {
            addCriterion("current_state is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateEqualTo(Long value) {
            addCriterion("current_state =", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualTo(Long value) {
            addCriterion("current_state <>", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThan(Long value) {
            addCriterion("current_state >", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualTo(Long value) {
            addCriterion("current_state >=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThan(Long value) {
            addCriterion("current_state <", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualTo(Long value) {
            addCriterion("current_state <=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIn(List<Long> values) {
            addCriterion("current_state in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotIn(List<Long> values) {
            addCriterion("current_state not in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateBetween(Long value1, Long value2) {
            addCriterion("current_state between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotBetween(Long value1, Long value2) {
            addCriterion("current_state not between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andEndPlanidIsNull() {
            addCriterion("end_planID is null");
            return (Criteria) this;
        }

        public Criteria andEndPlanidIsNotNull() {
            addCriterion("end_planID is not null");
            return (Criteria) this;
        }

        public Criteria andEndPlanidEqualTo(Long value) {
            addCriterion("end_planID =", value, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidNotEqualTo(Long value) {
            addCriterion("end_planID <>", value, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidGreaterThan(Long value) {
            addCriterion("end_planID >", value, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidGreaterThanOrEqualTo(Long value) {
            addCriterion("end_planID >=", value, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidLessThan(Long value) {
            addCriterion("end_planID <", value, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidLessThanOrEqualTo(Long value) {
            addCriterion("end_planID <=", value, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidIn(List<Long> values) {
            addCriterion("end_planID in", values, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidNotIn(List<Long> values) {
            addCriterion("end_planID not in", values, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidBetween(Long value1, Long value2) {
            addCriterion("end_planID between", value1, value2, "endPlanid");
            return (Criteria) this;
        }

        public Criteria andEndPlanidNotBetween(Long value1, Long value2) {
            addCriterion("end_planID not between", value1, value2, "endPlanid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plan_progress
     *
     * @mbg.generated do_not_delete_during_merge Sat Feb 15 21:07:37 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plan_progress
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
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