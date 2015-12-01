package com.msjwastecolldisp.mvc.msjwastecolldisp;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.math.BigDecimal; 
import java.sql.Timestamp; 

import org.apache.log4j.Logger;

/**
 * 经营日报表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_msjwastecolldisp", pkName = "ids")
public class Msjwastecolldisp extends BaseModel<Msjwastecolldisp> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Msjwastecolldisp.class);
	
	public static final Msjwastecolldisp dao = new Msjwastecolldisp();

	public static final String fenyeflags="1";
	
	/**
	 * 字段描述：编号 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：单位名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_name = "name";
	
	/**
	 * 字段描述：日期 
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_date = "date";
	
	/**
	 * 字段描述：废物类型 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_wastetype = "wastetype";
	
	/**
	 * 字段描述：处置量 
	 * 字段类型：numeric  长度：null
	 */
	public static final String column_disnum = "disnum";
	
	/**
	 * 字段描述：处置剩余量 
	 * 字段类型：integer  长度：null
	 */
	public static final String column_wasteunit = "wasteunit";
	
	/**
	 * 字段描述：处置方式 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_deaway = "deaway";
	
	/**
	 * 字段描述：创建日期 
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_sys_created = "sys_created";
	public static final String column_sys_createdby = "sys_createdby";
	
	/**
	 * sqlId : msjwastecolldisp.msjwastecolldisp.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_select = "msjwastecolldisp.msjwastecolldisp.splitPageSelect";
	public static final String sqlId_splitPage_from = "msjwastecolldisp.msjwastecolldisp.splitPageFrom";

	private Long ids;
	private String name;
	private Timestamp date;
	private String wastetype;
	private BigDecimal disnum;
	private Integer wasteunit;
	private String deaway;
	private Timestamp sys_created;

	public void setIds(Long ids){
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
	public void setDate(Timestamp date){
		set(column_date, date);
	}
	public <T> T getDate() {
		return get(column_date);
	}
	public void setWastetype(String wastetype){
		set(column_wastetype, wastetype);
	}
	public <T> T getWastetype() {
		return get(column_wastetype);
	}
	public void setDisnum(BigDecimal disnum){
		set(column_disnum, disnum);
	}
	public <T> T getDisnum() {
		return get(column_disnum);
	}
	public void setWasteunit(Integer wasteunit){
		set(column_wasteunit, wasteunit);
	}
	public <T> T getWasteunit() {
		return get(column_wasteunit);
	}
	public void setDeaway(String deaway){
		set(column_deaway, deaway);
	}
	public <T> T getDeaway() {
		return get(column_deaway);
	}
	public void setSys_created(Timestamp sys_created){
		set(column_sys_created, sys_created);
	}
	public <T> T getSys_created() {
		return get(column_sys_created);
	}
	
}
