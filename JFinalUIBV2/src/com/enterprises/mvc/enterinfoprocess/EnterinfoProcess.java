package com.enterprises.mvc.enterinfoprocess;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 企业基本信息表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_bcommonenterprises", pkName = "ids")
public class EnterinfoProcess extends BaseModel<EnterinfoProcess> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(EnterinfoProcess.class);
	
	public static final EnterinfoProcess dao = new EnterinfoProcess();
	
	/**
	 * 字段描述：bcommonenterprisesoid
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_bcommonenterprisesoid = "bcommonenterprisesoid";
	
	/**
	 * 字段描述：name
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_name = "name";
	
	/**
	 * 字段描述：unitorgcode
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_unitorgcode = "unitorgcode";
	
	/**
	 * 字段描述：county
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_county = "county";
	
	/**
	 * 字段描述：address
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_address = "address";
	
	/**
	 * 字段描述：legalperson
	 * 字段类型：character varying  长度：150
	 */
	public static final String column_legalperson = "legalperson";
	
	/**
	 * 字段描述：linkman
	 * 字段类型：character varying  长度：150
	 */
	public static final String column_linkman = "linkman";
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：64
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：entertype
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_entertype = "entertype";
	
	/**
	 * 字段描述：createdby
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_createdby = "createdby";
	
	/**
	 * 字段描述：contact_fk
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_contact_fk = "contact_fk";
	
	/**
	 * 字段描述：telephone
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_telephone = "telephone";
	
	/**
	 * 字段描述：linkfax
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_linkfax = "linkfax";
	
	/**
	 * 字段描述：email
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_email = "email";
	
	
	/**
	 * sqlId : Enterprise.enterinfoProcess.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "Enterprise.enterinfoProcess.splitPageFrom";

	private String bcommonenterprisesoid;
	private String name;
	private String unitorgcode;
	private String county;
	private String address;
	private String legalperson;
	private String linkman;
	private String ids;
	private String entertype;
	private String createdby;
	private String contact_fk;
	private String telephone;
	private String linkfax;
	private String email;

	public void setBcommonenterprisesoid(String bcommonenterprisesoid){
		set(column_bcommonenterprisesoid, bcommonenterprisesoid);
	}
	public <T> T getBcommonenterprisesoid() {
		return get(column_bcommonenterprisesoid);
	}
	public void setName(String name){
		set(column_name, name);
	}
	public <T> T getName() {
		return get(column_name);
	}
	public void setUnitorgcode(String unitorgcode){
		set(column_unitorgcode, unitorgcode);
	}
	public <T> T getUnitorgcode() {
		return get(column_unitorgcode);
	}
	public void setCounty(String county){
		set(column_county, county);
	}
	public <T> T getCounty() {
		return get(column_county);
	}
	public void setAddress(String address){
		set(column_address, address);
	}
	public <T> T getAddress() {
		return get(column_address);
	}
	public void setLegalperson(String legalperson){
		set(column_legalperson, legalperson);
	}
	public <T> T getLegalperson() {
		return get(column_legalperson);
	}
	public void setLinkman(String linkman){
		set(column_linkman, linkman);
	}
	public <T> T getLinkman() {
		return get(column_linkman);
	}
	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setEntertype(String entertype){
		set(column_entertype, entertype);
	}
	public <T> T getEntertype() {
		return get(column_entertype);
	}
	public void setCreatedby(String createdby){
		set(column_createdby, createdby);
	}
	public <T> T getCreatedby() {
		return get(column_createdby);
	}
	public void setContact_fk(String contact_fk){
		set(column_contact_fk, contact_fk);
	}
	public <T> T getContact_fk() {
		return get(column_contact_fk);
	}
	public void setTelephone(String telephone){
		set(column_telephone, telephone);
	}
	public <T> T getTelephone() {
		return get(column_telephone);
	}
	public void setLinkfax(String linkfax){
		set(column_linkfax, linkfax);
	}
	public <T> T getLinkfax() {
		return get(column_linkfax);
	}
	public void setEmail(String email){
		set(column_email, email);
	}
	public <T> T getEmail() {
		return get(column_email);
	}
	
}
