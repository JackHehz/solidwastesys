package com.enterprises.mvc.enterinfo;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/Enterprise/enterinfo
 * /jf/Enterprise/enterinfo/save
 * /jf/Enterprise/enterinfo/edit
 * /jf/Enterprise/enterinfo/update
 * /jf/Enterprise/enterinfo/view
 * /jf/Enterprise/enterinfo/delete
 * /common/enterinfo/add.html
 * 
 */
//@Controller(controllerKey = "/jf/Enterprise/enterinfo")
public class enterinfoController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(enterinfoController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, enterinfo.sqlId_splitPage_from);
		render("/Enterprise/enterinfo/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(enterinfoValidator.class)
	public void save() {
		getModel(enterinfo.class).save();
		render("/Enterprise/enterinfo/add.html");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		enterinfo Enterinfo = enterinfo.dao.findById(getPara());
		setAttr("enterinfo", Enterinfo);
		render("/Enterprise/enterinfo/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(enterinfoValidator.class)
	public void update() {
		getModel(enterinfo.class).update();
		redirect("/jf/Enterprise/enterinfo");
	}

	/**
	 * 查看
	 */
	public void view() {
		enterinfo Enterinfo = enterinfo.dao.findById(getPara());
		setAttr("enterinfo", Enterinfo);
		render("/Enterprise/enterinfo/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		enterinfoService.service.delete("n_bcommonenterprises", getPara() == null ? ids : getPara());
		redirect("/jf/Enterprise/enterinfo");
	}
	
}
