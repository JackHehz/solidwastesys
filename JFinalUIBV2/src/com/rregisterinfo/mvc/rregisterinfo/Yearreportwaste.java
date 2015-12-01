package com.rregisterinfo.mvc.rregisterinfo;

import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 年报废物信息表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_rindustryhazardouswastestable", pkName = "ids")
public class Yearreportwaste extends BaseModel<Yearreportwaste> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Yearreportwaste.class);
	
	public static final Yearreportwaste dao = new Yearreportwaste();
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：id
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_id = "id";
	
	/**
	 * 字段描述：amount
	 * 字段类型：character varying  长度：24
	 */
	public static final String column_amount = "amount";
	
	/**
	 * 字段描述：unit
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_unit = "unit";
	
	/**
	 * 字段描述：density
	 * 字段类型：character varying  长度：24
	 */
	public static final String column_density = "density";
	
	/**
	 * 字段描述：shape
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_shape = "shape";
	
	/**
	 * 字段描述：artwork
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_artwork = "artwork";
	
	/**
	 * 字段描述：describe
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_describe = "describe";
	
	/**
	 * 字段描述：regyear
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_regyear = "regyear";
	
	/**
	 * 字段描述：firstamount
	 * 字段类型：character varying  长度：24
	 */
	public static final String column_firstamount = "firstamount";
	
	/**
	 * 字段描述：artworkbigtype
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_artworkbigtype = "artworkbigtype";
	
	/**
	 * 字段描述：artworkmintype
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_artworkmintype = "artworkmintype";
	
	/**
	 * 字段描述：artworklittype
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_artworklittype = "artworklittype";
	
	/**
	 * 字段描述：wastename
	 * 字段类型：character varying  长度：800
	 */
	public static final String column_wastename = "wastename";
	
	/**
	 * 字段描述：sys_created
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_created = "sys_created";
	
	/**
	 * 字段描述：sys_last_upd
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_last_upd = "sys_last_upd";
	
	/**
	 * 字段描述：sys_deleted
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_sys_deleted = "sys_deleted";
	
	/**
	 * 字段描述：rregisterinfo_fk
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_rregisterinfo_fk = "rregisterinfo_fk";
	
	/**
	 * 字段描述：sys_createdby
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_createdby = "sys_createdby";
	
	/**
	 * 字段描述：sys_replacement
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_replacement = "sys_replacement";
	
	/**
	 * 字段描述：sys_postn
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_postn = "sys_postn";
	
	/**
	 * 字段描述：sys_division
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_division = "sys_division";
	
	/**
	 * 字段描述：sys_org
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_org = "sys_org";
	
	/**
	 * 字段描述：sys_last_upd_by
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_sys_last_upd_by = "sys_last_upd_by";
	
	/**
	 * 字段描述：wastesource
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_wastesource = "wastesource";
	
	/**
	 * 字段描述：artworklittletype
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_artworklittletype = "artworklittletype";
	
	/**
	 * 字段描述：wastecode
	 * 字段类型：character  长度：50
	 */
	public static final String column_wastecode = "wastecode";
	
	/**
	 * 字段描述：unitorgcode
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_unitorgcode = "unitorgcode";
	
	
	/**
	 * sqlId : Yearreportwaste.yearreportwaste.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitwaste_from = "rregisterinfo.rregisterinfo.splitwasteFrom";
	public static final String sqlId_splitwaste_select = "rregisterinfo.rregisterinfo.splitwasteSelect";

	private String ids;
	private String id;
	private String amount;
	private String unit;
	private String density;
	private String shape;
	private String artwork;
	private String describe;
	private String regyear;
	private String firstamount;
	private String artworkbigtype;
	private String artworkmintype;
	private String artworklittype;
	private String wastename;
	private String sys_created;
	private String sys_last_upd;
	private Boolean sys_deleted;
	private String rregisterinfo_fk;
	private String sys_createdby;
	private String sys_replacement;
	private String sys_postn;
	private String sys_division;
	private String sys_org;
	private String sys_last_upd_by;
	private String wastesource;
	private String artworklittletype;
	private String wastecode;
	private String unitorgcode;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setId(String id){
		set(column_id, id);
	}
	public <T> T getId() {
		return get(column_id);
	}
	public void setAmount(String amount){
		set(column_amount, amount);
	}
	public <T> T getAmount() {
		return get(column_amount);
	}
	public void setUnit(String unit){
		set(column_unit, unit);
	}
	public <T> T getUnit() {
		return get(column_unit);
	}
	public void setDensity(String density){
		set(column_density, density);
	}
	public <T> T getDensity() {
		return get(column_density);
	}
	public void setShape(String shape){
		set(column_shape, shape);
	}
	public <T> T getShape() {
		return get(column_shape);
	}
	public void setArtwork(String artwork){
		set(column_artwork, artwork);
	}
	public <T> T getArtwork() {
		return get(column_artwork);
	}
	public void setDescribe(String describe){
		set(column_describe, describe);
	}
	public <T> T getDescribe() {
		return get(column_describe);
	}
	public void setRegyear(String regyear){
		set(column_regyear, regyear);
	}
	public <T> T getRegyear() {
		return get(column_regyear);
	}
	public void setFirstamount(String firstamount){
		set(column_firstamount, firstamount);
	}
	public <T> T getFirstamount() {
		return get(column_firstamount);
	}
	public void setArtworkbigtype(String artworkbigtype){
		set(column_artworkbigtype, artworkbigtype);
	}
	public <T> T getArtworkbigtype() {
		return get(column_artworkbigtype);
	}
	public void setArtworkmintype(String artworkmintype){
		set(column_artworkmintype, artworkmintype);
	}
	public <T> T getArtworkmintype() {
		return get(column_artworkmintype);
	}
	public void setArtworklittype(String artworklittype){
		set(column_artworklittype, artworklittype);
	}
	public <T> T getArtworklittype() {
		return get(column_artworklittype);
	}
	public void setWastename(String wastename){
		set(column_wastename, wastename);
	}
	public <T> T getWastename() {
		return get(column_wastename);
	}
	public void setSys_created(String sys_created){
		set(column_sys_created, sys_created);
	}
	public <T> T getSys_created() {
		return get(column_sys_created);
	}
	public void setSys_last_upd(String sys_last_upd){
		set(column_sys_last_upd, sys_last_upd);
	}
	public <T> T getSys_last_upd() {
		return get(column_sys_last_upd);
	}
	public void setSys_deleted(Boolean sys_deleted){
		set(column_sys_deleted, sys_deleted);
	}
	public <T> T getSys_deleted() {
		return get(column_sys_deleted);
	}
	public void setRregisterinfo_fk(String rregisterinfo_fk){
		set(column_rregisterinfo_fk, rregisterinfo_fk);
	}
	public <T> T getRregisterinfo_fk() {
		return get(column_rregisterinfo_fk);
	}
	public void setSys_createdby(String sys_createdby){
		set(column_sys_createdby, sys_createdby);
	}
	public <T> T getSys_createdby() {
		return get(column_sys_createdby);
	}
	public void setSys_replacement(String sys_replacement){
		set(column_sys_replacement, sys_replacement);
	}
	public <T> T getSys_replacement() {
		return get(column_sys_replacement);
	}
	public void setSys_postn(String sys_postn){
		set(column_sys_postn, sys_postn);
	}
	public <T> T getSys_postn() {
		return get(column_sys_postn);
	}
	public void setSys_division(String sys_division){
		set(column_sys_division, sys_division);
	}
	public <T> T getSys_division() {
		return get(column_sys_division);
	}
	public void setSys_org(String sys_org){
		set(column_sys_org, sys_org);
	}
	public <T> T getSys_org() {
		return get(column_sys_org);
	}
	public void setSys_last_upd_by(String sys_last_upd_by){
		set(column_sys_last_upd_by, sys_last_upd_by);
	}
	public <T> T getSys_last_upd_by() {
		return get(column_sys_last_upd_by);
	}
	public void setWastesource(String wastesource){
		set(column_wastesource, wastesource);
	}
	public <T> T getWastesource() {
		return get(column_wastesource);
	}
	public void setArtworklittletype(String artworklittletype){
		set(column_artworklittletype, artworklittletype);
	}
	public <T> T getArtworklittletype() {
		return get(column_artworklittletype);
	}
	public void setWastecode(String wastecode){
		set(column_wastecode, wastecode);
	}
	public <T> T getWastecode() {
		return get(column_wastecode);
	}
	public void setUnitorgcode(String unitorgcode){
		set(column_unitorgcode, unitorgcode);
	}
	public <T> T getUnitorgcode() {
		return get(column_unitorgcode);
	}
	
}
