package com.rregisterinfo.mvc.rregisterinfo;

import com.platform.mvc.base.BaseModel;

import java.math.BigDecimal; 

import org.apache.log4j.Logger;

/**
 * 内部存储表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_rreservewaste", pkName = "ids")
public class Reservewaste extends BaseModel<Reservewaste> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Reservewaste.class);
	
	public static final Reservewaste dao = new Reservewaste();
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：id
	 * 字段类型：integer  长度：null
	 */
	public static final String column_id = "id";
	
	/**
	 * 字段描述：managecode
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_managecode = "managecode";
	
	/**
	 * 字段描述：amount
	 * 字段类型：numeric  长度：null
	 */
	public static final String column_amount = "amount";
	
	/**
	 * 字段描述：wasteunit
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_wasteunit = "wasteunit";
	
	/**
	 * 字段描述：firstamount
	 * 字段类型：numeric  长度：null
	 */
	public static final String column_firstamount = "firstamount";
	
	/**
	 * 字段描述：rindustryhazardouswastestable_fk
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_rindustryhazardouswastestable_fk = "rindustryhazardouswastestable_fk";
	
	
	/**
	 * sqlId : Reservewaste.reservewaste.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "rregisterinfo.rregisterinfo.splitPageFrom";
	//企业
	public static final String sqlId_splitreserve_from = "rregisterinfo.rregisterinfo.splitreserveFrom";

	private String ids;
	private Integer id;
	private String managecode;
	private BigDecimal amount;
	private String wasteunit;
	private BigDecimal firstamount;
	private String rindustryhazardouswastestable_fk;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setId(Integer id){
		set(column_id, id);
	}
	public <T> T getId() {
		return get(column_id);
	}
	public void setManagecode(String managecode){
		set(column_managecode, managecode);
	}
	public <T> T getManagecode() {
		return get(column_managecode);
	}
	public void setAmount(BigDecimal amount){
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
	public void setFirstamount(BigDecimal firstamount){
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
