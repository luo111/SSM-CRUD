package com.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class StuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuInfoExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_Id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_Id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_Id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_Id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_Id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_Id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_Id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_Id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_Id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_Id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_Id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_Id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNull() {
            addCriterion("info_Name is null");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNotNull() {
            addCriterion("info_Name is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNameEqualTo(String value) {
            addCriterion("info_Name =", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotEqualTo(String value) {
            addCriterion("info_Name <>", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThan(String value) {
            addCriterion("info_Name >", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("info_Name >=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThan(String value) {
            addCriterion("info_Name <", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThanOrEqualTo(String value) {
            addCriterion("info_Name <=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLike(String value) {
            addCriterion("info_Name like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotLike(String value) {
            addCriterion("info_Name not like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameIn(List<String> values) {
            addCriterion("info_Name in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotIn(List<String> values) {
            addCriterion("info_Name not in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameBetween(String value1, String value2) {
            addCriterion("info_Name between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotBetween(String value1, String value2) {
            addCriterion("info_Name not between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoSexIsNull() {
            addCriterion("info_Sex is null");
            return (Criteria) this;
        }

        public Criteria andInfoSexIsNotNull() {
            addCriterion("info_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSexEqualTo(String value) {
            addCriterion("info_Sex =", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexNotEqualTo(String value) {
            addCriterion("info_Sex <>", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexGreaterThan(String value) {
            addCriterion("info_Sex >", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexGreaterThanOrEqualTo(String value) {
            addCriterion("info_Sex >=", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexLessThan(String value) {
            addCriterion("info_Sex <", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexLessThanOrEqualTo(String value) {
            addCriterion("info_Sex <=", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexLike(String value) {
            addCriterion("info_Sex like", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexNotLike(String value) {
            addCriterion("info_Sex not like", value, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexIn(List<String> values) {
            addCriterion("info_Sex in", values, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexNotIn(List<String> values) {
            addCriterion("info_Sex not in", values, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexBetween(String value1, String value2) {
            addCriterion("info_Sex between", value1, value2, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoSexNotBetween(String value1, String value2) {
            addCriterion("info_Sex not between", value1, value2, "infoSex");
            return (Criteria) this;
        }

        public Criteria andInfoTelIsNull() {
            addCriterion("info_Tel is null");
            return (Criteria) this;
        }

        public Criteria andInfoTelIsNotNull() {
            addCriterion("info_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTelEqualTo(String value) {
            addCriterion("info_Tel =", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelNotEqualTo(String value) {
            addCriterion("info_Tel <>", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelGreaterThan(String value) {
            addCriterion("info_Tel >", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelGreaterThanOrEqualTo(String value) {
            addCriterion("info_Tel >=", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelLessThan(String value) {
            addCriterion("info_Tel <", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelLessThanOrEqualTo(String value) {
            addCriterion("info_Tel <=", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelLike(String value) {
            addCriterion("info_Tel like", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelNotLike(String value) {
            addCriterion("info_Tel not like", value, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelIn(List<String> values) {
            addCriterion("info_Tel in", values, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelNotIn(List<String> values) {
            addCriterion("info_Tel not in", values, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelBetween(String value1, String value2) {
            addCriterion("info_Tel between", value1, value2, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoTelNotBetween(String value1, String value2) {
            addCriterion("info_Tel not between", value1, value2, "infoTel");
            return (Criteria) this;
        }

        public Criteria andInfoEmailIsNull() {
            addCriterion("info_Email is null");
            return (Criteria) this;
        }

        public Criteria andInfoEmailIsNotNull() {
            addCriterion("info_Email is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEmailEqualTo(String value) {
            addCriterion("info_Email =", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailNotEqualTo(String value) {
            addCriterion("info_Email <>", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailGreaterThan(String value) {
            addCriterion("info_Email >", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailGreaterThanOrEqualTo(String value) {
            addCriterion("info_Email >=", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailLessThan(String value) {
            addCriterion("info_Email <", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailLessThanOrEqualTo(String value) {
            addCriterion("info_Email <=", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailLike(String value) {
            addCriterion("info_Email like", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailNotLike(String value) {
            addCriterion("info_Email not like", value, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailIn(List<String> values) {
            addCriterion("info_Email in", values, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailNotIn(List<String> values) {
            addCriterion("info_Email not in", values, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailBetween(String value1, String value2) {
            addCriterion("info_Email between", value1, value2, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoEmailNotBetween(String value1, String value2) {
            addCriterion("info_Email not between", value1, value2, "infoEmail");
            return (Criteria) this;
        }

        public Criteria andInfoQqIsNull() {
            addCriterion("info_Qq is null");
            return (Criteria) this;
        }

        public Criteria andInfoQqIsNotNull() {
            addCriterion("info_Qq is not null");
            return (Criteria) this;
        }

        public Criteria andInfoQqEqualTo(String value) {
            addCriterion("info_Qq =", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqNotEqualTo(String value) {
            addCriterion("info_Qq <>", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqGreaterThan(String value) {
            addCriterion("info_Qq >", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqGreaterThanOrEqualTo(String value) {
            addCriterion("info_Qq >=", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqLessThan(String value) {
            addCriterion("info_Qq <", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqLessThanOrEqualTo(String value) {
            addCriterion("info_Qq <=", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqLike(String value) {
            addCriterion("info_Qq like", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqNotLike(String value) {
            addCriterion("info_Qq not like", value, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqIn(List<String> values) {
            addCriterion("info_Qq in", values, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqNotIn(List<String> values) {
            addCriterion("info_Qq not in", values, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqBetween(String value1, String value2) {
            addCriterion("info_Qq between", value1, value2, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoQqNotBetween(String value1, String value2) {
            addCriterion("info_Qq not between", value1, value2, "infoQq");
            return (Criteria) this;
        }

        public Criteria andInfoWechatIsNull() {
            addCriterion("info_Wechat is null");
            return (Criteria) this;
        }

        public Criteria andInfoWechatIsNotNull() {
            addCriterion("info_Wechat is not null");
            return (Criteria) this;
        }

        public Criteria andInfoWechatEqualTo(String value) {
            addCriterion("info_Wechat =", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatNotEqualTo(String value) {
            addCriterion("info_Wechat <>", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatGreaterThan(String value) {
            addCriterion("info_Wechat >", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatGreaterThanOrEqualTo(String value) {
            addCriterion("info_Wechat >=", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatLessThan(String value) {
            addCriterion("info_Wechat <", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatLessThanOrEqualTo(String value) {
            addCriterion("info_Wechat <=", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatLike(String value) {
            addCriterion("info_Wechat like", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatNotLike(String value) {
            addCriterion("info_Wechat not like", value, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatIn(List<String> values) {
            addCriterion("info_Wechat in", values, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatNotIn(List<String> values) {
            addCriterion("info_Wechat not in", values, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatBetween(String value1, String value2) {
            addCriterion("info_Wechat between", value1, value2, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoWechatNotBetween(String value1, String value2) {
            addCriterion("info_Wechat not between", value1, value2, "infoWechat");
            return (Criteria) this;
        }

        public Criteria andInfoNoteIsNull() {
            addCriterion("info_Note is null");
            return (Criteria) this;
        }

        public Criteria andInfoNoteIsNotNull() {
            addCriterion("info_Note is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNoteEqualTo(String value) {
            addCriterion("info_Note =", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteNotEqualTo(String value) {
            addCriterion("info_Note <>", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteGreaterThan(String value) {
            addCriterion("info_Note >", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteGreaterThanOrEqualTo(String value) {
            addCriterion("info_Note >=", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteLessThan(String value) {
            addCriterion("info_Note <", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteLessThanOrEqualTo(String value) {
            addCriterion("info_Note <=", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteLike(String value) {
            addCriterion("info_Note like", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteNotLike(String value) {
            addCriterion("info_Note not like", value, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteIn(List<String> values) {
            addCriterion("info_Note in", values, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteNotIn(List<String> values) {
            addCriterion("info_Note not in", values, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteBetween(String value1, String value2) {
            addCriterion("info_Note between", value1, value2, "infoNote");
            return (Criteria) this;
        }

        public Criteria andInfoNoteNotBetween(String value1, String value2) {
            addCriterion("info_Note not between", value1, value2, "infoNote");
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