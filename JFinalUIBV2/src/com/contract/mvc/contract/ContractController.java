package com.contract.mvc.contract;

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
 * /jf/contract/contract
 * /jf/contract/contract/save
 * /jf/contract/contract/edit
 * /jf/contract/contract/update
 * /jf/contract/contract/view
 * /jf/contract/contract/delete
 * /common/contract/add.html
 * 
 */
//@Controller(controllerKey = "/jf/contract/contract")
public class ContractController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(ContractController.class);
	
	/**
	 * 列表
	 */
	public void index() {
		if(User.userflag=="0")
		{
			paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Contract.sqlId_splitPage_from);

		}
		else{
			pagings(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPage_select, Contract.sqlId_splitpage_from);}
		render("/contract/contract/list.html");
	}

	
	/**
	 * 保存
	 */
	@Before(ContractValidator.class)
	public void save() {
		Contract contract=getModel(Contract.class);
		contract.set(Contract.column_createdby, User.userIds);
		contract.save();
		render("/contract/contract/list.html");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Contract contract = Contract.dao.findById(getPara());
		setAttr("contract", contract);
		render("/contract/contract/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(ContractValidator.class)
	public void update() {
		getModel(Contract.class).update();
		redirect("/jf/contract/contract");
	}

	/**
	 * 查看
	 */
	public void view() {
		Contract contract = Contract.dao.findById(getPara());
		setAttr("contract", contract);
		render("/contract/contract/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		ContractService.service.delete("n_contract", getPara() == null ? ids : getPara());
		redirect("/jf/contract/contract");
	}
	
}
