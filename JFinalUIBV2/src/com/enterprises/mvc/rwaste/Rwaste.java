package com.enterprises.mvc.rwaste;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.util.UUID; 

import org.apache.log4j.Logger;

/**
 * 废物基本信息表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "n_rwaste", pkName = "ids")
public class Rwaste extends BaseModel<Rwaste> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Rwaste.class);
	
	public static final Rwaste dao = new Rwaste();

	public static final String fenyeflags="0";
	
	/**
	 * 字段描述：rwasteoid
	 * 字段类型：uuid  长度：null
	 */
	public static final String column_rwasteoid = "rwasteoid";
	
	/**
	 * 字段描述：wastetype
	 * 字段类型：character varying  长度：180
	 */
	public static final String column_wastetype = "wastetype";
	
	/**
	 * 字段描述：wastesourceofddl
	 * 字段类型：character varying  长度：180
	 */
	public static final String column_wastesourceofddl = "wastesourceofddl";
	
	/**
	 * 字段描述：wastename
	 * 字段类型：character varying  长度：255
	 */
	public static final String column_wastename = "wastename";
	
	/**
	 * 字段描述：wastecode
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_wastecode = "wastecode";
	
	/**
	 * 字段描述：dangerelement
	 * 字段类型：character varying  长度：150
	 */
	public static final String column_dangerelement = "dangerelement";
	
	/**
	 * 字段描述：wasteshape
	 * 字段类型：character varying  长度：20
	 */
	public static final String column_wasteshape = "wasteshape";
	
	/**
	 * 字段描述：wastesource
	 * 字段类型：character varying  长度：60
	 */
	public static final String column_wastesource = "wastesource";
	
	/**
	 * 字段描述：ids
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_ids = "ids";
	
	
	/**
	 * sqlId : Enterprise.rwaste.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "Enterprise.rwaste.splitPageFrom";

	private UUID rwasteoid;
	private String wastetype;
	private String wastesourceofddl;
	private String wastename;
	private String wastecode;
	private String dangerelement;
	private String wasteshape;
	private String wastesource;
	private Long ids;

	public void setRwasteoid(UUID rwasteoid){
		set(column_rwasteoid, rwasteoid);
	}
	public <T> T getRwasteoid() {
		return get(column_rwasteoid);
	}
	public void setWastetype(String wastetype){
		set(column_wastetype, wastetype);
	}
	public <T> T getWastetype() {
		return get(column_wastetype);
	}
	public void setWastesourceofddl(String wastesourceofddl){
		set(column_wastesourceofddl, wastesourceofddl);
	}
	public <T> T getWastesourceofddl() {
		return get(column_wastesourceofddl);
	}
	public void setWastename(String wastename){
		set(column_wastename, wastename);
	}
	public <T> T getWastename() {
		return get(column_wastename);
	}
	public void setWastecode(String wastecode){
		set(column_wastecode, wastecode);
	}
	public <T> T getWastecode() {
		return get(column_wastecode);
	}
	public void setDangerelement(String dangerelement){
		set(column_dangerelement, dangerelement);
	}
	public <T> T getDangerelement() {
		return get(column_dangerelement);
	}
	public void setWasteshape(String wasteshape){
		set(column_wasteshape, wasteshape);
	}
	public <T> T getWasteshape() {
		return get(column_wasteshape);
	}
	public void setWastesource(String wastesource){
		set(column_wastesource, wastesource);
	}
	public <T> T getWastesource() {
		return get(column_wastesource);
	}
	public void setIds(Long ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	
}
