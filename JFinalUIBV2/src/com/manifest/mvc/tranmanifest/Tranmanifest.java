package com.manifest.mvc.tranmanifest;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Date; 

import org.apache.log4j.Logger;

/**
 * 联单信息表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_manifest")
public class Tranmanifest extends BaseModel<Tranmanifest> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Tranmanifest.class);
	
	public static final Tranmanifest dao = new Tranmanifest();
	
	/**
	 * 字段描述：主键 
	 * 字段类型：character varying  长度：64
	 */
	public static final String column_ids = "ids";


	public static final String column_transplancode = "transplancode";

	public static final String column_createdbyids = "createdbyids";
	/**
	 * 字段描述：联单编号 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_tmanifestid = "tmanifestid";
	
	/**
	 * 字段描述：转移计划编号 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_transappcode = "transappcode";
	
	/**
	 * 字段描述：移出单位名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_generatorname = "generatorname";
	
	/**
	 * 字段描述：运输单位名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_transunitname = "transunitname";
	
	/**
	 * 字段描述：接收单位名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receivername = "receivername";
	
	/**
	 * 字段描述：废物名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wastename = "wastename";
	
	/**
	 * 字段描述：废物类别编号 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wastetype = "wastetype";
	
	/**
	 * 字段描述：转移数量 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wasteamount = "wasteamount";
	
	/**
	 * 字段描述：转移数量单位 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wasteunit = "wasteunit";
	
	/**
	 * 字段描述：转移联单发运日期 
	 * 字段类型：date  长度：null
	 */
	public static final String column_initiatedate = "initiatedate";
	
	/**
	 * 字段描述：状态 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_businessstate = "businessstate";
	
	
	/**
	 * sqlId : manifest.tranmanifest.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "manifest.tranmanifest.splitPageFrom";

	public static final String sqlId_splitpage_from = "manifest.tranmanifest.splitpageFrom";

	private String ids;
	private String createdbyids;
	private String transplancode;
	private String tmanifestid;
	private String transappcode;
	private String generatorname;
	private String transunitname;
	private String receivername;
	private String wastename;
	private String wastetype;
	private String wasteamount;
	private String wasteunit;
	private Date initiatedate;
	private String businessstate;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setCreatedbyids(String createdbyids){set(column_createdbyids,createdbyids);}
	public <T> T getCreatedbyids(String createdbyids){return get(column_createdbyids);}
	public void setTransplancode(String transplancode){set(column_transplancode,transplancode);}
	public <T> T getTransplancode(){return get(column_transplancode);}
	public void setTmanifestid(String tmanifestid){
		set(column_tmanifestid, tmanifestid);
	}
	public <T> T getTmanifestid() {
		return get(column_tmanifestid);
	}
	public void setTransappcode(String transappcode){
		set(column_transappcode, transappcode);
	}
	public <T> T getTransappcode() {
		return get(column_transappcode);
	}
	public void setGeneratorname(String generatorname){
		set(column_generatorname, generatorname);
	}
	public <T> T getGeneratorname() {
		return get(column_generatorname);
	}
	public void setTransunitname(String transunitname){
		set(column_transunitname, transunitname);
	}
	public <T> T getTransunitname() {
		return get(column_transunitname);
	}
	public void setReceivername(String receivername){
		set(column_receivername, receivername);
	}
	public <T> T getReceivername() {
		return get(column_receivername);
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
	public void setInitiatedate(Date initiatedate){
		set(column_initiatedate, initiatedate);
	}
	public <T> T getInitiatedate() {
		return get(column_initiatedate);
	}
	public void setBusinessstate(String businessstate){
		set(column_businessstate, businessstate);
	}
	public <T> T getBusinessstate() {
		return get(column_businessstate);
	}
	
}
