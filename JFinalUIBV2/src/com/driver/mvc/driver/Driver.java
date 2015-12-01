package com.driver.mvc.driver;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 驾驶员 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_driver", pkName = "ids")
public class Driver extends BaseModel<Driver> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Driver.class);
	
	public static final Driver dao = new Driver();

	public static final String fenyeflags="0";
	
	/**
	 * 字段描述：主键 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：名字 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_name = "name";
	
	/**
	 * 字段描述：性别 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sex = "sex";
	
	/**
	 * 字段描述：所属企业 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_enterprise = "enterprise";
	
	/**
	 * 字段描述：联系电话 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_mobilephone = "mobilephone";
	
	/**
	 * 字段描述：身份证号 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_identitycard = "identitycard";
	
	/**
	 * 字段描述：创建者 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_creatby = "creatby";
	
	
	/**
	 * sqlId : driver.driver.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "driver.driver.splitPageFrom";

	private String ids;
	private String name;
	private String sex;
	private String enterprise;
	private String mobilephone;
	private String identitycard;
	private String creatby;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setName(String name){
		set(column_name, name);
	}
	public <T> T getName() {
		return get(column_name);
	}
	public void setSex(String sex){
		set(column_sex, sex);
	}
	public <T> T getSex() {
		return get(column_sex);
	}
	public void setEnterprise(String enterprise){
		set(column_enterprise, enterprise);
	}
	public <T> T getEnterprise() {
		return get(column_enterprise);
	}
	public void setMobilephone(String mobilephone){
		set(column_mobilephone, mobilephone);
	}
	public <T> T getMobilephone() {
		return get(column_mobilephone);
	}
	public void setIdentitycard(String identitycard){
		set(column_identitycard, identitycard);
	}
	public <T> T getIdentitycard() {
		return get(column_identitycard);
	}
	public void setCreatby(String creatby){
		set(column_creatby, creatby);
	}
	public <T> T getCreatby() {
		return get(column_creatby);
	}
	
}
