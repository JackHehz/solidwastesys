package com.carinformation.mvc.carinformationsearch;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 车辆信息查询 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_carinformation")
public class Carinformationsearch extends BaseModel<Carinformationsearch> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Carinformationsearch.class);
	
	public static final Carinformationsearch dao = new Carinformationsearch();

	public static final String fenyeflags="0";
	
	/**
	 * 字段描述：车辆类型 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_cartype = "cartype";
	
	/**
	 * 字段描述：车牌号码 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_carnumber = "carnumber";
	
	/**
	 * 字段描述：车辆所属企业 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ownedenterprise = "ownedenterprise";
	
	/**
	 * 字段描述：驾驶员 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_driver = "driver";
	
	/**
	 * 字段描述：联系电话 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_conphone = "conphone";
	
	
	/**
	 * sqlId : carinformation.carinformationsearch.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "carinformation.carinformationsearch.splitPageFrom";

	private String cartype;
	private String carnumber;
	private String ownedenterprise;
	private String driver;
	private String conphone;

	public void setCartype(String cartype){
		set(column_cartype, cartype);
	}
	public <T> T getCartype() {
		return get(column_cartype);
	}
	public void setCarnumber(String carnumber){
		set(column_carnumber, carnumber);
	}
	public <T> T getCarnumber() {
		return get(column_carnumber);
	}
	public void setOwnedenterprise(String ownedenterprise){
		set(column_ownedenterprise, ownedenterprise);
	}
	public <T> T getOwnedenterprise() {
		return get(column_ownedenterprise);
	}
	public void setDriver(String driver){
		set(column_driver, driver);
	}
	public <T> T getDriver() {
		return get(column_driver);
	}
	public void setConphone(String conphone){
		set(column_conphone, conphone);
	}
	public <T> T getConphone() {
		return get(column_conphone);
	}
	
}
