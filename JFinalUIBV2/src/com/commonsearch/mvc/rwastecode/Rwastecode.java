package com.commonsearch.mvc.rwastecode;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 * 废物代码表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "rwastecode", pkName = "ids")
public class Rwastecode extends BaseModel<Rwastecode> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Rwastecode.class);
	
	public static final Rwastecode dao = new Rwastecode();


	/**
	 * sqlId : commonsearch.rwastecode.root
	 * 描述：根节点
	 */
	public static final String sqlId_root = "commonsearch.rwastecode.root";

	/**
	 * sqlId : commonsearch.rwastecode.child
	 * 描述：子节点
	 */
	public static final String sqlId_child = "commonsearch.rwastecode.child";

	/**
	 * sqlId : commonsearch.rwastecode.childCount
	 * 描述：子节点数量
	 */
	public static final String sqlId_childCount = "commonsearch.rwastecode.childCount";
	
	/**
	 * 字段描述：ids
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：name
	 * 字段类型：character varying  长度：180
	 */
	public static final String column_name = "name";
	
	/**
	 * 字段描述：code
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_code = "code";
	
	/**
	 * 字段描述：attri
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_attri = "attri";
	
	/**
	 * 字段描述：rwastecode_fk
	 * 字段类型：character varying  长度：null
	 */
	public static final String column_rwastecode_fk = "rwastecode_fk";
	
	/**
	 * 字段描述：isparent
	 * 字段类型：boolean  长度：null
	 */
	public static final String column_isparent = "isparent";
	
	
	/**
	 * sqlId : commonsearch.rwastecode.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "commonsearch.rwastecode.splitPageFrom";

	private String ids;
	private String name;
	private String code;
	private String attri;
	private String rwastecode_fk;
	private Boolean isparent;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setName(String name){
		set(column_name, name);
	}
	public <T> T getName() {
		return get(column_name);
	}
	public void setCode(String code){
		set(column_code, code);
	}
	public <T> T getCode() {
		return get(column_code);
	}
	public void setAttri(String attri){
		set(column_attri, attri);
	}
	public <T> T getAttri() {
		return get(column_attri);
	}
	public void setRwastecode_fk(String rwastecode_fk){
		set(column_rwastecode_fk, rwastecode_fk);
	}
	public <T> T getRwastecode_fk() {
		return get(column_rwastecode_fk);
	}
	public void setIsparent(Boolean isparent){
		set(column_isparent, isparent);
	}
	public <T> T getIsparent() {
		return get(column_isparent);
	}
	
}
