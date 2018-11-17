package com.tct.db.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GunBulletCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GunBulletCountExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGunIdIsNull() {
            addCriterion("gun_id is null");
            return (Criteria) this;
        }

        public Criteria andGunIdIsNotNull() {
            addCriterion("gun_id is not null");
            return (Criteria) this;
        }

        public Criteria andGunIdEqualTo(String value) {
            addCriterion("gun_id =", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdNotEqualTo(String value) {
            addCriterion("gun_id <>", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdGreaterThan(String value) {
            addCriterion("gun_id >", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdGreaterThanOrEqualTo(String value) {
            addCriterion("gun_id >=", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdLessThan(String value) {
            addCriterion("gun_id <", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdLessThanOrEqualTo(String value) {
            addCriterion("gun_id <=", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdLike(String value) {
            addCriterion("gun_id like", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdNotLike(String value) {
            addCriterion("gun_id not like", value, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdIn(List<String> values) {
            addCriterion("gun_id in", values, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdNotIn(List<String> values) {
            addCriterion("gun_id not in", values, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdBetween(String value1, String value2) {
            addCriterion("gun_id between", value1, value2, "gunId");
            return (Criteria) this;
        }

        public Criteria andGunIdNotBetween(String value1, String value2) {
            addCriterion("gun_id not between", value1, value2, "gunId");
            return (Criteria) this;
        }

        public Criteria andBulletNumberIsNull() {
            addCriterion("bullet_number is null");
            return (Criteria) this;
        }

        public Criteria andBulletNumberIsNotNull() {
            addCriterion("bullet_number is not null");
            return (Criteria) this;
        }

        public Criteria andBulletNumberEqualTo(Integer value) {
            addCriterion("bullet_number =", value, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberNotEqualTo(Integer value) {
            addCriterion("bullet_number <>", value, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberGreaterThan(Integer value) {
            addCriterion("bullet_number >", value, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bullet_number >=", value, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberLessThan(Integer value) {
            addCriterion("bullet_number <", value, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberLessThanOrEqualTo(Integer value) {
            addCriterion("bullet_number <=", value, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberIn(List<Integer> values) {
            addCriterion("bullet_number in", values, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberNotIn(List<Integer> values) {
            addCriterion("bullet_number not in", values, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberBetween(Integer value1, Integer value2) {
            addCriterion("bullet_number between", value1, value2, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andBulletNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bullet_number not between", value1, value2, "bulletNumber");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLoIsNull() {
            addCriterion("lo is null");
            return (Criteria) this;
        }

        public Criteria andLoIsNotNull() {
            addCriterion("lo is not null");
            return (Criteria) this;
        }

        public Criteria andLoEqualTo(String value) {
            addCriterion("lo =", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotEqualTo(String value) {
            addCriterion("lo <>", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoGreaterThan(String value) {
            addCriterion("lo >", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoGreaterThanOrEqualTo(String value) {
            addCriterion("lo >=", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLessThan(String value) {
            addCriterion("lo <", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLessThanOrEqualTo(String value) {
            addCriterion("lo <=", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLike(String value) {
            addCriterion("lo like", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotLike(String value) {
            addCriterion("lo not like", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoIn(List<String> values) {
            addCriterion("lo in", values, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotIn(List<String> values) {
            addCriterion("lo not in", values, "lo");
            return (Criteria) this;
        }

        public Criteria andLoBetween(String value1, String value2) {
            addCriterion("lo between", value1, value2, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotBetween(String value1, String value2) {
            addCriterion("lo not between", value1, value2, "lo");
            return (Criteria) this;
        }

        public Criteria andLaIsNull() {
            addCriterion("la is null");
            return (Criteria) this;
        }

        public Criteria andLaIsNotNull() {
            addCriterion("la is not null");
            return (Criteria) this;
        }

        public Criteria andLaEqualTo(String value) {
            addCriterion("la =", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotEqualTo(String value) {
            addCriterion("la <>", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaGreaterThan(String value) {
            addCriterion("la >", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaGreaterThanOrEqualTo(String value) {
            addCriterion("la >=", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaLessThan(String value) {
            addCriterion("la <", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaLessThanOrEqualTo(String value) {
            addCriterion("la <=", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaLike(String value) {
            addCriterion("la like", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotLike(String value) {
            addCriterion("la not like", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaIn(List<String> values) {
            addCriterion("la in", values, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotIn(List<String> values) {
            addCriterion("la not in", values, "la");
            return (Criteria) this;
        }

        public Criteria andLaBetween(String value1, String value2) {
            addCriterion("la between", value1, value2, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotBetween(String value1, String value2) {
            addCriterion("la not between", value1, value2, "la");
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