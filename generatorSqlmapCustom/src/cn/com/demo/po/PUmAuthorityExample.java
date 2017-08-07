package cn.com.demo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PUmAuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PUmAuthorityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAuthoritynameIsNull() {
            addCriterion("AUTHORITYNAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameIsNotNull() {
            addCriterion("AUTHORITYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameEqualTo(String value) {
            addCriterion("AUTHORITYNAME =", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotEqualTo(String value) {
            addCriterion("AUTHORITYNAME <>", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameGreaterThan(String value) {
            addCriterion("AUTHORITYNAME >", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITYNAME >=", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameLessThan(String value) {
            addCriterion("AUTHORITYNAME <", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITYNAME <=", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameLike(String value) {
            addCriterion("AUTHORITYNAME like", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotLike(String value) {
            addCriterion("AUTHORITYNAME not like", value, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameIn(List<String> values) {
            addCriterion("AUTHORITYNAME in", values, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotIn(List<String> values) {
            addCriterion("AUTHORITYNAME not in", values, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameBetween(String value1, String value2) {
            addCriterion("AUTHORITYNAME between", value1, value2, "authorityname");
            return (Criteria) this;
        }

        public Criteria andAuthoritynameNotBetween(String value1, String value2) {
            addCriterion("AUTHORITYNAME not between", value1, value2, "authorityname");
            return (Criteria) this;
        }

        public Criteria andDescnIsNull() {
            addCriterion("DESCN is null");
            return (Criteria) this;
        }

        public Criteria andDescnIsNotNull() {
            addCriterion("DESCN is not null");
            return (Criteria) this;
        }

        public Criteria andDescnEqualTo(String value) {
            addCriterion("DESCN =", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotEqualTo(String value) {
            addCriterion("DESCN <>", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnGreaterThan(String value) {
            addCriterion("DESCN >", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnGreaterThanOrEqualTo(String value) {
            addCriterion("DESCN >=", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLessThan(String value) {
            addCriterion("DESCN <", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLessThanOrEqualTo(String value) {
            addCriterion("DESCN <=", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLike(String value) {
            addCriterion("DESCN like", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotLike(String value) {
            addCriterion("DESCN not like", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnIn(List<String> values) {
            addCriterion("DESCN in", values, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotIn(List<String> values) {
            addCriterion("DESCN not in", values, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnBetween(String value1, String value2) {
            addCriterion("DESCN between", value1, value2, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotBetween(String value1, String value2) {
            addCriterion("DESCN not between", value1, value2, "descn");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("FUNCTION =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("FUNCTION <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("FUNCTION >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("FUNCTION <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("FUNCTION like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("FUNCTION not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("FUNCTION in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("FUNCTION not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("FUNCTION between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("FUNCTION not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNull() {
            addCriterion("FUNCTIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNotNull() {
            addCriterion("FUNCTIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameEqualTo(String value) {
            addCriterion("FUNCTIONNAME =", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotEqualTo(String value) {
            addCriterion("FUNCTIONNAME <>", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThan(String value) {
            addCriterion("FUNCTIONNAME >", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONNAME >=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThan(String value) {
            addCriterion("FUNCTIONNAME <", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONNAME <=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLike(String value) {
            addCriterion("FUNCTIONNAME like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotLike(String value) {
            addCriterion("FUNCTIONNAME not like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIn(List<String> values) {
            addCriterion("FUNCTIONNAME in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotIn(List<String> values) {
            addCriterion("FUNCTIONNAME not in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameBetween(String value1, String value2) {
            addCriterion("FUNCTIONNAME between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONNAME not between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(BigDecimal value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(BigDecimal value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(BigDecimal value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(BigDecimal value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<BigDecimal> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<BigDecimal> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andIssysIsNull() {
            addCriterion("ISSYS is null");
            return (Criteria) this;
        }

        public Criteria andIssysIsNotNull() {
            addCriterion("ISSYS is not null");
            return (Criteria) this;
        }

        public Criteria andIssysEqualTo(BigDecimal value) {
            addCriterion("ISSYS =", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotEqualTo(BigDecimal value) {
            addCriterion("ISSYS <>", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThan(BigDecimal value) {
            addCriterion("ISSYS >", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYS >=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThan(BigDecimal value) {
            addCriterion("ISSYS <", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYS <=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysIn(List<BigDecimal> values) {
            addCriterion("ISSYS in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotIn(List<BigDecimal> values) {
            addCriterion("ISSYS not in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYS between", value1, value2, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYS not between", value1, value2, "issys");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
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