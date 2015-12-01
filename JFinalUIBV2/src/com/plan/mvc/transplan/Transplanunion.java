package com.plan.mvc.transplan;

import com.platform.mvc.base.BaseModel;
import org.apache.log4j.Logger;

/**
 * 危险废物转移基本信息 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_transplanunion")
public class Transplanunion extends BaseModel<Transplanunion> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Transplanunion.class);
	
	public static final Transplanunion dao = new Transplanunion();
	
	/**
	 * 字段描述：主键 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_ids = "ids";


	/**
	 * 字段描述：转移计划编号 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_transplancode = "transplancode";
	public static final String column_createdby = "createdby";
	/**
	 * 字段描述：移出单位名称 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_generatorname = "generatorname";
	
	/**
	 * 字段描述：移出单位地址 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_generatoraddress = "generatoraddress";
	
	/**
	 * 字段描述：移出单位邮编 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_generatorpostcode = "generatorpostcode";
	
	/**
	 * 字段描述：移出单位联系人 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_generatorlinkman = "generatorlinkman";
	
	/**
	 * 字段描述：移出单位联系电话 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_generatorlinkphone = "generatorlinkphone";
	
	/**
	 * 字段描述：接收单位 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receivername = "receivername";
	
	/**
	 * 字段描述：接收单位地址 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receiveraddress = "receiveraddress";
	
	/**
	 * 字段描述：接收单位邮编 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receiverpostcode = "receiverpostcode";
	
	/**
	 * 字段描述：接收单位联系人 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receiverlinkman = "receiverlinkman";
	
	/**
	 * 字段描述：接收单位联系电话 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receiverlinkphone = "receiverlinkphone";
	
	/**
	 * 字段描述：接收单位许可证号 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_receiverlicense = "receiverlicense";
	
	
	/**
	 * sqlId : plan.transplanunion.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "plan.transplanunion.splitPageFrom";

	private String ids;
	private String createdby;
	private String transplancode;
	private String generatorname;
	private String generatoraddress;
	private String generatorpostcode;
	private String generatorlinkman;
	private String generatorlinkphone;
	private String receivername;
	private String receiveraddress;
	private String receiverpostcode;
	private String receiverlinkman;
	private String receiverlinkphone;
	private String receiverlicense;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setCreatedby(String createdby){
		set(column_createdby, createdby);
	}
	public <T> T getCreatedby() {
		return get(column_createdby);
	}
	public void setTransplancode(String transplancode){
		set(column_transplancode, transplancode);
	}
	public <T> T getTransplancode() {
		return get(column_transplancode);
	}
	public void setGeneratorname(String generatorname){
		set(column_generatorname, generatorname);
	}
	public <T> T getGeneratorname() {
		return get(column_generatorname);
	}
	public void setGeneratoraddress(String generatoraddress){
		set(column_generatoraddress, generatoraddress);
	}
	public <T> T getGeneratoraddress() {
		return get(column_generatoraddress);
	}
	public void setGeneratorpostcode(String generatorpostcode){
		set(column_generatorpostcode, generatorpostcode);
	}
	public <T> T getGeneratorpostcode() {
		return get(column_generatorpostcode);
	}
	public void setGeneratorlinkman(String generatorlinkman){
		set(column_generatorlinkman, generatorlinkman);
	}
	public <T> T getGeneratorlinkman() {
		return get(column_generatorlinkman);
	}
	public void setGeneratorlinkphone(String generatorlinkphone){
		set(column_generatorlinkphone, generatorlinkphone);
	}
	public <T> T getGeneratorlinkphone() {
		return get(column_generatorlinkphone);
	}
	public void setReceivername(String receivername){
		set(column_receivername, receivername);
	}
	public <T> T getReceivername() {
		return get(column_receivername);
	}
	public void setReceiveraddress(String receiveraddress){
		set(column_receiveraddress, receiveraddress);
	}
	public <T> T getReceiveraddress() {
		return get(column_receiveraddress);
	}
	public void setReceiverpostcode(String receiverpostcode){
		set(column_receiverpostcode, receiverpostcode);
	}
	public <T> T getReceiverpostcode() {
		return get(column_receiverpostcode);
	}
	public void setReceiverlinkman(String receiverlinkman){
		set(column_receiverlinkman, receiverlinkman);
	}
	public <T> T getReceiverlinkman() {
		return get(column_receiverlinkman);
	}
	public void setReceiverlinkphone(String receiverlinkphone){
		set(column_receiverlinkphone, receiverlinkphone);
	}
	public <T> T getReceiverlinkphone() {
		return get(column_receiverlinkphone);
	}
	public void setReceiverlicense(String receiverlicense){
		set(column_receiverlicense, receiverlicense);
	}
	public <T> T getReceiverlicense() {
		return get(column_receiverlicense);
	}
	
}
