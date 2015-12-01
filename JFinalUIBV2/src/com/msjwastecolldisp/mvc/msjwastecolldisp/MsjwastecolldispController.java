package com.msjwastecolldisp.mvc.msjwastecolldisp;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.mvc.user.User;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

import java.util.HashMap;
import java.util.Map;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/msjwastecolldisp/msjwastecolldisp
 * /jf/msjwastecolldisp/msjwastecolldisp/save
 * /jf/msjwastecolldisp/msjwastecolldisp/edit
 * /jf/msjwastecolldisp/msjwastecolldisp/update
 * /jf/msjwastecolldisp/msjwastecolldisp/view
 * /jf/msjwastecolldisp/msjwastecolldisp/delete
 * /common/msjwastecolldisp/add.html
 * 
 */
//@Controller(controllerKey = "/jf/msjwastecolldisp/msjwastecolldisp")
public class MsjwastecolldispController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(MsjwastecolldispController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		System.out.println(User.userName);
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("splitPageFrom", Msjwastecolldisp.column_sys_createdby);
//		param.put("splitPageFroms", User.userName);

		//param.put("splitPageFrom", User.column_username);
		//String sql = getSqlByBeetl(Msjwastecolldisp.sqlId_splitPage_from, param);

		pagings(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select,Msjwastecolldisp.sqlId_splitPage_from);
		render("/msjwastecolldisp/msjwastecolldisp/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(MsjwastecolldispValidator.class)
	public void save() {
		getModel(Msjwastecolldisp.class).save();
		redirect("/jf/msjwastecolldisp/msjwastecolldisp");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Msjwastecolldisp msjwastecolldisp = Msjwastecolldisp.dao.findById(getPara());
		setAttr("msjwastecolldisp", msjwastecolldisp);
		render("/msjwastecolldisp/msjwastecolldisp/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(MsjwastecolldispValidator.class)
	public void update() {
		getModel(Msjwastecolldisp.class).update();
		redirect("/jf/msjwastecolldisp/msjwastecolldisp");
	}

	/**
	 * 查看
	 */
	public void view() {
		Msjwastecolldisp msjwastecolldisp = Msjwastecolldisp.dao.findById(getPara());
		setAttr("msjwastecolldisp", msjwastecolldisp);
		render("/msjwastecolldisp/msjwastecolldisp/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		MsjwastecolldispService.service.delete("n_msjwastecolldisp", getPara() == null ? ids : getPara());
		redirect("/jf/msjwastecolldisp/msjwastecolldisp");
	}
	
}
