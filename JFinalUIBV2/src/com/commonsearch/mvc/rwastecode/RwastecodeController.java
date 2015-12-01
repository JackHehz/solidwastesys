package com.commonsearch.mvc.rwastecode;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.dto.ZtreeNode;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.platform.mvc.dept.DepartmentService;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

import java.util.List;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/commonsearch/rwastecode
 * /jf/commonsearch/rwastecode/save
 * /jf/commonsearch/rwastecode/edit
 * /jf/commonsearch/rwastecode/update
 * /jf/commonsearch/rwastecode/view
 * /jf/commonsearch/rwastecode/delete
 * /common/rwastecode/add.html
 * 
 */
//@Controller(controllerKey = "/jf/commonsearch/rwastecode")
public class RwastecodeController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RwastecodeController.class);

	private String pIds; // 上级模块ids
	private String names; // 模块名称
	private int orderIds; // 模块排序号
	/**
	 * 列表
	 */
	public void index() {
		render("/commonsearch/rwastecode/tree.html");
	}

	public void treeData()  {
		List<ZtreeNode> nodeList = RwastecodeService.service.childNodeData(getCxt(), ids);
		System.out.println("1024+++++++++");
		renderJson(nodeList);
	}
	
	/**
	 * 保存
	 */
	@Before(RwastecodeValidator.class)
	public void save() {
		ids = RwastecodeService.service.save(pIds, names, orderIds);
		renderText(ids);

	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Rwastecode rwastecode = Rwastecode.dao.findById(getPara());
		setAttr("rwastecode", rwastecode);
		render("/commonsearch/rwastecode/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(RwastecodeValidator.class)
	public void update() {
		RwastecodeService.service.update(ids, pIds, names);
		renderText(ids);
	}

	/**
	 * 查看
	 */
	public void view() {
		Rwastecode rwastecode = Rwastecode.dao.findById(getPara());
		setAttr("rwastecode", rwastecode);
		render("/commonsearch/rwastecode/view.html");
	}
	
	/**
	 * 删除
	 */
	/**
	 * 删除模块
	 */
	public void delete() {
		boolean bool=RwastecodeService.service.delete(ids);
		renderText(String.valueOf(bool));


	}
	
}
