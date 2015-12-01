package com.transinfo.mvc.transwaste;

import com.enterprises.mvc.enterinfoprocess.EnterinfoProcess;
import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.mvc.user.User;
import com.platform.tools.ToolDateTime;
import com.service.mvc.dwr.MessagePush;
import com.service.mvc.dwr.testpush;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/transinfo/transwaste
 * /jf/transinfo/transwaste/save
 * /jf/transinfo/transwaste/edit
 * /jf/transinfo/transwaste/update
 * /jf/transinfo/transwaste/view
 * /jf/transinfo/transwaste/delete
 * /common/transwaste/add.html
 * 
 */
//@Controller(controllerKey = "/jf/transinfo/transwaste")
public class TranswasteController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TranswasteController.class);

	Transwasteplan tg=null;
	/**
	 * 列表
	 */
	public void index() {
		render("/transinfo/transwaste/list.html");
	}
	public void wastelist(){
		addpaging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Transwaste.sqlId_splitPage_from, Transwaste.transplan_fk);
		render("/transinfo/transwaste/list1.html");

	}

	public void savegenerator(){

		 tg=getModel(Transwasteplan.class,"transplans");
		System.out.println(tg+"111");
		tg.set(Transwasteplan.column_createdby, User.userIds);
		tg.set(Transwasteplan.column_createdtime, ToolDateTime.getSqlTimestamp(null).toString());
		tg.save();
		Transwaste.transplan_fk=tg.getPKValue();
		addpaging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Transwaste.sqlId_splitPage_from, Transwaste.transplan_fk);
		//paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, EnterinfoProcess.sqlId_splitPage_from);
		render("/transinfo/transwaste/list1.html");


	}
	public void  chenter(){
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, EnterinfoProcess.sqlId_splitPage_from);
		render("/transinfo/transwaste/list2.html");
	}


	public void  finish(){
		render("/transinfo/transwaste/list3.html");
	}
	public void getids(){
		String enterids=getPara() == null ? ids : getPara();
		System.out.println(enterids);
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, EnterinfoProcess.sqlId_splitPage_from);
		render("/transinfo/transwaste/list2.html");
	}

	/**
	 * 保存
	 */
	@Before(TranswasteValidator.class)
	public void save() {
		Transwaste tw=getModel(Transwaste.class,"transwastes");
		tw.set(Transwaste.column_ttransbscinfo_fk,Transwaste.transplan_fk);
		System.out.println(tw);
		tw.save();
		redirect("/jf/transinfo/transwaste/wastelist");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Transwaste transwaste = Transwaste.dao.findById(getPara());
		setAttr("transwaste", transwaste);
		render("/transinfo/transwaste/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(TranswasteValidator.class)
	public void update() {
		getModel(Transwaste.class).update();
		redirect("/jf/transinfo/transwaste");
	}

	/**
	 * 查看
	 */
	public void view() {
		Transwaste transwaste = Transwaste.dao.findById(getPara());
		setAttr("transwaste", transwaste);
		render("/transinfo/transwaste/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		TranswasteService.service.delete("n_transwaste", getPara() == null ? ids : getPara());
		render("/transinfo/transwaste/list1.html");
	}

	public void deleteorder() {
		TranswasteService.service.delete("n_test_transplanunion", getPara() == null ? ids : getPara());
		pagings(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Transwasteplan.sqlId_splitpage_from);
		render("/transinfo/transwaste/order.html");
	}
	//网上预约详情
	public void orderplan()
	{
		pagings(ConstantInit.db_dataSource_main, splitPage, Transwasteplan.sqlId_splitpageplan, Transwasteplan.sqlId_splitpage_from);
		render("/transinfo/transwaste/order.html");

	}
	public void viewwaste(){
		Transwasteplan transwasteplan=Transwasteplan.dao.findById(getPara());
		String params=transwasteplan.getStr(Transwasteplan.column_ids);
		addpaging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Transwaste.sqlId_onlinewaste, params);
		render("/transinfo/transwaste/viewwaste.html");

	}
	
}
