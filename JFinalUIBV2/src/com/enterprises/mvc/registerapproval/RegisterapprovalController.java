package com.enterprises.mvc.registerapproval;

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
 * /jf/Enterprise/registerapproval
 * /jf/Enterprise/registerapproval/save
 * /jf/Enterprise/registerapproval/edit
 * /jf/Enterprise/registerapproval/update
 * /jf/Enterprise/registerapproval/view
 * /jf/Enterprise/registerapproval/delete
 * /common/registerapproval/add.html
 * 
 */
//@Controller(controllerKey = "/jf/Enterprise/registerapproval")
public class RegisterapprovalController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RegisterapprovalController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Registerapproval.sqlId_splitPage_from);
		render("/Enterprise/registerapproval/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(RegisterapprovalValidator.class)
	public void save() {
		getModel(Registerapproval.class).save();
		render("/Enterprise/registerapproval/add.html");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Registerapproval registerapproval = Registerapproval.dao.findById(getPara());
		setAttr("registerapproval", registerapproval);
		render("/Enterprise/registerapproval/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(RegisterapprovalValidator.class)
	public void update() {
		getModel(Registerapproval.class).update();
		redirect("/jf/Enterprise/registerapproval");
	}

	/**
	 * 查看
	 */
	public void view() {
		Registerapproval registerapproval = Registerapproval.dao.findById(getPara());
		setAttr("registerapproval", registerapproval);
		render("/Enterprise/registerapproval/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		RegisterapprovalService.service.delete("n_register", getPara() == null ? ids : getPara());
		redirect("/jf/Enterprise/registerapproval");
	}
	
}
