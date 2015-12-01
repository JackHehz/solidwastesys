package com.rregisterinfo.mvc.rregisterinfo;

import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 年报处置利用情况表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_rutilizewaste", pkName = "ids")
public class Rutilizewaste extends BaseModel<Rutilizewaste> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Rutilizewaste.class);
	
	public static final Rutilizewaste dao = new Rutilizewaste();
	
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
	 * 字段描述：province
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_province = "province";
	
	/**
	 * 字段描述：reserveunit
	 * 字段类型：character varying  长度：2000
	 */
	public static final String column_reserveunit = "reserveunit";
	
	/**
	 * 字段描述：licensecode
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_licensecode = "licensecode";
	
	/**
	 * 字段描述：linkman
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_linkman = "linkman";
	
	/**
	 * 字段描述：linkphone
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_linkphone = "linkphone";
	
	/**
	 * 字段描述：managecode
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_managecode = "managecode";
	
	/**
	 * 字段描述：amount
	 * 字段类型：character varying  长度：24
	 */
	public static final String column_amount = "amount";
	
	/**
	 * 字段描述：wasteunit
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_wasteunit = "wasteunit";
	
	/**
	 * 字段描述：wasteid
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_wasteid = "wasteid";
	
	/**
	 * 字段描述：provincecode
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_provincecode = "provincecode";
	
	/**
	 * 字段描述：firstamount
	 * 字段类型：character varying  长度：24
	 */
	public static final String column_firstamount = "firstamount";
	
	/**
	 * 字段描述：rindustryhazardouswastestable_fk
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_rindustryhazardouswastestable_fk = "rindustryhazardouswastestable_fk";
	
	
	/**
	 * sqlId : Rutilizewaste.rutilizewaste.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "rregisterinfo.rregisterinfo.splitPageFrom";

	public static final String sqlId_splitrutilize_from = "rregisterinfo.rregisterinfo.splitrutilizeFrom";


	private String ids;
	private String id;
	private String province;
	private String reserveunit;
	private String licensecode;
	private String linkman;
	private String linkphone;
	private String managecode;
	private String amount;
	private String wasteunit;
	private String wasteid;
	private String provincecode;
	private String firstamount;
	private String rindustryhazardouswastestable_fk;

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
	public void setProvince(String province){
		set(column_province, province);
	}
	public <T> T getProvince() {
		return get(column_province);
	}
	public void setReserveunit(String reserveunit){
		set(column_reserveunit, reserveunit);
	}
	public <T> T getReserveunit() {
		return get(column_reserveunit);
	}
	public void setLicensecode(String licensecode){
		set(column_licensecode, licensecode);
	}
	public <T> T getLicensecode() {
		return get(column_licensecode);
	}
	public void setLinkman(String linkman){
		set(column_linkman, linkman);
	}
	public <T> T getLinkman() {
		return get(column_linkman);
	}
	public void setLinkphone(String linkphone){
		set(column_linkphone, linkphone);
	}
	public <T> T getLinkphone() {
		return get(column_linkphone);
	}
	public void setManagecode(String managecode){
		set(column_managecode, managecode);
	}
	public <T> T getManagecode() {
		return get(column_managecode);
	}
	public void setAmount(String amount){
		set(column_amount, amount);
	}
	public <T> T getAmount() {
		return get(column_amount);
	}
	public void setWasteunit(String wasteunit){
		set(column_wasteunit, wasteunit);
	}
	public <T> T getWasteunit() {
		return get(column_wasteunit);
	}
	public void setWasteid(String wasteid){
		set(column_wasteid, wasteid);
	}
	public <T> T getWasteid() {
		return get(column_wasteid);
	}
	public void setProvincecode(String provincecode){
		set(column_provincecode, provincecode);
	}
	public <T> T getProvincecode() {
		return get(column_provincecode);
	}
	public void setFirstamount(String firstamount){
		set(column_firstamount, firstamount);
	}
	public <T> T getFirstamount() {
		return get(column_firstamount);
	}
	public void setRindustryhazardouswastestable_fk(String rindustryhazardouswastestable_fk){
		set(column_rindustryhazardouswastestable_fk, rindustryhazardouswastestable_fk);
	}
	public <T> T getRindustryhazardouswastestable_fk() {
		return get(column_rindustryhazardouswastestable_fk);
	}
	
}
