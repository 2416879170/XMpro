package com.gotop.tyjg.stable.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;


public class AtFileuploadExample {
    /**
	 * @abatorgenerated
	 */
	protected Logger log = Logger.getLogger(AtFileuploadExample.class);
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

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table AT_FILEUPLOAD
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andFileIdEqualTo(String value) {
			addCriterion("FILE_ID =", value, "fileId");
			return this;
		}

		public Criteria andFileIdNotEqualTo(String value) {
			addCriterion("FILE_ID <>", value, "fileId");
			return this;
		}

		public Criteria andFileIdGreaterThan(String value) {
			addCriterion("FILE_ID >", value, "fileId");
			return this;
		}

		public Criteria andFileIdGreaterThanOrEqualTo(String value) {
			addCriterion("FILE_ID >=", value, "fileId");
			return this;
		}

		public Criteria andFileIdLessThan(String value) {
			addCriterion("FILE_ID <", value, "fileId");
			return this;
		}

		public Criteria andFileIdLessThanOrEqualTo(String value) {
			addCriterion("FILE_ID <=", value, "fileId");
			return this;
		}

		public Criteria andFileIdLike(String value) {
			addCriterion("FILE_ID like", value, "fileId");
			return this;
		}

		public Criteria andFileIdNotLike(String value) {
			addCriterion("FILE_ID not like", value, "fileId");
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

		public Criteria andFileIdBetween(String value1, String value2) {
			addCriterion("FILE_ID between", value1, value2, "fileId");
			return this;
		}

		public Criteria andFileIdNotBetween(String value1, String value2) {
			addCriterion("FILE_ID not between", value1, value2, "fileId");
			return this;
		}

		public Criteria andFileCatalogIsNull() {
			addCriterion("FILE_CATALOG is null");
			return this;
		}

		public Criteria andFileCatalogIsNotNull() {
			addCriterion("FILE_CATALOG is not null");
			return this;
		}

		public Criteria andFileCatalogEqualTo(String value) {
			addCriterion("FILE_CATALOG =", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogNotEqualTo(String value) {
			addCriterion("FILE_CATALOG <>", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogGreaterThan(String value) {
			addCriterion("FILE_CATALOG >", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogGreaterThanOrEqualTo(String value) {
			addCriterion("FILE_CATALOG >=", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogLessThan(String value) {
			addCriterion("FILE_CATALOG <", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogLessThanOrEqualTo(String value) {
			addCriterion("FILE_CATALOG <=", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogLike(String value) {
			addCriterion("FILE_CATALOG like", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogNotLike(String value) {
			addCriterion("FILE_CATALOG not like", value, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogIn(List values) {
			addCriterion("FILE_CATALOG in", values, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogNotIn(List values) {
			addCriterion("FILE_CATALOG not in", values, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogBetween(String value1, String value2) {
			addCriterion("FILE_CATALOG between", value1, value2, "fileCatalog");
			return this;
		}

		public Criteria andFileCatalogNotBetween(String value1, String value2) {
			addCriterion("FILE_CATALOG not between", value1, value2,
					"fileCatalog");
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

		public Criteria andFileNewNameIsNull() {
			addCriterion("FILE_NEW_NAME is null");
			return this;
		}

		public Criteria andFileNewNameIsNotNull() {
			addCriterion("FILE_NEW_NAME is not null");
			return this;
		}

		public Criteria andFileNewNameEqualTo(String value) {
			addCriterion("FILE_NEW_NAME =", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameNotEqualTo(String value) {
			addCriterion("FILE_NEW_NAME <>", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameGreaterThan(String value) {
			addCriterion("FILE_NEW_NAME >", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameGreaterThanOrEqualTo(String value) {
			addCriterion("FILE_NEW_NAME >=", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameLessThan(String value) {
			addCriterion("FILE_NEW_NAME <", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameLessThanOrEqualTo(String value) {
			addCriterion("FILE_NEW_NAME <=", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameLike(String value) {
			addCriterion("FILE_NEW_NAME like", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameNotLike(String value) {
			addCriterion("FILE_NEW_NAME not like", value, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameIn(List values) {
			addCriterion("FILE_NEW_NAME in", values, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameNotIn(List values) {
			addCriterion("FILE_NEW_NAME not in", values, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameBetween(String value1, String value2) {
			addCriterion("FILE_NEW_NAME between", value1, value2, "fileNewName");
			return this;
		}

		public Criteria andFileNewNameNotBetween(String value1, String value2) {
			addCriterion("FILE_NEW_NAME not between", value1, value2,
					"fileNewName");
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

		public Criteria andAbsolutepathIsNull() {
			addCriterion("ABSOLUTEPATH is null");
			return this;
		}

		public Criteria andAbsolutepathIsNotNull() {
			addCriterion("ABSOLUTEPATH is not null");
			return this;
		}

		public Criteria andAbsolutepathEqualTo(String value) {
			addCriterion("ABSOLUTEPATH =", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathNotEqualTo(String value) {
			addCriterion("ABSOLUTEPATH <>", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathGreaterThan(String value) {
			addCriterion("ABSOLUTEPATH >", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathGreaterThanOrEqualTo(String value) {
			addCriterion("ABSOLUTEPATH >=", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathLessThan(String value) {
			addCriterion("ABSOLUTEPATH <", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathLessThanOrEqualTo(String value) {
			addCriterion("ABSOLUTEPATH <=", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathLike(String value) {
			addCriterion("ABSOLUTEPATH like", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathNotLike(String value) {
			addCriterion("ABSOLUTEPATH not like", value, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathIn(List values) {
			addCriterion("ABSOLUTEPATH in", values, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathNotIn(List values) {
			addCriterion("ABSOLUTEPATH not in", values, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathBetween(String value1, String value2) {
			addCriterion("ABSOLUTEPATH between", value1, value2, "absolutepath");
			return this;
		}

		public Criteria andAbsolutepathNotBetween(String value1, String value2) {
			addCriterion("ABSOLUTEPATH not between", value1, value2,
					"absolutepath");
			return this;
		}

		public Criteria andFileSizeIsNull() {
			addCriterion("FILE_SIZE is null");
			return this;
		}

		public Criteria andFileSizeIsNotNull() {
			addCriterion("FILE_SIZE is not null");
			return this;
		}

		public Criteria andFileSizeEqualTo(Long value) {
			addCriterion("FILE_SIZE =", value, "fileSize");
			return this;
		}

		public Criteria andFileSizeNotEqualTo(Long value) {
			addCriterion("FILE_SIZE <>", value, "fileSize");
			return this;
		}

		public Criteria andFileSizeGreaterThan(Long value) {
			addCriterion("FILE_SIZE >", value, "fileSize");
			return this;
		}

		public Criteria andFileSizeGreaterThanOrEqualTo(Long value) {
			addCriterion("FILE_SIZE >=", value, "fileSize");
			return this;
		}

		public Criteria andFileSizeLessThan(Long value) {
			addCriterion("FILE_SIZE <", value, "fileSize");
			return this;
		}

		public Criteria andFileSizeLessThanOrEqualTo(Long value) {
			addCriterion("FILE_SIZE <=", value, "fileSize");
			return this;
		}

		public Criteria andFileSizeIn(List values) {
			addCriterion("FILE_SIZE in", values, "fileSize");
			return this;
		}

		public Criteria andFileSizeNotIn(List values) {
			addCriterion("FILE_SIZE not in", values, "fileSize");
			return this;
		}

		public Criteria andFileSizeBetween(Long value1, Long value2) {
			addCriterion("FILE_SIZE between", value1, value2, "fileSize");
			return this;
		}

		public Criteria andFileSizeNotBetween(Long value1, Long value2) {
			addCriterion("FILE_SIZE not between", value1, value2, "fileSize");
			return this;
		}

		public Criteria andFileTypeIsNull() {
			addCriterion("FILE_TYPE is null");
			return this;
		}

		public Criteria andFileTypeIsNotNull() {
			addCriterion("FILE_TYPE is not null");
			return this;
		}

		public Criteria andFileTypeEqualTo(String value) {
			addCriterion("FILE_TYPE =", value, "fileType");
			return this;
		}

		public Criteria andFileTypeNotEqualTo(String value) {
			addCriterion("FILE_TYPE <>", value, "fileType");
			return this;
		}

		public Criteria andFileTypeGreaterThan(String value) {
			addCriterion("FILE_TYPE >", value, "fileType");
			return this;
		}

		public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
			addCriterion("FILE_TYPE >=", value, "fileType");
			return this;
		}

		public Criteria andFileTypeLessThan(String value) {
			addCriterion("FILE_TYPE <", value, "fileType");
			return this;
		}

		public Criteria andFileTypeLessThanOrEqualTo(String value) {
			addCriterion("FILE_TYPE <=", value, "fileType");
			return this;
		}

		public Criteria andFileTypeLike(String value) {
			addCriterion("FILE_TYPE like", value, "fileType");
			return this;
		}

		public Criteria andFileTypeNotLike(String value) {
			addCriterion("FILE_TYPE not like", value, "fileType");
			return this;
		}

		public Criteria andFileTypeIn(List values) {
			addCriterion("FILE_TYPE in", values, "fileType");
			return this;
		}

		public Criteria andFileTypeNotIn(List values) {
			addCriterion("FILE_TYPE not in", values, "fileType");
			return this;
		}

		public Criteria andFileTypeBetween(String value1, String value2) {
			addCriterion("FILE_TYPE between", value1, value2, "fileType");
			return this;
		}

		public Criteria andFileTypeNotBetween(String value1, String value2) {
			addCriterion("FILE_TYPE not between", value1, value2, "fileType");
			return this;
		}

		public Criteria andFileTimeIsNull() {
			addCriterion("FILE_TIME is null");
			return this;
		}

		public Criteria andFileTimeIsNotNull() {
			addCriterion("FILE_TIME is not null");
			return this;
		}

		public Criteria andFileTimeEqualTo(Date value) {
			addCriterion("FILE_TIME =", value, "fileTime");
			return this;
		}

		public Criteria andFileTimeNotEqualTo(Date value) {
			addCriterion("FILE_TIME <>", value, "fileTime");
			return this;
		}

		public Criteria andFileTimeGreaterThan(Date value) {
			addCriterion("FILE_TIME >", value, "fileTime");
			return this;
		}

		public Criteria andFileTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("FILE_TIME >=", value, "fileTime");
			return this;
		}

		public Criteria andFileTimeLessThan(Date value) {
			addCriterion("FILE_TIME <", value, "fileTime");
			return this;
		}

		public Criteria andFileTimeLessThanOrEqualTo(Date value) {
			addCriterion("FILE_TIME <=", value, "fileTime");
			return this;
		}

		public Criteria andFileTimeIn(List values) {
			addCriterion("FILE_TIME in", values, "fileTime");
			return this;
		}

		public Criteria andFileTimeNotIn(List values) {
			addCriterion("FILE_TIME not in", values, "fileTime");
			return this;
		}

		public Criteria andFileTimeBetween(Date value1, Date value2) {
			addCriterion("FILE_TIME between", value1, value2, "fileTime");
			return this;
		}

		public Criteria andFileTimeNotBetween(Date value1, Date value2) {
			addCriterion("FILE_TIME not between", value1, value2, "fileTime");
			return this;
		}

		public Criteria andFileSaveIsNull() {
			addCriterion("FILE_SAVE is null");
			return this;
		}

		public Criteria andFileSaveIsNotNull() {
			addCriterion("FILE_SAVE is not null");
			return this;
		}

		public Criteria andFileSaveEqualTo(String value) {
			addCriterion("FILE_SAVE =", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveNotEqualTo(String value) {
			addCriterion("FILE_SAVE <>", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveGreaterThan(String value) {
			addCriterion("FILE_SAVE >", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveGreaterThanOrEqualTo(String value) {
			addCriterion("FILE_SAVE >=", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveLessThan(String value) {
			addCriterion("FILE_SAVE <", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveLessThanOrEqualTo(String value) {
			addCriterion("FILE_SAVE <=", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveLike(String value) {
			addCriterion("FILE_SAVE like", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveNotLike(String value) {
			addCriterion("FILE_SAVE not like", value, "fileSave");
			return this;
		}

		public Criteria andFileSaveIn(List values) {
			addCriterion("FILE_SAVE in", values, "fileSave");
			return this;
		}

		public Criteria andFileSaveNotIn(List values) {
			addCriterion("FILE_SAVE not in", values, "fileSave");
			return this;
		}

		public Criteria andFileSaveBetween(String value1, String value2) {
			addCriterion("FILE_SAVE between", value1, value2, "fileSave");
			return this;
		}

		public Criteria andFileSaveNotBetween(String value1, String value2) {
			addCriterion("FILE_SAVE not between", value1, value2, "fileSave");
			return this;
		}

		public Criteria andContentIsNull() {
			addCriterion("CONTENT is null");
			return this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("CONTENT is not null");
			return this;
		}

		public Criteria andContentEqualTo(byte[] value) {
			addCriterion("CONTENT =", value, "content");
			return this;
		}

		public Criteria andContentNotEqualTo(byte[] value) {
			addCriterion("CONTENT <>", value, "content");
			return this;
		}

		public Criteria andContentGreaterThan(byte[] value) {
			addCriterion("CONTENT >", value, "content");
			return this;
		}

		public Criteria andContentGreaterThanOrEqualTo(byte[] value) {
			addCriterion("CONTENT >=", value, "content");
			return this;
		}

		public Criteria andContentLessThan(byte[] value) {
			addCriterion("CONTENT <", value, "content");
			return this;
		}

		public Criteria andContentLessThanOrEqualTo(byte[] value) {
			addCriterion("CONTENT <=", value, "content");
			return this;
		}

		public Criteria andContentIn(List values) {
			addCriterion("CONTENT in", values, "content");
			return this;
		}

		public Criteria andContentNotIn(List values) {
			addCriterion("CONTENT not in", values, "content");
			return this;
		}

		public Criteria andContentBetween(Object value1, Object value2) {
			addCriterion("CONTENT between", value1, value2, "content");
			return this;
		}

		public Criteria andContentNotBetween(Object value1, Object value2) {
			addCriterion("CONTENT not between", value1, value2, "content");
			return this;
		}

		public Criteria andOperatoridIsNull() {
			addCriterion("OPERATORID is null");
			return this;
		}

		public Criteria andOperatoridIsNotNull() {
			addCriterion("OPERATORID is not null");
			return this;
		}

		public Criteria andOperatoridEqualTo(Long value) {
			addCriterion("OPERATORID =", value, "operatorid");
			return this;
		}

		public Criteria andOperatoridNotEqualTo(Long value) {
			addCriterion("OPERATORID <>", value, "operatorid");
			return this;
		}

		public Criteria andOperatoridGreaterThan(Long value) {
			addCriterion("OPERATORID >", value, "operatorid");
			return this;
		}

		public Criteria andOperatoridGreaterThanOrEqualTo(Long value) {
			addCriterion("OPERATORID >=", value, "operatorid");
			return this;
		}

		public Criteria andOperatoridLessThan(Long value) {
			addCriterion("OPERATORID <", value, "operatorid");
			return this;
		}

		public Criteria andOperatoridLessThanOrEqualTo(Long value) {
			addCriterion("OPERATORID <=", value, "operatorid");
			return this;
		}

		public Criteria andOperatoridIn(List values) {
			addCriterion("OPERATORID in", values, "operatorid");
			return this;
		}

		public Criteria andOperatoridNotIn(List values) {
			addCriterion("OPERATORID not in", values, "operatorid");
			return this;
		}

		public Criteria andOperatoridBetween(Long value1, Long value2) {
			addCriterion("OPERATORID between", value1, value2, "operatorid");
			return this;
		}

		public Criteria andOperatoridNotBetween(Long value1, Long value2) {
			addCriterion("OPERATORID not between", value1, value2, "operatorid");
			return this;
		}

		public Criteria andOperatornameIsNull() {
			addCriterion("OPERATORNAME is null");
			return this;
		}

		public Criteria andOperatornameIsNotNull() {
			addCriterion("OPERATORNAME is not null");
			return this;
		}

		public Criteria andOperatornameEqualTo(String value) {
			addCriterion("OPERATORNAME =", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotEqualTo(String value) {
			addCriterion("OPERATORNAME <>", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameGreaterThan(String value) {
			addCriterion("OPERATORNAME >", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
			addCriterion("OPERATORNAME >=", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameLessThan(String value) {
			addCriterion("OPERATORNAME <", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameLessThanOrEqualTo(String value) {
			addCriterion("OPERATORNAME <=", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameLike(String value) {
			addCriterion("OPERATORNAME like", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotLike(String value) {
			addCriterion("OPERATORNAME not like", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameIn(List values) {
			addCriterion("OPERATORNAME in", values, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotIn(List values) {
			addCriterion("OPERATORNAME not in", values, "operatorname");
			return this;
		}

		public Criteria andOperatornameBetween(String value1, String value2) {
			addCriterion("OPERATORNAME between", value1, value2, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotBetween(String value1, String value2) {
			addCriterion("OPERATORNAME not between", value1, value2,
					"operatorname");
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

		public Criteria andRelationIdEqualTo(String value) {
			addCriterion("RELATION_ID =", value, "relationId");
			return this;
		}

		public Criteria andRelationIdNotEqualTo(String value) {
			addCriterion("RELATION_ID <>", value, "relationId");
			return this;
		}

		public Criteria andRelationIdGreaterThan(String value) {
			addCriterion("RELATION_ID >", value, "relationId");
			return this;
		}

		public Criteria andRelationIdGreaterThanOrEqualTo(String value) {
			addCriterion("RELATION_ID >=", value, "relationId");
			return this;
		}

		public Criteria andRelationIdLessThan(String value) {
			addCriterion("RELATION_ID <", value, "relationId");
			return this;
		}

		public Criteria andRelationIdLessThanOrEqualTo(String value) {
			addCriterion("RELATION_ID <=", value, "relationId");
			return this;
		}

		public Criteria andRelationIdLike(String value) {
			addCriterion("RELATION_ID like", value, "relationId");
			return this;
		}

		public Criteria andRelationIdNotLike(String value) {
			addCriterion("RELATION_ID not like", value, "relationId");
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

		public Criteria andRelationIdBetween(String value1, String value2) {
			addCriterion("RELATION_ID between", value1, value2, "relationId");
			return this;
		}

		public Criteria andRelationIdNotBetween(String value1, String value2) {
			addCriterion("RELATION_ID not between", value1, value2,
					"relationId");
			return this;
		}

		public Criteria andGroupIdIsNull() {
			addCriterion("GROUP_ID is null");
			return this;
		}

		public Criteria andGroupIdIsNotNull() {
			addCriterion("GROUP_ID is not null");
			return this;
		}

		public Criteria andGroupIdEqualTo(String value) {
			addCriterion("GROUP_ID =", value, "groupId");
			return this;
		}

		public Criteria andGroupIdNotEqualTo(String value) {
			addCriterion("GROUP_ID <>", value, "groupId");
			return this;
		}

		public Criteria andGroupIdGreaterThan(String value) {
			addCriterion("GROUP_ID >", value, "groupId");
			return this;
		}

		public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
			addCriterion("GROUP_ID >=", value, "groupId");
			return this;
		}

		public Criteria andGroupIdLessThan(String value) {
			addCriterion("GROUP_ID <", value, "groupId");
			return this;
		}

		public Criteria andGroupIdLessThanOrEqualTo(String value) {
			addCriterion("GROUP_ID <=", value, "groupId");
			return this;
		}

		public Criteria andGroupIdLike(String value) {
			addCriterion("GROUP_ID like", value, "groupId");
			return this;
		}

		public Criteria andGroupIdNotLike(String value) {
			addCriterion("GROUP_ID not like", value, "groupId");
			return this;
		}

		public Criteria andGroupIdIn(List values) {
			addCriterion("GROUP_ID in", values, "groupId");
			return this;
		}

		public Criteria andGroupIdNotIn(List values) {
			addCriterion("GROUP_ID not in", values, "groupId");
			return this;
		}

		public Criteria andGroupIdBetween(String value1, String value2) {
			addCriterion("GROUP_ID between", value1, value2, "groupId");
			return this;
		}

		public Criteria andGroupIdNotBetween(String value1, String value2) {
			addCriterion("GROUP_ID not between", value1, value2, "groupId");
			return this;
		}

		public Criteria andAttachmentSrcIdIsNull() {
			addCriterion("ATTACHMENT_SRC_ID is null");
			return this;
		}

		public Criteria andAttachmentSrcIdIsNotNull() {
			addCriterion("ATTACHMENT_SRC_ID is not null");
			return this;
		}

		public Criteria andAttachmentSrcIdEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_ID =", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdNotEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_ID <>", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdGreaterThan(String value) {
			addCriterion("ATTACHMENT_SRC_ID >", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdGreaterThanOrEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_ID >=", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdLessThan(String value) {
			addCriterion("ATTACHMENT_SRC_ID <", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdLessThanOrEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_ID <=", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdLike(String value) {
			addCriterion("ATTACHMENT_SRC_ID like", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdNotLike(String value) {
			addCriterion("ATTACHMENT_SRC_ID not like", value, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdIn(List values) {
			addCriterion("ATTACHMENT_SRC_ID in", values, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdNotIn(List values) {
			addCriterion("ATTACHMENT_SRC_ID not in", values, "attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdBetween(String value1, String value2) {
			addCriterion("ATTACHMENT_SRC_ID between", value1, value2,
					"attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcIdNotBetween(String value1,
				String value2) {
			addCriterion("ATTACHMENT_SRC_ID not between", value1, value2,
					"attachmentSrcId");
			return this;
		}

		public Criteria andAttachmentSrcCdIsNull() {
			addCriterion("ATTACHMENT_SRC_CD is null");
			return this;
		}

		public Criteria andAttachmentSrcCdIsNotNull() {
			addCriterion("ATTACHMENT_SRC_CD is not null");
			return this;
		}

		public Criteria andAttachmentSrcCdEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_CD =", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdNotEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_CD <>", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdGreaterThan(String value) {
			addCriterion("ATTACHMENT_SRC_CD >", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdGreaterThanOrEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_CD >=", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdLessThan(String value) {
			addCriterion("ATTACHMENT_SRC_CD <", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdLessThanOrEqualTo(String value) {
			addCriterion("ATTACHMENT_SRC_CD <=", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdLike(String value) {
			addCriterion("ATTACHMENT_SRC_CD like", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdNotLike(String value) {
			addCriterion("ATTACHMENT_SRC_CD not like", value, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdIn(List values) {
			addCriterion("ATTACHMENT_SRC_CD in", values, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdNotIn(List values) {
			addCriterion("ATTACHMENT_SRC_CD not in", values, "attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdBetween(String value1, String value2) {
			addCriterion("ATTACHMENT_SRC_CD between", value1, value2,
					"attachmentSrcCd");
			return this;
		}

		public Criteria andAttachmentSrcCdNotBetween(String value1,
				String value2) {
			addCriterion("ATTACHMENT_SRC_CD not between", value1, value2,
					"attachmentSrcCd");
			return this;
		}
	}

	/**
     * @abatorgenerated */
    public AtFileuploadExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * @abatorgenerated */
    protected AtFileuploadExample(AtFileuploadExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.oracleStart = example.oracleStart;
        this.oracleEnd = example.oracleEnd;
    }

    /**
     * @abatorgenerated */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @abatorgenerated */
    /**
     * @abatorgenerated */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @abatorgenerated */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @abatorgenerated */
    public Integer getOracleStart() {
        return oracleStart;
    }

    /**
     * @abatorgenerated */
    public void setOracleStart(Integer oracleStart) {
        this.oracleStart = oracleStart;
    }

    /**
     * @abatorgenerated */
    public Integer getOracleEnd() {
        return oracleEnd;
    }

    /**
     * @abatorgenerated */
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
}