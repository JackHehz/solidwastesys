package com.carinformation.mvc.carinformationsearch;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.constant.ConstantRender;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.tools.ToolSqlXml;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/carinformation/carinformationsearch
 * /jf/carinformation/carinformationsearch/save
 * /jf/carinformation/carinformationsearch/edit
 * /jf/carinformation/carinformationsearch/update
 * /jf/carinformation/carinformationsearch/view
 * /jf/carinformation/carinformationsearch/delete
 * /common/carinformationsearch/add.html
 * 
 */
//@Controller(controllerKey = "/jf/carinformation/carinformationsearch")
public class CarinformationsearchController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(CarinformationsearchController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, Carinformationsearch.sqlId_splitPage_select, Carinformationsearch.sqlId_splitPage_from);
		render("/carinformation/carinformationsearch/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(CarinformationsearchValidator.class)
	public void save() {
		getModel(Carinformationsearch.class).save();
		render("/platform/index/car_driver.html");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Carinformationsearch carinformationsearch = Carinformationsearch.dao.findById(getPara());
		setAttr("carinformationsearch", carinformationsearch);
		render("/carinformation/carinformationsearch/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(CarinformationsearchValidator.class)
	public void update() {
		getModel(Carinformationsearch.class).update();
		render("/platform/index/car_driver.html");
	}

	/**
	 * 查看
	 */
	public void view() {
		Carinformationsearch carinformationsearch = Carinformationsearch.dao.findById(getPara());
		setAttr("carinformationsearch", carinformationsearch);
		render("/carinformation/carinformationsearch/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		CarinformationsearchService.service.delete("n_carinformation", getPara() == null ? ids : getPara());
		render("/platform/index/car_driver.html");
	}



}
