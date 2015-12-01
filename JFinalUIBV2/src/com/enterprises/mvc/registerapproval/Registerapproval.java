package com.enterprises.mvc.registerapproval;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 注册审批表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_register", pkName = "ids")
public class Registerapproval extends BaseModel<Registerapproval> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Registerapproval.class);
	
	public static final Registerapproval dao = new Registerapproval();
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：64
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：userids
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_userids = "userids";
	
	/**
	 * 字段描述：enterpriseids
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_enterpriseids = "enterpriseids";
	
	
	/**
	 * sqlId : Enterprise.registerapproval.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "Enterprise.registerapproval.splitPageFrom";

	private String ids;
	private String userids;
	private String enterpriseids;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setUserids(String userids){
		set(column_userids, userids);
	}
	public <T> T getUserids() {
		return get(column_userids);
	}
	public void setEnterpriseids(String enterpriseids){
		set(column_enterpriseids, enterpriseids);
	}
	public <T> T getEnterpriseids() {
		return get(column_enterpriseids);
	}
	
}
