package com.gotop.messageReceive.dao.impl;

import com.gotop.messageReceive.dao.ITMessageReceiveDAO;
import com.gotop.messageReceive.model.TMessageReceive;
import com.gotop.messageReceive.model.TMessageReceiveExample;
import com.gotop.util.dataSource.SqlMapClientDao;
import com.primeton.utils.Page;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

public class TMessageReceiveDAO extends SqlMapClientDao implements ITMessageReceiveDAO {
    /**
     * 
     * @abatorgenerated
     */
    protected Logger log = Logger.getLogger(TMessageReceiveDAO.class);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table XMZHPT.T_MESSAGE_RECEIVE
     *
     * @abatorgenerated 
     */
    public TMessageReceiveDAO() {
        super();
    }

    /**
     * 插入一条新数据.
     * @abatorgenerated
     */
    public void insert(TMessageReceive record) {
        getSqlMapClientTemplate().insert("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_insert", record);
    }

    /**
     * 通过主键更新一条全部字段内容
     * @abatorgenerated
     */
    public int updateByPrimaryKey(TMessageReceive record) {
        int rows = getSqlMapClientTemplate().update("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 通过主键更新部分字段，部分字段说明：当字段为null时不更新，当字段值为''空值是更新为空值
     * @abatorgenerated
     */
    public int updateByPrimaryKeySelective(TMessageReceive record) {
        int rows = getSqlMapClientTemplate().update("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 通过查询实例，查询记录
     * @abatorgenerated
     */
    public List selectByExample(TMessageReceiveExample example) {
        List list = queryForList("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * 通过Map方式的动态条件，查询分页数据
     * @abatorgenerated
     */
    public List selectByMapAndPage(HashMap example) {
        List list = queryForList("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_selectByMapAndPage", example);
        return list;
    }

    /**
     * 通过Bean方式的动态条件，查询分页数据
     * @abatorgenerated
     */
    public List selectByExampleAndPage(TMessageReceive record, TMessageReceiveExample example, Page page) {
         UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
         List list = queryForList("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_selectByExampleAndPage",parms,page);
        return list;
    }

    /**
     * 根据查询模板的查询结果扩展一个实例
     * @abatorgenerated
     * @param example 条件
     */
    public TMessageReceive expandEntityByTemplate(TMessageReceive example) {
        TMessageReceive result = (TMessageReceive)queryForObject("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_expandEntityByTemplate", example);
        return result;
    }

    /**
     * 根据Bean数据模板查询条件查询所有记录
     * @abatorgenerated
     * @param example 条件
     */
    public List queryEntitiesByTemplate(TMessageReceive example) {
        List<TMessageReceive> result = (List<TMessageReceive>)queryForList("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_queryEntitiesByTemplate", example);
        return result;
    }

    /**
     * 根据Bean数据模板分页查询
     * @abatorgenerated
     * @param example 条件
     * @param page 分页信息
     */
    public List queryEntitiesByTemplateWithPage(TMessageReceive example, Page page) {
        List<TMessageReceive> result = (List<TMessageReceive>)queryForList("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_queryEntitiesByTemplate", example,page);
        return result;
    }

    /**
     * 通过主键查询一条记录
     * @abatorgenerated
     */
    public TMessageReceive selectByPrimaryKey(Long recId) {
        TMessageReceive key = new TMessageReceive();
        key.setRecId(recId);
        TMessageReceive record = (TMessageReceive) queryForObject("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 通过查询实例，删除数据
     * @abatorgenerated
     */
    public int deleteByExample(TMessageReceiveExample example) {
        int rows = getSqlMapClientTemplate().delete("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 根据Bean数据模板查询条件更新记录
     * @abatorgenerated
     * @param example 条件
     */
    public int deleteByTemplate(TMessageReceive example) {
        int rows = getSqlMapClientTemplate().delete("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_deleteByTemplate", example);
        return rows;
    }

    /**
     * 通过主键删除一条记录
     * @abatorgenerated
     */
    public int deleteByPrimaryKey(Long recId) {
        TMessageReceive key = new TMessageReceive();
        key.setRecId(recId);
        int rows = getSqlMapClientTemplate().delete("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 通过查询实例，统计总数
     * @abatorgenerated
     */
    public int countByExample(TMessageReceiveExample example) {
        Integer count = (Integer)  queryForObject("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * 通过查询Bean数据模板，统计总数
     * @abatorgenerated
     * @param example 条件
     */
    public int countByTemplate(TMessageReceive example) {
        Integer rows = (Integer)queryForObject("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_countByTemplate", example);
        return rows.intValue();
    }

    /**
     * 通过查询实例，更新非null字段
     * @abatorgenerated
     */
    public int updateByExampleSelective(TMessageReceive record, TMessageReceiveExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 通过查询实例，更新全部字段
     * @abatorgenerated
     */
    public int updateByExample(TMessageReceive record, TMessageReceiveExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 根据Bean数据模板查询条件更新记录
     * @abatorgenerated
     * @param record 值
     * @param example 条件
     */
    public int updateEntityByTemplate(TMessageReceive record, TMessageReceive example) {
        HashMap<String,TMessageReceive> params = new HashMap<String,TMessageReceive>();
        params.put("record", record);
        params.put("template", example);
        int rows = getSqlMapClientTemplate().update("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_updateEntityByTemplate", params);
        return rows;
    }

    /**
     * 分页查询信息
     * @abatorgenerated
     */
    public List selectByDynamic(HashMap map, Page page) throws Exception {
        List list = queryForList("T_MESSAGE_RECEIVE_SqlMap.abatorgenerated_selectByDynamic", map, page);
        return list;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table XMZHPT.T_MESSAGE_RECEIVE
     *
     * @abatorgenerated 
     */
    private static class UpdateByExampleParms extends TMessageReceiveExample {
        private Object record;

        public UpdateByExampleParms(Object record, TMessageReceiveExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List<TMessageReceive> judgeIsReceived(TMessageReceive messageReceive) {
		  List list = queryForList("T_MESSAGE_RECEIVE_SqlMap.judgeIsReceived", messageReceive);
	        return list;
	}

	@Override
	public boolean judgeIsReaded(HashMap<String, Object> map) {
		boolean flag = false;
		  List list = queryForList("T_MESSAGE_RECEIVE_SqlMap.judgeIsReaded", map);
		  if(list.size() != 0){
			  flag = true;
		  }else{
			  flag = false;
		  }
		  return flag;
	}

	@Override
	public void deleteReaded(HashMap<String, Object> map) {
		delete("T_MESSAGE_RECEIVE_SqlMap.deleteReaded", map);
	}
}