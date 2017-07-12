package com.gotop.jbpm.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class TProcessConfigPersonExample {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TProcessConfigPersonExample.class);

    /**
     * 排序字段.
     * @abatorgenerated
     */
    protected String orderByClause;

    /**
     * sql条件.
     * @abatorgenerated
     */
    protected List oredCriteria;

    /**
     * 分页查询的起始行数.
     * @abatorgenerated
     */
    private Integer oracleStart;

    /**
     * 分页查询结束行数.
     * @abatorgenerated
     */
    private Integer oracleEnd;

    /** * @abatorgenerated  */
    public TProcessConfigPersonExample() {
        oredCriteria = new ArrayList();
    }

    /** * @abatorgenerated  */
    protected TProcessConfigPersonExample(TProcessConfigPersonExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.oracleStart = example.oracleStart;
        this.oracleEnd = example.oracleEnd;
    }

    /** * @abatorgenerated  */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** * @abatorgenerated  */
    /** * @abatorgenerated  */
    public String getOrderByClause() {
        return orderByClause;
    }

    /** * @abatorgenerated  */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /** * @abatorgenerated  */
    public Integer getOracleStart() {
        return oracleStart;
    }

    /** * @abatorgenerated  */
    public void setOracleStart(Integer oracleStart) {
        this.oracleStart = oracleStart;
    }

    /** * @abatorgenerated  */
    public Integer getOracleEnd() {
        return oracleEnd;
    }

    /** * @abatorgenerated  */
    public void setOracleEnd(Integer oracleEnd) {
        this.oracleEnd = oracleEnd;
    }

    /**
     * 增加整个新查询条件(Criteria)，增加后以or方式查询.
     * @abatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 创新新Criteria，如果为第一个则加入到Criteria列表。并且返回
     * @abatorgenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 仅创新新Criteria,并且返回
     * @abatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件
     * @abatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table T_PROCESS_CONFIG_PERSON
     *
     * @abatorgenerated 
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("ID in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("ID not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return this;
        }

        public Criteria andProcessConfigIdIsNull() {
            addCriterion("PROCESS_CONFIG_ID is null");
            return this;
        }

        public Criteria andProcessConfigIdIsNotNull() {
            addCriterion("PROCESS_CONFIG_ID is not null");
            return this;
        }

        public Criteria andProcessConfigIdEqualTo(Long value) {
            addCriterion("PROCESS_CONFIG_ID =", value, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdNotEqualTo(Long value) {
            addCriterion("PROCESS_CONFIG_ID <>", value, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdGreaterThan(Long value) {
            addCriterion("PROCESS_CONFIG_ID >", value, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESS_CONFIG_ID >=", value, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdLessThan(Long value) {
            addCriterion("PROCESS_CONFIG_ID <", value, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("PROCESS_CONFIG_ID <=", value, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdIn(List values) {
            addCriterion("PROCESS_CONFIG_ID in", values, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdNotIn(List values) {
            addCriterion("PROCESS_CONFIG_ID not in", values, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdBetween(Long value1, Long value2) {
            addCriterion("PROCESS_CONFIG_ID between", value1, value2, "processConfigId");
            return this;
        }

        public Criteria andProcessConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("PROCESS_CONFIG_ID not between", value1, value2, "processConfigId");
            return this;
        }

        public Criteria andRelationIdIsNull() {
            addCriterion("RELATION_ID is null");
            return this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("RELATION_ID is not null");
            return this;
        }

        public Criteria andRelationIdEqualTo(Long value) {
            addCriterion("RELATION_ID =", value, "relationId");
            return this;
        }

        public Criteria andRelationIdNotEqualTo(Long value) {
            addCriterion("RELATION_ID <>", value, "relationId");
            return this;
        }

        public Criteria andRelationIdGreaterThan(Long value) {
            addCriterion("RELATION_ID >", value, "relationId");
            return this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RELATION_ID >=", value, "relationId");
            return this;
        }

        public Criteria andRelationIdLessThan(Long value) {
            addCriterion("RELATION_ID <", value, "relationId");
            return this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Long value) {
            addCriterion("RELATION_ID <=", value, "relationId");
            return this;
        }

        public Criteria andRelationIdIn(List values) {
            addCriterion("RELATION_ID in", values, "relationId");
            return this;
        }

        public Criteria andRelationIdNotIn(List values) {
            addCriterion("RELATION_ID not in", values, "relationId");
            return this;
        }

        public Criteria andRelationIdBetween(Long value1, Long value2) {
            addCriterion("RELATION_ID between", value1, value2, "relationId");
            return this;
        }

        public Criteria andRelationIdNotBetween(Long value1, Long value2) {
            addCriterion("RELATION_ID not between", value1, value2, "relationId");
            return this;
        }
    }
}