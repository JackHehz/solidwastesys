package com.commonsearch.mvc.hangyeleibie;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.util.UUID; 

import org.apache.log4j.Logger;

/**
 * 行业类别表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "hangyeleibie", pkName = "ids")
public class Hangyeleibie extends BaseModel<Hangyeleibie> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Hangyeleibie.class);
	
	public static final Hangyeleibie dao = new Hangyeleibie();

	/**
	 * sqlId : commonsearch.hangyeleibie.root
	 * 描述：根节点
	 */
	public static final String sqlId_root = "commonsearch.hangyeleibie.root";

	/**
	 * sqlId : commonsearch.hangyeleibie.child
	 * 描述：子节点
	 */
	public static final String sqlId_child = "commonsearch.hangyeleibie.child";

	/**
	 * sqlId : commonsearch.hangyeleibie.childCount
	 * 描述：子节点数量
	 */
	public static final String sqlId_childCount = "commonsearch.hangyeleibie.childCount";
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：code
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_code = "code";
	
	/**
	 * 字段描述：name
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_name = "name";
	
	/**
	 * 字段描述：hangyeleibie_fk
	 * 字段类型：uuid  长度：null
	 */
	public static final String column_hangyeleibie_fk = "hangyeleibie_fk";
	
	/**
	 * 字段描述：isparent
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_isparent = "isparent";
	
	
	/**
	 * sqlId : commonsearch.hangyeleibie.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "commonsearch.hangyeleibie.splitPageFrom";

	private String ids;
	private String code;
	private String name;
	private UUID hangyeleibie_fk;
	private String isparent;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getids() {
		return get(column_ids);
	}
	public void setCode(String code){
		set(column_code, code);
	}
	public <T> T getCode() {
		return get(column_code);
	}
	public void setName(String name){
		set(column_name, name);
	}
	public <T> T getName() {
		return get(column_name);
	}
	public void setHangyeleibie_fk(UUID hangyeleibie_fk){
		set(column_hangyeleibie_fk, hangyeleibie_fk);
	}
	public <T> T getHangyeleibie_fk() {
		return get(column_hangyeleibie_fk);
	}
	public void setIsparent(String isparent){
		set(column_isparent, isparent);
	}
	public <T> T getIsparent() {
		return get(column_isparent);
	}
	
}
