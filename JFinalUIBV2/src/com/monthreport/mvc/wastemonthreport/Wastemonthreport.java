package com.monthreport.mvc.wastemonthreport;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 月报 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_mmonthreport")
public class Wastemonthreport extends BaseModel<Wastemonthreport> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Wastemonthreport.class);
	
	public static final Wastemonthreport dao = new Wastemonthreport();

	public static final String fenyeflags="0";
	
	/**
	 * 字段描述：年份 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_reportyear = "reportyear";
	
	/**
	 * 字段描述：月份 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_reportmonth = "reportmonth";
	
	/**
	 * 字段描述：填报单位 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_medicalorg = "medicalorg";
	
	/**
	 * 字段描述：经办人 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_trustee = "trustee";
	
	/**
	 * 字段描述：体积 
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_totalinfectantvolumen = "totalinfectantvolumen";
	
	/**
	 * 字段描述：重量 
	 * 字段类型：double precision  长度：null
	 */
	public static final String column_totalinfectantweight = "totalinfectantweight";
	
	/**
	 * 字段描述：填表日期 
	 * 字段类型：character varying  长度：53
	 */
	public static final String column_reportdate = "reportdate";
	
	/**
	 * 字段描述：ids 
	 * 字段类型：character varying  长度：64
	 */
	public static final String column_ids = "ids";
	
	
	/**
	 * sqlId : monthreport.wastemonthreport.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "monthreport.wastemonthreport.splitPageFrom";

	private String reportyear;
	private String reportmonth;
	private String medicalorg;
	private String trustee;
	private String totalinfectantvolumen;
	private Double totalinfectantweight;
	private String reportdate;
	private String ids;

	public void setReportyear(String reportyear){
		set(column_reportyear, reportyear);
	}
	public <T> T getReportyear() {
		return get(column_reportyear);
	}
	public void setReportmonth(String reportmonth){
		set(column_reportmonth, reportmonth);
	}
	public <T> T getReportmonth() {
		return get(column_reportmonth);
	}
	public void setMedicalorg(String medicalorg){
		set(column_medicalorg, medicalorg);
	}
	public <T> T getMedicalorg() {
		return get(column_medicalorg);
	}
	public void setTrustee(String trustee){
		set(column_trustee, trustee);
	}
	public <T> T getTrustee() {
		return get(column_trustee);
	}
	public void setTotalinfectantvolumen(String totalinfectantvolumen){
		set(column_totalinfectantvolumen, totalinfectantvolumen);
	}
	public <T> T getTotalinfectantvolumen() {
		return get(column_totalinfectantvolumen);
	}
	public void setTotalinfectantweight(Double totalinfectantweight){
		set(column_totalinfectantweight, totalinfectantweight);
	}
	public <T> T getTotalinfectantweight() {
		return get(column_totalinfectantweight);
	}
	public void setReportdate(String reportdate){
		set(column_reportdate, reportdate);
	}
	public <T> T getReportdate() {
		return get(column_reportdate);
	}
	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	
}
