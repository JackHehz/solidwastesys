package com.transinfo.mvc.transwaste;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.math.BigDecimal; 

import org.apache.log4j.Logger;

/**
 * 转移危险废物信息 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_transwaste", pkName = "ids")
public class Transwaste extends BaseModel<Transwaste> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Transwaste.class);
	
	public static final Transwaste dao = new Transwaste();

	//全局fk

	public static String transplan_fk = "ttransbscinfo_fk";
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：wastename
	 * 字段类型：character varying  长度：60
	 */
	public static final String column_wastename = "wastename";
	
	/**
	 * 字段描述：wastetype
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_wastetype = "wastetype";
	
	/**
	 * 字段描述：wasteingredient
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_wasteingredient = "wasteingredient";
	
	/**
	 * 字段描述：wastecontent
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_wastecontent = "wastecontent";
	
	/**
	 * 字段描述：wastemodality
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_wastemodality = "wastemodality";
	
	/**
	 * 字段描述：wastecharacte
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_wastecharacte = "wastecharacte";
	
	/**
	 * 字段描述：wasteamount
	 * 字段类型：numeric  长度：null
	 */
	public static final String column_wasteamount = "wasteamount";
	
	/**
	 * 字段描述：wastepackage
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_wastepackage = "wastepackage";
	
	/**
	 * 字段描述：transstarttime
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_transstarttime = "transstarttime";
	
	/**
	 * 字段描述：transendtime
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_transendtime = "transendtime";
	
	/**
	 * 字段描述：transbatch
	 * 字段类型：smallint  长度：null
	 */
	public static final String column_transbatch = "transbatch";
	
	/**
	 * 字段描述：wastetreatment
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_wastetreatment = "wastetreatment";
	
	/**
	 * 字段描述：transvehicle
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_transvehicle = "transvehicle";
	
	/**
	 * 字段描述：transcity
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_transcity = "transcity";
	
	/**
	 * 字段描述：ttransbscinfo_fk
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_ttransbscinfo_fk = "ttransbscinfo_fk";
	
	/**
	 * 字段描述：wasteunit
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_wasteunit = "wasteunit";
	
	/**
	 * 字段描述：wastecode
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_wastecode = "wastecode";
	
	
	/**
	 * sqlId : transinfo.transwaste.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "transinfo.transwaste.splitPageFrom";

	public static final String sqlId_onlinewaste = "transinfo.transwaste.onlinewaste";

	private String ids;
	private String wastename;
	private String wastetype;
	private String wasteingredient;
	private String wastecontent;
	private String wastemodality;
	private String wastecharacte;
	private String wasteamount;
	private String wastepackage;
	private String transstarttime;
	private String transendtime;
	private Integer transbatch;
	private String wastetreatment;
	private String transvehicle;
	private String transcity;
	private String ttransbscinfo_fk;
	private String wasteunit;
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
	public void setWasteingredient(String wasteingredient){
		set(column_wasteingredient, wasteingredient);
	}
	public <T> T getWasteingredient() {
		return get(column_wasteingredient);
	}
	public void setWastecontent(String wastecontent){
		set(column_wastecontent, wastecontent);
	}
	public <T> T getWastecontent() {
		return get(column_wastecontent);
	}
	public void setWastemodality(String wastemodality){
		set(column_wastemodality, wastemodality);
	}
	public <T> T getWastemodality() {
		return get(column_wastemodality);
	}
	public void setWastecharacte(String wastecharacte){
		set(column_wastecharacte, wastecharacte);
	}
	public <T> T getWastecharacte() {
		return get(column_wastecharacte);
	}
	public void setWasteamount(String wasteamount){
		set(column_wasteamount, wasteamount);
	}
	public <T> T getWasteamount() {
		return get(column_wasteamount);
	}
	public void setWastepackage(String wastepackage){
		set(column_wastepackage, wastepackage);
	}
	public <T> T getWastepackage() {
		return get(column_wastepackage);
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
	public void setTransbatch(Integer transbatch){
		set(column_transbatch, transbatch);
	}
	public <T> T getTransbatch() {
		return get(column_transbatch);
	}
	public void setWastetreatment(String wastetreatment){
		set(column_wastetreatment, wastetreatment);
	}
	public <T> T getWastetreatment() {
		return get(column_wastetreatment);
	}
	public void setTransvehicle(String transvehicle){
		set(column_transvehicle, transvehicle);
	}
	public <T> T getTransvehicle() {
		return get(column_transvehicle);
	}
	public void setTranscity(String transcity){
		set(column_transcity, transcity);
	}
	public <T> T getTranscity() {
		return get(column_transcity);
	}
	public void setTtransbscinfo_fk(String ttransbscinfo_fk){
		set(column_ttransbscinfo_fk, ttransbscinfo_fk);
	}
	public <T> T getTtransbscinfo_fk() {
		return get(column_ttransbscinfo_fk);
	}
	public void setWasteunit(String wasteunit){
		set(column_wasteunit, wasteunit);
	}
	public <T> T getWasteunit() {
		return get(column_wasteunit);
	}
	public void setWastecode(String wastecode){
		set(column_wastecode, wastecode);
	}
	public <T> T getWastecode() {
		return get(column_wastecode);
	}
	
}
