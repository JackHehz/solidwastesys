package com.monthreport.mvc.wastemonthreport;

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
 * /jf/monthreport/wastemonthreport
 * /jf/monthreport/wastemonthreport/save
 * /jf/monthreport/wastemonthreport/edit
 * /jf/monthreport/wastemonthreport/update
 * /jf/monthreport/wastemonthreport/view
 * /jf/monthreport/wastemonthreport/delete
 * /common/wastemonthreport/add.html
 * 
 */
//@Controller(controllerKey = "/jf/monthreport/wastemonthreport")
public class WastemonthreportController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(WastemonthreportController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Wastemonthreport.sqlId_splitPage_from);
		render("/monthreport/wastemonthreport/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(WastemonthreportValidator.class)
	public void save() {
		getModel(Wastemonthreport.class).save();
		redirect("/jf/monthreport/wastemonthreport");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Wastemonthreport wastemonthreport = Wastemonthreport.dao.findById(getPara());
		setAttr("wastemonthreport", wastemonthreport);
		render("/monthreport/wastemonthreport/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(WastemonthreportValidator.class)
	public void update() {
		getModel(Wastemonthreport.class).update();
		redirect("/jf/monthreport/wastemonthreport");
	}

	/**
	 * 查看
	 */
	public void view() {
		Wastemonthreport wastemonthreport = Wastemonthreport.dao.findById(getPara());
		setAttr("wastemonthreport", wastemonthreport);
		render("/monthreport/wastemonthreport/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		WastemonthreportService.service.delete("n_mmonthreport", getPara() == null ? ids : getPara());
		redirect("/jf/monthreport/wastemonthreport");
	}
	
}
