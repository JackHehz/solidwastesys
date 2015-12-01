package com.plan.mvc.transplan;

import com.enterprises.mvc.enterinfoprocess.EnterinfoProcess;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.mvc.user.User;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/plan/transplan
 * /jf/plan/transplan/save
 * /jf/plan/transplan/edit
 * /jf/plan/transplan/update
 * /jf/plan/transplan/view
 * /jf/plan/transplan/delete
 * /common/transplan/add.html
 * 
 */
//@Controller(controllerKey = "/jf/plan/transplan")
public class TransplanController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TransplanController.class);
	public static  Transplanunion addtu=null;
	
	/**
	 * 列表
	 */
	public void index() {
		if(User.userflag=="0") {
			paging(ConstantInit.db_dataSource_main, splitPage, Transplan.sqlId_splitPage_select, Transplan.sqlId_splitPage_from);
		}
		else{
			pagings(ConstantInit.db_dataSource_main, splitPage, Transplan.sqlId_splitPage_select, Transplan.sqlId_splitpage_from);

		}
		render("/plan/transplan/list.html");
	}
	public void add() {


		transaddpaging(ConstantInit.db_dataSource_main, splitPage, Transplan.sqlId_splitPage_select, Transplan.sqlId_addsplitpage_from);
		render("/plan/transplan/add2.html");
	}



	/**
	 * 保存
	 */
	@Before(TransplanValidator.class)
	public void savetransplan() {
		Transplan t=getModel(Transplan.class);
		System.out.println(t+"1111");
		System.out.println(Transplan.tranplan_fk);
		t.set(Transplan.column_ttransbscinfo_fk,Transplan.tranplan_fk);

		t.save();
		redirect("/jf/plan/transplan/add");
	}
	public void savetransplanunion() {

		addtu=getModel(Transplanunion.class,"transplans");
		addtu.set(Transplanunion.column_createdby,User.userIds);
		System.out.println("222   " + addtu);
		addtu.save();

		Transplan.tranplan_fk=addtu.getPKValue();
		transaddpaging(ConstantInit.db_dataSource_main, splitPage, Transplan.sqlId_splitPage_select, Transplan.sqlId_addsplitpage_from);
		render("/plan/transplan/add2.html");
	}


	/**
	 * 准备更新
	 */
	public void edit() {
		Transplan transplan = Transplan.dao.findById(getPara());
		Transplanunion transplanunion=transplan.getTransplanunion();
		setAttr("transplans", transplanunion);
		setAttr("transplan", transplan);
		render("/plan/transplan/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(TransplanValidator.class)
	public void update() {
		Transplan transplan=getModel(Transplan.class);
		Transplanunion transplanunion=getModel(Transplanunion.class, "transplans");
		TransplanService.service.update(transplan,transplanunion);
		//transplan.update();
		//transplanunion.update();
		redirect("/jf/plan/transplan");
	}

	/**
	 * 查看
	 */
	public void view() {

//		setAttr("transplan", transplan);
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("column_transplanunion",Transplanunion.column_ids);
//		String sql_transplanunion = getSqlByBeetl(Transplanunion.column_transplanunion, param);
//		     System.out.println(sql_transplanunion);
//		Transplanunion.ss= transplan.getTtransbscinfo_fk().toString();
//		List<Transplanunion> trans= Transplanunion.dao.find(sql_transplanunion,Transplanunion.ss);
//		  Transplanunion transpl=null;
//				   transpl=trans.get(0);
//		    System.out.println(transpl);
//
//		setAttr("transplans", Transplanunion.dao.findById(transpl));
		Transplan transplan = Transplan.dao.findById(getPara());
		Transplanunion transplanunion=transplan.getTransplanunion();
		setAttr("transplans", transplanunion);
		render("/plan/transplan/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		TransplanService.service.delete("n_transplan", getPara() == null ? ids : getPara());
		redirect("/jf/plan/transplan");
	}
	
}
