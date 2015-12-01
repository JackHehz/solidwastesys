package com.enterprises.mvc.rwaste;

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
 * /jf/Enterprise/rwaste
 * /jf/Enterprise/rwaste/save
 * /jf/Enterprise/rwaste/edit
 * /jf/Enterprise/rwaste/update
 * /jf/Enterprise/rwaste/view
 * /jf/Enterprise/rwaste/delete
 * /common/rwaste/add.html
 * 
 */
//@Controller(controllerKey = "/jf/Enterprise/rwaste")
public class RwasteController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RwasteController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Rwaste.sqlId_splitPage_from);
		render("/Enterprise/rwaste/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(RwasteValidator.class)
	public void save() {
		getModel(Rwaste.class).save();
		redirect("/jf/Enterprise/rwaste");

	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Rwaste rwaste = Rwaste.dao.findById(getPara());
		setAttr("rwaste", rwaste);
		render("/Enterprise/rwaste/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(RwasteValidator.class)
	public void update() {
		getModel(Rwaste.class).update();
		redirect("/jf/Enterprise/rwaste");
	}

	/**
	 * 查看
	 */
	public void view() {
		Rwaste rwaste = Rwaste.dao.findById(getPara());
		setAttr("rwaste", rwaste);
		render("/Enterprise/rwaste/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		RwasteService.service.delete("n_rwaste", getPara() == null ? ids : getPara());
		redirect("/jf/Enterprise/rwaste");
	}
	
}
