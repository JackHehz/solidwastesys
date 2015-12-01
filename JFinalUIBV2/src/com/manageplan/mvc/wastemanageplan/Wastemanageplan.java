package com.manageplan.mvc.wastemanageplan;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 年度管理计划 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_wastemanageplan", pkName = "ids")
public class Wastemanageplan extends BaseModel<Wastemanageplan> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Wastemanageplan.class);
	
	public static final Wastemanageplan dao = new Wastemanageplan();

	public static final String fenyeflags="0";

	public static final String column_createdby = "createdby";
	/**
	 * 字段描述：year
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_year = "year";

	public static final String column_createdtime = "createdtime";
	
	/**
	 * 字段描述：documentname
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_documentname = "documentname";
	
	/**
	 * 字段描述：environmentname
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_environmentname = "environmentname";
	
	/**
	 * 字段描述：environmentphone
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_environmentphone = "environmentphone";
	
	/**
	 * 字段描述：sys_created
	 * 字段类型：character  长度：255
	 */
	public static final String column_sys_created = "sys_created";
	
	/**
	 * 字段描述：statename
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_statename = "statename";
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：64
	 */
	public static final String column_ids = "ids";
	
	
	/**
	 * sqlId : manageplan.wastemanageplan.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "manageplan.wastemanageplan.splitPageFrom";
	public static final String sqlId_splitpage_from = "manageplan.wastemanageplan.splitpageFrom";

	private String year;
	private String createdby;
	private String createdtime;
	private String documentname;
	private String environmentname;
	private String environmentphone;
	private String sys_created;
	private String statename;
	private String ids;

	public void setYear(String year){
		set(column_year, year);
	}
	public <T> T getYear() {
		return get(column_year);
	}
	public void setCretedtime(String createdtime){
		set(column_createdtime, createdtime);
	}
	public <T> T getCreatedtime() {
		return get(column_createdtime);
	}
	public void setCretedby(String createdby){
		set(column_createdby, createdby);
	}
	public <T> T getCreatedby() {
		return get(column_createdby);
	}
	public void setDocumentname(String documentname){
		set(column_documentname, documentname);
	}
	public <T> T getDocumentname() {
		return get(column_documentname);
	}
	public void setEnvironmentname(String environmentname){
		set(column_environmentname, environmentname);
	}
	public <T> T getEnvironmentname() {
		return get(column_environmentname);
	}
	public void setEnvironmentphone(String environmentphone){
		set(column_environmentphone, environmentphone);
	}
	public <T> T getEnvironmentphone() {
		return get(column_environmentphone);
	}
	public void setSys_created(String sys_created){
		set(column_sys_created, sys_created);
	}
	public <T> T getSys_created() {
		return get(column_sys_created);
	}
	public void setStatename(String statename){
		set(column_statename, statename);
	}
	public <T> T getStatename() {
		return get(column_statename);
	}
	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	
}
