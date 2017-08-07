package cn.com.demo.po;

import java.util.ArrayList;
import java.util.List;

public class PUmAuthorityResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PUmAuthorityResourceExample() {
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

        public Criteria andAuthorityidIsNull() {
            addCriterion("AUTHORITYID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIsNotNull() {
            addCriterion("AUTHORITYID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityidEqualTo(String value) {
            addCriterion("AUTHORITYID =", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotEqualTo(String value) {
            addCriterion("AUTHORITYID <>", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidGreaterThan(String value) {
            addCriterion("AUTHORITYID >", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITYID >=", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLessThan(String value) {
            addCriterion("AUTHORITYID <", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITYID <=", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLike(String value) {
            addCriterion("AUTHORITYID like", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotLike(String value) {
            addCriterion("AUTHORITYID not like", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIn(List<String> values) {
            addCriterion("AUTHORITYID in", values, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotIn(List<String> values) {
            addCriterion("AUTHORITYID not in", values, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidBetween(String value1, String value2) {
            addCriterion("AUTHORITYID between", value1, value2, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotBetween(String value1, String value2) {
            addCriterion("AUTHORITYID not between", value1, value2, "authorityid");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("RESOURCE_ID like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("RESOURCE_ID not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andFlaginfoIsNull() {
            addCriterion("FLAGINFO is null");
            return (Criteria) this;
        }

        public Criteria andFlaginfoIsNotNull() {
            addCriterion("FLAGINFO is not null");
            return (Criteria) this;
        }

        public Criteria andFlaginfoEqualTo(String value) {
            addCriterion("FLAGINFO =", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoNotEqualTo(String value) {
            addCriterion("FLAGINFO <>", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoGreaterThan(String value) {
            addCriterion("FLAGINFO >", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoGreaterThanOrEqualTo(String value) {
            addCriterion("FLAGINFO >=", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoLessThan(String value) {
            addCriterion("FLAGINFO <", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoLessThanOrEqualTo(String value) {
            addCriterion("FLAGINFO <=", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoLike(String value) {
            addCriterion("FLAGINFO like", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoNotLike(String value) {
            addCriterion("FLAGINFO not like", value, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoIn(List<String> values) {
            addCriterion("FLAGINFO in", values, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoNotIn(List<String> values) {
            addCriterion("FLAGINFO not in", values, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoBetween(String value1, String value2) {
            addCriterion("FLAGINFO between", value1, value2, "flaginfo");
            return (Criteria) this;
        }

        public Criteria andFlaginfoNotBetween(String value1, String value2) {
            addCriterion("FLAGINFO not between", value1, value2, "flaginfo");
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