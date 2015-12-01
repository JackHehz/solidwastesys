package com.contract.mvc.contract;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Date; 

import org.apache.log4j.Logger;

/**
 * 转移合同 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_contract", pkName = "ids")
public class Contract extends BaseModel<Contract> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Contract.class);
	
	public static final Contract dao = new Contract();
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：64
	 */
	public static final String column_ids = "ids";

	public static final String column_createdby = "createdby";
	
	/**
	 * 字段描述：contractname
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_contractname = "contractname";
	
	/**
	 * 字段描述：jiafang
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_jiafang = "jiafang";
	
	/**
	 * 字段描述：yifang
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_yifang = "yifang";
	
	/**
	 * 字段描述：date
	 * 字段类型：date  长度：null
	 */
	public static final String column_date = "date";
	
	
	/**
	 * sqlId : contract.contract.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "contract.contract.splitPageFrom";
	public static final String sqlId_splitpage_from = "contract.contract.splitpageFrom";

	private String ids;
	private String createdby;
	private String contractname;
	private String jiafang;
	private String yifang;
	private Date date;

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
	public void setContractname(String contractname){
		set(column_contractname, contractname);
	}
	public <T> T getContractname() {
		return get(column_contractname);
	}
	public void setJiafang(String jiafang){
		set(column_jiafang, jiafang);
	}
	public <T> T getJiafang() {
		return get(column_jiafang);
	}
	public void setYifang(String yifang){
		set(column_yifang, yifang);
	}
	public <T> T getYifang() {
		return get(column_yifang);
	}
	public void setDate(Date date){
		set(column_date, date);
	}
	public <T> T getDate() {
		return get(column_date);
	}
	
}
