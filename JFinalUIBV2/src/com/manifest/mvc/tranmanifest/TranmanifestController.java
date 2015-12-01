package com.manifest.mvc.tranmanifest;

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
 * /jf/manifest/tranmanifest
 * /jf/manifest/tranmanifest/save
 * /jf/manifest/tranmanifest/edit
 * /jf/manifest/tranmanifest/update
 * /jf/manifest/tranmanifest/view
 * /jf/manifest/tranmanifest/delete
 * /common/tranmanifest/add.html
 * 
 */
//@Controller(controllerKey = "/jf/manifest/tranmanifest")
public class TranmanifestController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TranmanifestController.class);


	/**
	 * 列表
	 */
	public void index() {
		if(User.userflag=="0")
		{
			paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Tranmanifest.sqlId_splitPage_from);

		}
		else{
			pagings(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Tranmanifest.sqlId_splitpage_from);}

		render("/manifest/tranmanifest/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(TranmanifestValidator.class)
	public void save() {
		Tranmanifest tranmanifest=getModel(Tranmanifest.class);
		tranmanifest.set(tranmanifest.column_createdbyids,User.userIds);
		tranmanifest.save();
		redirect("/jf/manifest/tranmanifest");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Tranmanifest tranmanifest = Tranmanifest.dao.findById(getPara());
		setAttr("tranmanifest", tranmanifest);
		render("/manifest/tranmanifest/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(TranmanifestValidator.class)
	public void update() {
		getModel(Tranmanifest.class).update();
		redirect("/jf/manifest/tranmanifest");
	}

	/**
	 * 查看
	 */
	public void view() {
		Tranmanifest tranmanifest = Tranmanifest.dao.findById(getPara());
		setAttr("tranmanifest", tranmanifest);
		render("/manifest/tranmanifest/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		TranmanifestService.service.delete("n_manifest", getPara() == null ? ids : getPara());
		redirect("/jf/manifest/tranmanifest");
	}
	
}
