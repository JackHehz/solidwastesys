package com.plan.mvc.transplan;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import com.platform.mvc.user.UserInfo;
import org.apache.log4j.Logger;

/**
 * 转移计划 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_transplan")
public class Transplan extends BaseModel<Transplan> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Transplan.class);
	
	public static final Transplan dao = new Transplan();

	public static final String sqlId_splitPage_select = "plan.transplan.splitPageSelect";


	public  static  String tranplan_fk="ttransbscinfo_fk";
	
	/**
	 * 字段描述：主键 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：危险废物名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wastename = "wastename";
	
	/**
	 * 字段描述：废物类型 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wastetype = "wastetype";
	
	/**
	 * 字段描述：转移数量 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wasteamount = "wasteamount";
	
	/**
	 * 字段描述：单位 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wasteunit = "wasteunit";
	
	/**
	 * 字段描述：转移批次 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_transbatch = "transbatch";
	
	/**
	 * 字段描述：转移开始时间 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_transstarttime = "transstarttime";
	
	/**
	 * 字段描述：转移结束时间 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_transendtime = "transendtime";
	
	/**
	 * 字段描述：处置方式 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wastetreatment = "wastetreatment";
	
	/**
	 * 字段描述：外键 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ttransbscinfo_fk = "ttransbscinfo_fk";

	public static final String column_wastecode = "wastecode";
	
	
	/**
	 * sqlId : plan.transplan.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "plan.transplan.splitPageFrom";
	public static final String sqlId_splitpage_from = "plan.transplan.splitpageFrom";


	public static final String sqlId_addsplitpage_from = "plan.transplan.addsplitpageFrom";

	private String ids;
	private String wastename;
	private String wastetype;
	private String wasteamount;
	private String wasteunit;
	private String transbatch;
	private String transstarttime;
	private String transendtime;
	private String wastetreatment;
	private String ttransbscinfo_fk;
	private String wastecode;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setWastename(String wastename){
		set(column_wastename, wastename);
	}
	public <T> T getWastename() {
		return get(column_wastename);
	}
	public void setWastetype(String wastetype){
		set(column_wastetype, wastetype);
	}
	public <T> T getWastetype() {
		return get(column_wastetype);
	}
	public void setWasteamount(String wasteamount){
		set(column_wasteamount, wasteamount);
	}
	public <T> T getWasteamount() {
		return get(column_wasteamount);
	}
	public void setWasteunit(String wasteunit){
		set(column_wasteunit, wasteunit);
	}
	public <T> T getWasteunit() {
		return get(column_wasteunit);
	}
	public void setTransbatch(String transbatch){
		set(column_transbatch, transbatch);
	}
	public <T> T getTransbatch() {
		return get(column_transbatch);
	}
	public void setTransstarttime(String transstarttime){
		set(column_transstarttime, transstarttime);
	}
	public <T> T getTransstarttime() {
		return get(column_transstarttime);
	}
	public void setTransendtime(String transendtime){
		set(column_transendtime, transendtime);
	}
	public <T> T getTransendtime() {
		return get(column_transendtime);
	}
	public void setWastetreatment(String wastetreatment){
		set(column_wastetreatment, wastetreatment);
	}
	public <T> T getWastetreatment() {
		return get(column_wastetreatment);
	}
	public void setTtransbscinfo_fk(String ttransbscinfo_fk){
		set(column_ttransbscinfo_fk, ttransbscinfo_fk);
	}
	public <T> T getTtransbscinfo_fk() {
		return get(column_ttransbscinfo_fk);
	}
	public void setWastecode(String wastecode){
		set(column_wastecode, wastecode);
	}
	public <T> T getWastecode() {
		return get(column_wastecode);
	}

	public Transplanunion getTransplanunion(){
		String ttransbscinfo_fk = get(column_ttransbscinfo_fk);
		if(null != ttransbscinfo_fk && !ttransbscinfo_fk.isEmpty()){
			return Transplanunion.dao.findById(ttransbscinfo_fk);
		}
		return null;
	}

}
