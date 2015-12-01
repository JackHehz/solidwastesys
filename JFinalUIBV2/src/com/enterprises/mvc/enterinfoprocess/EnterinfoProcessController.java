package com.enterprises.mvc.enterinfoprocess;

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
 * /jf/Enterprise/enterinfoProcess
 * /jf/Enterprise/enterinfoProcess/save
 * /jf/Enterprise/enterinfoProcess/edit
 * /jf/Enterprise/enterinfoProcess/update
 * /jf/Enterprise/enterinfoProcess/view
 * /jf/Enterprise/enterinfoProcess/delete
 * /common/enterinfoProcess/add.html
 * 
 */
//@Controller(controllerKey = "/jf/Enterprise/enterinfoProcess")
public class EnterinfoProcessController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(EnterinfoProcessController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, EnterinfoProcess.sqlId_splitPage_from);
		render("/Enterprise/enterinfoProcess/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(EnterinfoProcessValidator.class)
	public void save() {
		getModel(EnterinfoProcess.class).save();
		render("/Enterprise/enterinfoProcess/add.html");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		EnterinfoProcess enterinfoProcess = EnterinfoProcess.dao.findById(getPara());
		setAttr("enterinfoProcess", enterinfoProcess);
		render("/Enterprise/enterinfoProcess/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(EnterinfoProcessValidator.class)
	public void update() {
		getModel(EnterinfoProcess.class).update();
		redirect("/jf/Enterprise/enterinfoProcess");
	}

	/**
	 * 查看
	 */
	public void view() {
		EnterinfoProcess enterinfoProcess = EnterinfoProcess.dao.findById(getPara());
		setAttr("enterinfoProcess", enterinfoProcess);
		render("/Enterprise/enterinfoProcess/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		EnterinfoProcessService.service.delete("n_bcommonenterprises", getPara() == null ? ids : getPara());
		redirect("/jf/Enterprise/enterinfoProcess");
	}
	
}
