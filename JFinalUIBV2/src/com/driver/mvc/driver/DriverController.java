package com.driver.mvc.driver;

import com.carinformation.mvc.carinformationsearch.Carinformationsearch;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.constant.ConstantRender;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.mvc.syslog.Syslog;
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
 * /jf/driver/driver
 * /jf/driver/driver/save
 * /jf/driver/driver/edit
 * /jf/driver/driver/update
 * /jf/driver/driver/view
 * /jf/driver/driver/delete
 * /common/driver/add.html
 * 
 */
//@Controller(controllerKey = "/jf/driver/driver")
public class DriverController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(DriverController.class);
	
	/**
	 * 列表
	 */
	public void index() {

		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Driver.sqlId_splitPage_from);

		render("/driver/driver/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(DriverValidator.class)
	public void save() {
		getModel(Driver.class).save();
		render("/platform/index/car_driver.html");
	}

	
	/**
	 * 准备更新
	 */
	public void edit() {
		Driver driver = Driver.dao.findById(getPara());
		setAttr("driver", driver);
		render("/driver/driver/update.html");
	}


	/**
	 * 更新
	 */
	@Before(DriverValidator.class)
	public void update() {
		getModel(Driver.class).update();
		render("/platform/index/car_driver.html");
	}

	/**
	 * 查看
	 */
	public void view() {
		Driver driver = Driver.dao.findById(getPara());
		setAttr("driver", driver);
		render("/driver/driver/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		DriverService.service.delete("n_driver", getPara() == null ? ids : getPara());
		render("/platform/index/car_driver.html");
	}
	
}
