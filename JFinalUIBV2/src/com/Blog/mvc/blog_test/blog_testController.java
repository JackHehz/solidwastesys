package com.Blog.mvc.blog_test;

import com.platform.annotation.Controller;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;
import com.platform.tools.ToolDateTime;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/enterprises/blog_test
 * /jf/enterprises/blog_test/save
 * /jf/enterprises/blog_test/edit
 * /jf/enterprises/blog_test/update
 * /jf/enterprises/blog_test/view
 * /jf/enterprises/blog_test/delete
 * /common/blog_test/add.html
 * 
 */
@Controller(controllerKey = "/jf/enterprises/blog_test")
public class blog_testController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(blog_testController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, blog_test.sqlId_splitPage_from);
		render("/enterprises/blog_test/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(blog_testValidator.class)
	public void save() {
		getModel(blog_test.class).save();
		render("/enterprises/blog_test/add.html");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		blog_test blog_test = com.Blog.mvc.blog_test.blog_test.dao.findById(getPara());
		setAttr("blog_test", blog_test);
		render("/enterprises/blog_test/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(blog_testValidator.class)
	public void update() {
		getModel(blog_test.class).update();
		redirect("/jf/enterprises/blog_test");
	}

	/**
	 * 查看
	 */
	public void view() {
		blog_test blog_test = com.Blog.mvc.blog_test.blog_test.dao.findById(getPara());
		setAttr("blog_test", blog_test);
		render("/enterprises/blog_test/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		blog_testService.service.delete("test_blog", getPara() == null ? ids : getPara());
		redirect("/jf/enterprises/blog_test");
	}
	
}
