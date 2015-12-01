package com.rregisterinfo.mvc.rregisterinfo;

import com.enterprises.mvc.enterinfo.enterinfo;
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
 * /jf/rregisterinfo/rregisterinfo
 * /jf/rregisterinfo/rregisterinfo/save
 * /jf/rregisterinfo/rregisterinfo/edit
 * /jf/rregisterinfo/rregisterinfo/update
 * /jf/rregisterinfo/rregisterinfo/view
 * /jf/rregisterinfo/rregisterinfo/delete
 * /common/rregisterinfo/add.html
 * 
 */
//@Controller(controllerKey = "/jf/rregisterinfo/rregisterinfo")
public class RregisterinfoController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RregisterinfoController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		if(User.userflag=="0")
				paging(ConstantInit.db_dataSource_main, splitPage, Rregisterinfo.sqlId_splitPage_select, Rregisterinfo.sqlId_splitPage_from);
		else
				pagings(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Rregisterinfo.sqlId_splitpage_from);


		render("/rregisterinfo/rregisterinfo/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(RregisterinfoValidator.class)
	public void save() {
		getModel(Rregisterinfo.class).save();
		render("/rregisterinfo/rregisterinfo/add.html");
	}
	public void savewaste(){
		getModel(Yearreportwaste.class).save();
		redirect("/jf/rregisterinfo/rregisterinfo/view");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Rregisterinfo rregisterinfo = Rregisterinfo.dao.findById(getPara());
		setAttr("rregisterinfo", rregisterinfo);
		render("/rregisterinfo/rregisterinfo/update.html");
	}
	public void editwaste(){
		Yearreportwaste yearreportwaste=Yearreportwaste.dao.findById(getPara());
		setAttr("rregisterinfowaste",yearreportwaste);
		render("/rregisterinfo/rregisterinfo/updatewaste.html");
	}
	public void updatawaste(){
		getModel(Yearreportwaste.class).update();
		redirect("/jf/rregisterinfo/rregisterinfo/view");
	}
	/**
	 * 更新
	 */
	@Before(RregisterinfoValidator.class)
	public void update() {
		getModel(Rregisterinfo.class).update();
		redirect("/jf/rregisterinfo/rregisterinfo");
	}

	/**
	 * 查看
	 */
	public void view() {
		Rregisterinfo rregisterinfo = Rregisterinfo.dao.findById(getPara());
		setAttr("rregisterinfo", rregisterinfo);
		enterinfo Enterinfo = rregisterinfo.getenterinfo();
		setAttr("enterinfo",Enterinfo);
		System.out.println(Enterinfo+"   8889");
		//年报废物列表
		splitPagewaste=splitPage;
		pagings(ConstantInit.db_dataSource_main, splitPagewaste, Yearreportwaste.sqlId_splitwaste_select, Yearreportwaste.sqlId_splitwaste_from);
		//存储情况登记表
		splitPagereserve=splitPage;
		pagings(ConstantInit.db_dataSource_main, splitPagereserve, BaseModel.sqlId_splitPage_select, Reservewaste.sqlId_splitreserve_from);
		//委托处理表
		splitPagerutilize=splitPage;
		pagings(ConstantInit.db_dataSource_main, splitPagerutilize, BaseModel.sqlId_splitPage_select, Rutilizewaste.sqlId_splitrutilize_from);


		render("/rregisterinfo/rregisterinfo/view.html");
	}
	public void viewwaste(){
		Yearreportwaste yearreportwaste=Yearreportwaste.dao.findById(getPara());
		setAttr("rregisterinfowaste",yearreportwaste);
		render("/rregisterinfo/rregisterinfo/viewwaste.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		RregisterinfoService.service.delete("n_rregisterinfo", getPara() == null ? ids : getPara());
		redirect("/jf/rregisterinfo/rregisterinfo");
	}

	public void deletewaste() {
		RregisterinfoService.service.delete("n_rindustryhazardouswastestable", getPara() == null ? ids : getPara());
		redirect("/jf/rregisterinfo/rregisterinfo");
	}
	
}
