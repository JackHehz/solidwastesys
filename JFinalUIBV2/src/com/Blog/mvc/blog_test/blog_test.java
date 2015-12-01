package com.Blog.mvc.blog_test;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 

import org.apache.log4j.Logger;

/**
 * 博客表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "test_blog")
public class blog_test extends BaseModel<blog_test> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(blog_test.class);
	
	public static final blog_test dao = new blog_test();

	public static final String fenyeflags="0";
	
	/**
	 * 字段描述：博客表 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：主键 
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_title = "title";
	
	/**
	 * 字段描述：标题 
	 * 字段类型：text  长度：null
	 */
	public static final String column_content = "content";
	
	/**
	 * 字段描述：内容 
	 * 字段类型：timestamp with time zone  长度：null
	 */
	public static final String column_createtime = "createtime";
	
	
	/**
	 * sqlId : enterprises.blog_test.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "enterprises.blog_test.splitPageFrom";

	private String ids;
	private String title;
	private String content;
	private Timestamp createtime;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public <T> T getIds() {
		return get(column_ids);
	}
	public void setTitle(String title){
		set(column_title, title);
	}
	public <T> T getTitle() {
		return get(column_title);
	}
	public void setContent(String content){
		set(column_content, content);
	}
	public <T> T getContent() {
		return get(column_content);
	}
	public void setCreatetime(Timestamp createtime){
		set(column_createtime, createtime);
	}
	public <T> T getCreatetime() {
		return get(column_createtime);
	}
	
}
