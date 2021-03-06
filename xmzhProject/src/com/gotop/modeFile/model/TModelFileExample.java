package com.gotop.modeFile.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class TModelFileExample {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TModelFileExample.class);

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
    public TModelFileExample() {
        oredCriteria = new ArrayList();
    }

    /** * @abatorgenerated  */
    protected TModelFileExample(TModelFileExample example) {
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
     * This class corresponds to the database table T_MODEL_FILE
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return this;
        }

        public Criteria andFileIdEqualTo(BigDecimal value) {
            addCriterion("FILE_ID =", value, "fileId");
            return this;
        }

        public Criteria andFileIdNotEqualTo(BigDecimal value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return this;
        }

        public Criteria andFileIdGreaterThan(BigDecimal value) {
            addCriterion("FILE_ID >", value, "fileId");
            return this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return this;
        }

        public Criteria andFileIdLessThan(BigDecimal value) {
            addCriterion("FILE_ID <", value, "fileId");
            return this;
        }

        public Criteria andFileIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return this;
        }

        public Criteria andFileIdIn(List values) {
            addCriterion("FILE_ID in", values, "fileId");
            return this;
        }

        public Criteria andFileIdNotIn(List values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return this;
        }

        public Criteria andFileIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return this;
        }

        public Criteria andFileIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return this;
        }

        public Criteria andExecutionIdIsNull() {
            addCriterion("EXECUTION_ID is null");
            return this;
        }

        public Criteria andExecutionIdIsNotNull() {
            addCriterion("EXECUTION_ID is not null");
            return this;
        }

        public Criteria andExecutionIdEqualTo(String value) {
            addCriterion("EXECUTION_ID =", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdNotEqualTo(String value) {
            addCriterion("EXECUTION_ID <>", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdGreaterThan(String value) {
            addCriterion("EXECUTION_ID >", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ID >=", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdLessThan(String value) {
            addCriterion("EXECUTION_ID <", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ID <=", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdLike(String value) {
            addCriterion("EXECUTION_ID like", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdNotLike(String value) {
            addCriterion("EXECUTION_ID not like", value, "executionId");
            return this;
        }

        public Criteria andExecutionIdIn(List values) {
            addCriterion("EXECUTION_ID in", values, "executionId");
            return this;
        }

        public Criteria andExecutionIdNotIn(List values) {
            addCriterion("EXECUTION_ID not in", values, "executionId");
            return this;
        }

        public Criteria andExecutionIdBetween(String value1, String value2) {
            addCriterion("EXECUTION_ID between", value1, value2, "executionId");
            return this;
        }

        public Criteria andExecutionIdNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_ID not between", value1, value2, "executionId");
            return this;
        }

        public Criteria andModeIdIsNull() {
            addCriterion("MODE_ID is null");
            return this;
        }

        public Criteria andModeIdIsNotNull() {
            addCriterion("MODE_ID is not null");
            return this;
        }

        public Criteria andModeIdEqualTo(String value) {
            addCriterion("MODE_ID =", value, "modeId");
            return this;
        }

        public Criteria andModeIdNotEqualTo(String value) {
            addCriterion("MODE_ID <>", value, "modeId");
            return this;
        }

        public Criteria andModeIdGreaterThan(String value) {
            addCriterion("MODE_ID >", value, "modeId");
            return this;
        }

        public Criteria andModeIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODE_ID >=", value, "modeId");
            return this;
        }

        public Criteria andModeIdLessThan(String value) {
            addCriterion("MODE_ID <", value, "modeId");
            return this;
        }

        public Criteria andModeIdLessThanOrEqualTo(String value) {
            addCriterion("MODE_ID <=", value, "modeId");
            return this;
        }

        public Criteria andModeIdLike(String value) {
            addCriterion("MODE_ID like", value, "modeId");
            return this;
        }

        public Criteria andModeIdNotLike(String value) {
            addCriterion("MODE_ID not like", value, "modeId");
            return this;
        }

        public Criteria andModeIdIn(List values) {
            addCriterion("MODE_ID in", values, "modeId");
            return this;
        }

        public Criteria andModeIdNotIn(List values) {
            addCriterion("MODE_ID not in", values, "modeId");
            return this;
        }

        public Criteria andModeIdBetween(String value1, String value2) {
            addCriterion("MODE_ID between", value1, value2, "modeId");
            return this;
        }

        public Criteria andModeIdNotBetween(String value1, String value2) {
            addCriterion("MODE_ID not between", value1, value2, "modeId");
            return this;
        }

        public Criteria andModeTypeIsNull() {
            addCriterion("MODE_TYPE is null");
            return this;
        }

        public Criteria andModeTypeIsNotNull() {
            addCriterion("MODE_TYPE is not null");
            return this;
        }

        public Criteria andModeTypeEqualTo(String value) {
            addCriterion("MODE_TYPE =", value, "modeType");
            return this;
        }

        public Criteria andModeTypeNotEqualTo(String value) {
            addCriterion("MODE_TYPE <>", value, "modeType");
            return this;
        }

        public Criteria andModeTypeGreaterThan(String value) {
            addCriterion("MODE_TYPE >", value, "modeType");
            return this;
        }

        public Criteria andModeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODE_TYPE >=", value, "modeType");
            return this;
        }

        public Criteria andModeTypeLessThan(String value) {
            addCriterion("MODE_TYPE <", value, "modeType");
            return this;
        }

        public Criteria andModeTypeLessThanOrEqualTo(String value) {
            addCriterion("MODE_TYPE <=", value, "modeType");
            return this;
        }

        public Criteria andModeTypeLike(String value) {
            addCriterion("MODE_TYPE like", value, "modeType");
            return this;
        }

        public Criteria andModeTypeNotLike(String value) {
            addCriterion("MODE_TYPE not like", value, "modeType");
            return this;
        }

        public Criteria andModeTypeIn(List values) {
            addCriterion("MODE_TYPE in", values, "modeType");
            return this;
        }

        public Criteria andModeTypeNotIn(List values) {
            addCriterion("MODE_TYPE not in", values, "modeType");
            return this;
        }

        public Criteria andModeTypeBetween(String value1, String value2) {
            addCriterion("MODE_TYPE between", value1, value2, "modeType");
            return this;
        }

        public Criteria andModeTypeNotBetween(String value1, String value2) {
            addCriterion("MODE_TYPE not between", value1, value2, "modeType");
            return this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("FILE_PATH is null");
            return this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("FILE_PATH is not null");
            return this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("FILE_PATH =", value, "filePath");
            return this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("FILE_PATH <>", value, "filePath");
            return this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("FILE_PATH >", value, "filePath");
            return this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_PATH >=", value, "filePath");
            return this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("FILE_PATH <", value, "filePath");
            return this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("FILE_PATH <=", value, "filePath");
            return this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("FILE_PATH like", value, "filePath");
            return this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("FILE_PATH not like", value, "filePath");
            return this;
        }

        public Criteria andFilePathIn(List values) {
            addCriterion("FILE_PATH in", values, "filePath");
            return this;
        }

        public Criteria andFilePathNotIn(List values) {
            addCriterion("FILE_PATH not in", values, "filePath");
            return this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("FILE_PATH between", value1, value2, "filePath");
            return this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("FILE_PATH not between", value1, value2, "filePath");
            return this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return this;
        }

        public Criteria andFileNameIn(List values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return this;
        }

        public Criteria andFileNameNotIn(List values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return this;
        }
    }
}