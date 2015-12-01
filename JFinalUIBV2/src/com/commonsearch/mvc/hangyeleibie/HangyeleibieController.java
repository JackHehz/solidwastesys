package com.commonsearch.mvc.hangyeleibie;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.dto.ZtreeNode;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import org.apache.log4j.Logger;

import com.jfinal.aop.Before;

import java.util.List;

/**
 * XXX 管理	
 * 描述：
 * 
 * /jf/commonsearch/hangyeleibie
 * /jf/commonsearch/hangyeleibie/save
 * /jf/commonsearch/hangyeleibie/edit
 * /jf/commonsearch/hangyeleibie/update
 * /jf/commonsearch/hangyeleibie/view
 * /jf/commonsearch/hangyeleibie/delete
 * /common/hangyeleibie/add.html
 * 
 */
//@Controller(controllerKey = "/jf/commonsearch/hangyeleibie")
public class HangyeleibieController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(HangyeleibieController.class);

	private String pIds; // 上级模块ids
	private String names; // 模块名称
	private int orderIds; // 模块排序号
	
	/**
	 * 列表
	 */
	public void index() {
		render("/commonsearch/hangyeleibie/tree.html");
	}
	public void treeData()  {
		List<ZtreeNode> nodeList = HangyeleibieService.service.childNodeData(getCxt(), ids);

		renderJson(nodeList);
	}
	/**
	 * 保存
	 */
	@Before(HangyeleibieValidator.class)
	public void save() {
		ids = HangyeleibieService.service.save(pIds, names, orderIds);
		renderText(ids);
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Hangyeleibie hangyeleibie = Hangyeleibie.dao.findById(getPara());
		setAttr("hangyeleibie", hangyeleibie);
		render("/commonsearch/hangyeleibie/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(HangyeleibieValidator.class)
	public void update() {
		HangyeleibieService.service.update(ids, pIds, names);
		renderText(ids);
	}

	/**
	 * 查看
	 */
	public void view() {
		Hangyeleibie hangyeleibie = Hangyeleibie.dao.findById(getPara());
		setAttr("hangyeleibie", hangyeleibie);
		render("/commonsearch/hangyeleibie/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		boolean bool=HangyeleibieService.service.delete(ids);
		renderText(String.valueOf(bool));
	}
	
}
