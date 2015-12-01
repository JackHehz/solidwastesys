package com.manageplan.mvc.wastemanageplan;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.mvc.user.User;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/manageplan/wastemanageplan
 * /jf/manageplan/wastemanageplan/save
 * /jf/manageplan/wastemanageplan/edit
 * /jf/manageplan/wastemanageplan/update
 * /jf/manageplan/wastemanageplan/view
 * /jf/manageplan/wastemanageplan/delete
 * /common/wastemanageplan/add.html
 * 
 */
//@Controller(controllerKey = "/jf/manageplan/wastemanageplan")
public class WastemanageplanController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(WastemanageplanController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		if(User.userflag=="0") {
			paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Wastemanageplan.sqlId_splitPage_from);
		}
		else{
			pagings(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Wastemanageplan.sqlId_splitpage_from);

		}
		render("/manageplan/wastemanageplan/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(WastemanageplanValidator.class)
	public void save() {
		getModel(Wastemanageplan.class).save();
		redirect("/jf/manageplan/wastemanageplan");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Wastemanageplan wastemanageplan = Wastemanageplan.dao.findById(getPara());
		setAttr("wastemanageplan", wastemanageplan);
		render("/manageplan/wastemanageplan/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(WastemanageplanValidator.class)
	public void update() {
		getModel(Wastemanageplan.class).update();
		redirect("/jf/manageplan/wastemanageplan");
	}

	/**
	 * 查看
	 */
	public void view() {
		Wastemanageplan wastemanageplan = Wastemanageplan.dao.findById(getPara());
		setAttr("wastemanageplan", wastemanageplan);
		render("/manageplan/wastemanageplan/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		WastemanageplanService.service.delete("n_wastemanageplan", getPara() == null ? ids : getPara());
		redirect("/jf/manageplan/wastemanageplan");
	}
	
}
