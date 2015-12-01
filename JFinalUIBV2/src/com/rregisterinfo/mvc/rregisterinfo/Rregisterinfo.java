package com.rregisterinfo.mvc.rregisterinfo;

import com.enterprises.mvc.enterinfo.enterinfo;
import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 年报外表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_rregisterinfo", pkName = "ids")
public class Rregisterinfo extends BaseModel<Rregisterinfo> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Rregisterinfo.class);
	
	public static final Rregisterinfo dao = new Rregisterinfo();
	
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
	 * 字段描述：saveeqpcount
	 * 字段类型：integer  长度：null
	 */
	public static final String column_saveeqpcount = "saveeqpcount";
	
	/**
	 * 字段描述：dspeqpcount
	 * 字段类型：integer  长度：null
	 */
	public static final String column_dspeqpcount = "dspeqpcount";
	
	/**
	 * 字段描述：useeqpcount
	 * 字段类型：integer  长度：null
	 */
	public static final String column_useeqpcount = "useeqpcount";
	
	/**
	 * 字段描述：registeryear
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_registeryear = "registeryear";
	
	/**
	 * 字段描述：transstn
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_transstn = "transstn";
	
	/**
	 * 字段描述：accidentmeasures
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_accidentmeasures = "accidentmeasures";
	
	/**
	 * 字段描述：excuteregisterstn
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_excuteregisterstn = "excuteregisterstn";
	
	/**
	 * 字段描述：wstotherunithndlstn
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_wstotherunithndlstn = "wstotherunithndlstn";
	
	/**
	 * 字段描述：medwatermirestn
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_medwatermirestn = "medwatermirestn";
	
	/**
	 * 字段描述：furnishaddress
	 * 字段类型：character varying  长度：100
	 */
	public static final String column_furnishaddress = "furnishaddress";
	
	/**
	 * 字段描述：productvalues
	 * 字段类型：real  长度：null
	 */
	public static final String column_productvalues = "productvalues";
	
	/**
	 * 字段描述：personcount
	 * 字段类型：integer  长度：null
	 */
	public static final String column_personcount = "personcount";
	
	/**
	 * 字段描述：producesum
	 * 字段类型：integer  长度：null
	 */
	public static final String column_producesum = "producesum";
	
	/**
	 * 字段描述：dspsum
	 * 字段类型：real  长度：null
	 */
	public static final String column_dspsum = "dspsum";
	
	/**
	 * 字段描述：transsum
	 * 字段类型：real  长度：null
	 */
	public static final String column_transsum = "transsum";
	
	/**
	 * 字段描述：statuscode
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_statuscode = "statuscode";
	
	/**
	 * 字段描述：feedbackinfo
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_feedbackinfo = "feedbackinfo";
	
	/**
	 * 字段描述：remark
	 * 字段类型：character varying  长度：250
	 */
	public static final String column_remark = "remark";
	
	/**
	 * 字段描述：regyear
	 * 字段类型：integer  长度：null
	 */
	public static final String column_regyear = "regyear";
	
	/**
	 * 字段描述：envpersoncount
	 * 字段类型：integer  长度：null
	 */
	public static final String column_envpersoncount = "envpersoncount";
	
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
	 * 字段描述：businessstate
	 * 字段类型：integer  长度：null
	 */
	public static final String column_businessstate = "businessstate";
	
	/**
	 * 字段描述：startflowflag
	 * 字段类型：boolean  长度：null
	 */
	
	public static final String column_startflowflag = "startflowflag";
	
	/**
	 * 字段描述：instanceid
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_instanceid = "instanceid";
	
	/**
	 * 字段描述：enterpriseid
	 * 字段类型：integer  长度：null
	 */
	public static final String column_enterpriseid = "enterpriseid";
	
	/**
	 * 字段描述：registertype
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_registertype = "registertype";
	
	/**
	 * 字段描述：enterprisesize
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_enterprisesize = "enterprisesize";
	
	/**
	 * 字段描述：opendate
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_opendate = "opendate";
	
	/**
	 * 字段描述：lastexpanddate
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_lastexpanddate = "lastexpanddate";
	
	/**
	 * 字段描述：totalindustrialvalue
	 * 字段类型：real  长度：null
	 */
	public static final String column_totalindustrialvalue = "totalindustrialvalue";
	
	/**
	 * 字段描述：totalworkhour
	 * 字段类型：real  长度：null
	 */
	public static final String column_totalworkhour = "totalworkhour";
	
	/**
	 * 字段描述：acategoryofemployment
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_acategoryofemployment = "acategoryofemployment";
	
	/**
	 * 字段描述：bcategoryofemployment
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_bcategoryofemployment = "bcategoryofemployment";
	
	/**
	 * 字段描述：ccategoryofemployment
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_ccategoryofemployment = "ccategoryofemployment";
	
	/**
	 * 字段描述：dcategoryofemployment
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_dcategoryofemployment = "dcategoryofemployment";
	
	/**
	 * 字段描述：auditdate
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_auditdate = "auditdate";
	
	/**
	 * 字段描述：auditopinion
	 * 字段类型：character varying  长度：500
	 */
	public static final String column_auditopinion = "auditopinion";
	
	/**
	 * 字段描述：regioncode
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_regioncode = "regioncode";
	
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
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_sys_org = "sys_org";
	
	/**
	 * 字段描述：sys_last_upd_by
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_sys_last_upd_by = "sys_last_upd_by";
	
	/**
	 * 字段描述：areaofstoragefacility
	 * 字段类型：real  长度：null
	 */
	public static final String column_areaofstoragefacility = "areaofstoragefacility";
	
	/**
	 * 字段描述：linkman
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_linkman = "linkman";
	
	/**
	 * 字段描述：fax
	 * 字段类型：character varying  长度：25
	 */
	public static final String column_fax = "fax";
	
	/**
	 * 字段描述：email
	 * 字段类型：character varying  长度：60
	 */
	public static final String column_email = "email";
	
	/**
	 * 字段描述：mobile
	 * 字段类型：character varying  长度：15
	 */
	public static final String column_mobile = "mobile";
	
	/**
	 * 字段描述：linkphone
	 * 字段类型：character varying  长度：25
	 */
	public static final String column_linkphone = "linkphone";
	
	/**
	 * 字段描述：countyoperator
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_countyoperator = "countyoperator";
	
	/**
	 * 字段描述：wastetypec
	 * 字段类型：character varying  长度：350
	 */
	public static final String column_wastetypec = "wastetypec";
	
	/**
	 * 字段描述：procount
	 * 字段类型：real  长度：null
	 */
	public static final String column_procount = "procount";
	
	
	/**
	 * sqlId : rregisterinfo.rregisterinfo.splitPageFrom
	 * 描述：分页from
	 */	public static final String sqlId_splitPage_from = "rregisterinfo.rregisterinfo.splitPageFrom";

		public static final String sqlId_splitpage_from = "rregisterinfo.rregisterinfo.splitpageFrom";

	public static final String sqlId_splitPage_select = "rregisterinfo.rregisterinfo.splitPageSelect";


	private String ids;
	private String id;
	private String saveeqpcount;
	private String dspeqpcount;
	private String useeqpcount;
	private String registeryear;
	private Boolean transstn;
	private Boolean accidentmeasures;
	private Boolean excuteregisterstn;
	private Boolean wstotherunithndlstn;
	private Boolean medwatermirestn;
	private String furnishaddress;
	private String productvalues;
	private String personcount;
	private String producesum;
	private String dspsum;
	private String transsum;
	private String statuscode;
	private String feedbackinfo;
	private String remark;
	private String regyear;
	private String envpersoncount;
	private String sys_created;
	private String sys_last_upd;
	private Boolean sys_deleted;
	private String businessstate;
	private Boolean startflowflag;
	private String instanceid;
	private String enterpriseid;
	private String registertype;
	private String enterprisesize;
	private Timestamp opendate;
	private Timestamp lastexpanddate;
	private String totalindustrialvalue;
	private String totalworkhour;
	private String acategoryofemployment;
	private String bcategoryofemployment;
	private String ccategoryofemployment;
	private String dcategoryofemployment;
	private String auditdate;
	private String auditopinion;
	private String regioncode;
	private String sys_createdby;
	private String sys_replacement;
	private String sys_postn;
	private String sys_division;
	private String sys_org;
	private String sys_last_upd_by;
	private String areaofstoragefacility;
	private String linkman;
	private String fax;
	private String email;
	private String mobile;
	private String linkphone;
	private String countyoperator;
	private String wastetypec;
	private String procount;
	

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
	public void setSaveeqpcount(String saveeqpcount){
		set(column_saveeqpcount, saveeqpcount);
	}
	public <T> T getSaveeqpcount() {
		return get(column_saveeqpcount);
	}
	public void setDspeqpcount(String dspeqpcount){
		set(column_dspeqpcount, dspeqpcount);
	}
	public <T> T getDspeqpcount() {
		return get(column_dspeqpcount);
	}
	public void setUseeqpcount(String useeqpcount){
		set(column_useeqpcount, useeqpcount);
	}
	public <T> T getUseeqpcount() {
		return get(column_useeqpcount);
	}
	public void setRegisteryear(String registeryear){
		set(column_registeryear, registeryear);
	}
	public <T> T getRegisteryear() {
		return get(column_registeryear);
	}
	public void setTransstn(Boolean transstn){
		set(column_transstn, transstn);
	}
	public <T> T getTransstn() {
		return get(column_transstn);
	}
	public void setAccidentmeasures(Boolean accidentmeasures){
		set(column_accidentmeasures, accidentmeasures);
	}
	public <T> T getAccidentmeasures() {
		return get(column_accidentmeasures);
	}
	public void setExcuteregisterstn(Boolean excuteregisterstn){
		set(column_excuteregisterstn, excuteregisterstn);
	}
	public <T> T getExcuteregisterstn() {
		return get(column_excuteregisterstn);
	}
	public void setWstotherunithndlstn(Boolean wstotherunithndlstn){
		set(column_wstotherunithndlstn, wstotherunithndlstn);
	}
	public <T> T getWstotherunithndlstn() {
		return get(column_wstotherunithndlstn);
	}
	public void setMedwatermirestn(Boolean medwatermirestn){
		set(column_medwatermirestn, medwatermirestn);
	}
	public <T> T getMedwatermirestn() {
		return get(column_medwatermirestn);
	}
	public void setFurnishaddress(String furnishaddress){
		set(column_furnishaddress, furnishaddress);
	}
	public <T> T getFurnishaddress() {
		return get(column_furnishaddress);
	}
	public void setProductvalues(String productvalues){
		set(column_productvalues, productvalues);
	}
	public <T> T getProductvalues() {
		return get(column_productvalues);
	}
	public void setPersoncount(String personcount){
		set(column_personcount, personcount);
	}
	public <T> T getPersoncount() {
		return get(column_personcount);
	}
	public void setProducesum(String producesum){
		set(column_producesum, producesum);
	}
	public <T> T getProducesum() {
		return get(column_producesum);
	}
	public void setDspsum(String dspsum){
		set(column_dspsum, dspsum);
	}
	public <T> T getDspsum() {
		return get(column_dspsum);
	}
	public void setTranssum(String transsum){
		set(column_transsum, transsum);
	}
	public <T> T getTranssum() {
		return get(column_transsum);
	}
	public void setStatuscode(String statuscode){
		set(column_statuscode, statuscode);
	}
	public <T> T getStatuscode() {
		return get(column_statuscode);
	}
	public void setFeedbackinfo(String feedbackinfo){
		set(column_feedbackinfo, feedbackinfo);
	}
	public <T> T getFeedbackinfo() {
		return get(column_feedbackinfo);
	}
	public void setRemark(String remark){
		set(column_remark, remark);
	}
	public <T> T getRemark() {
		return get(column_remark);
	}
	public void setRegyear(String regyear){
		set(column_regyear, regyear);
	}
	public <T> T getRegyear() {
		return get(column_regyear);
	}
	public void setEnvpersoncount(String envpersoncount){
		set(column_envpersoncount, envpersoncount);
	}
	public <T> T getEnvpersoncount() {
		return get(column_envpersoncount);
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
	public void setBusinessstate(String businessstate){
		set(column_businessstate, businessstate);
	}
	public <T> T getBusinessstate() {
		return get(column_businessstate);
	}
	public void setStartflowflag(Boolean startflowflag){
		set(column_startflowflag, startflowflag);
	}
	public <T> T getStartflowflag() {
		return get(column_startflowflag);
	}
	public void setInstanceid(String instanceid){
		set(column_instanceid, instanceid);
	}
	public <T> T getInstanceid() {
		return get(column_instanceid);
	}
	public void setEnterpriseid(String enterpriseid){
		set(column_enterpriseid, enterpriseid);
	}
	public <T> T getEnterpriseid() {
		return get(column_enterpriseid);
	}
	public void setRegistertype(String registertype){
		set(column_registertype, registertype);
	}
	public <T> T getRegistertype() {
		return get(column_registertype);
	}
	public void setEnterprisesize(String enterprisesize){
		set(column_enterprisesize, enterprisesize);
	}
	public <T> T getEnterprisesize() {
		return get(column_enterprisesize);
	}
	public void setOpendate(Timestamp opendate){
		set(column_opendate, opendate);
	}
	public <T> T getOpendate() {
		return get(column_opendate);
	}
	public void setLastexpanddate(Timestamp lastexpanddate){
		set(column_lastexpanddate, lastexpanddate);
	}
	public <T> T getLastexpanddate() {
		return get(column_lastexpanddate);
	}
	public void setTotalindustrialvalue(String totalindustrialvalue){
		set(column_totalindustrialvalue, totalindustrialvalue);
	}
	public <T> T getTotalindustrialvalue() {
		return get(column_totalindustrialvalue);
	}
	public void setTotalworkhour(String totalworkhour){
		set(column_totalworkhour, totalworkhour);
	}
	public <T> T getTotalworkhour() {
		return get(column_totalworkhour);
	}
	public void setAcategoryofemployment(String acategoryofemployment){
		set(column_acategoryofemployment, acategoryofemployment);
	}
	public <T> T getAcategoryofemployment() {
		return get(column_acategoryofemployment);
	}
	public void setBcategoryofemployment(String bcategoryofemployment){
		set(column_bcategoryofemployment, bcategoryofemployment);
	}
	public <T> T getBcategoryofemployment() {
		return get(column_bcategoryofemployment);
	}
	public void setCcategoryofemployment(String ccategoryofemployment){
		set(column_ccategoryofemployment, ccategoryofemployment);
	}
	public <T> T getCcategoryofemployment() {
		return get(column_ccategoryofemployment);
	}
	public void setDcategoryofemployment(String dcategoryofemployment){
		set(column_dcategoryofemployment, dcategoryofemployment);
	}
	public <T> T getDcategoryofemployment() {
		return get(column_dcategoryofemployment);
	}
	public void setAuditdate(String auditdate){
		set(column_auditdate, auditdate);
	}
	public <T> T getAuditdate() {
		return get(column_auditdate);
	}
	public void setAuditopinion(String auditopinion){
		set(column_auditopinion, auditopinion);
	}
	public <T> T getAuditopinion() {
		return get(column_auditopinion);
	}
	public void setRegioncode(String regioncode){
		set(column_regioncode, regioncode);
	}
	public <T> T getRegioncode() {
		return get(column_regioncode);
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
	public void setAreaofstoragefacility(String areaofstoragefacility){
		set(column_areaofstoragefacility, areaofstoragefacility);
	}
	public <T> T getAreaofstoragefacility() {
		return get(column_areaofstoragefacility);
	}
	public void setLinkman(String linkman){
		set(column_linkman, linkman);
	}
	public <T> T getLinkman() {
		return get(column_linkman);
	}
	public void setFax(String fax){
		set(column_fax, fax);
	}
	public <T> T getFax() {
		return get(column_fax);
	}
	public void setEmail(String email){
		set(column_email, email);
	}
	public <T> T getEmail() {
		return get(column_email);
	}
	public void setMobile(String mobile){
		set(column_mobile, mobile);
	}
	public <T> T getMobile() {
		return get(column_mobile);
	}
	public void setLinkphone(String linkphone){
		set(column_linkphone, linkphone);
	}
	public <T> T getLinkphone() {
		return get(column_linkphone);
	}
	public void setCountyoperator(String countyoperator){
		set(column_countyoperator, countyoperator);
	}
	public <T> T getCountyoperator() {
		return get(column_countyoperator);
	}
	public void setWastetypec(String wastetypec){
		set(column_wastetypec, wastetypec);
	}
	public <T> T getWastetypec() {
		return get(column_wastetypec);
	}
	public void setProcount(String procount){
		set(column_procount, procount);
	}
	public <T> T getProcount() {
		return get(column_procount);
	}


	public enterinfo getenterinfo(){
		String createdby = get(column_sys_createdby);
		System.out.println(createdby);
		enterinfo Enterinfo=null;
		if(null != createdby && !createdby.isEmpty()){
			List<enterinfo> enterinfoList=enterinfo.dao.find("select * from  n_bcommonenterprises where createdby = ?", createdby);
			Enterinfo=enterinfoList.get(0);
			return Enterinfo;
		}
		return null;
	}


}
