package com.commonsearch.mvc.hangyeleibie;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.platform.constant.ConstantInit;
import com.platform.dto.ZtreeNode;
import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

import java.util.ArrayList;
import java.util.List;

public class HangyeleibieService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(HangyeleibieService.class);
	
	public static final HangyeleibieService service = Enhancer.enhance(HangyeleibieService.class);


	/**
	 * 获取子节点数据
	 * @param cxt
	 * @param parentIds
	 * @return
	 */
	public List<ZtreeNode> childNodeData(String cxt,String parentIds){
		List<Hangyeleibie> list = null;
		if( null == parentIds){
			// 模块单选初始化调用
			String sql = getSql(Hangyeleibie.sqlId_root);
			System.out.println(sql+"111");
			list = Hangyeleibie.dao.find(sql);
			System.out.println(sql+"222");
			System.out.println(list.get(0));

		}
		else {
			// 通用子节点查询
			String sql = getSql(Hangyeleibie.sqlId_child);
			list = Hangyeleibie.dao.find(sql, parentIds);
			System.out.println(sql+"111");
			System.out.println(list.get(0));
		}

		List<ZtreeNode> nodeList = new ArrayList<ZtreeNode>();
		ZtreeNode node = null;

		for (Hangyeleibie module : list) {
			node = new ZtreeNode();
			node.setId(module.getPKValue());
			node.setName(module.getStr("name"));
			node.setIsParent(true);
			nodeList.add(node);
		}

		return nodeList;
	}

	/**
	 * 保存
	 * @param pIds
	 * @param names
	 * @param orderIds
	 * @return
	 */
	public String save(String pIds, String names, int orderIds) {
		Hangyeleibie pDept = Hangyeleibie.dao.findById(pIds);
		pDept.set(Hangyeleibie.column_isparent, "true").update();



		Hangyeleibie module = new Hangyeleibie();
		module.set(Hangyeleibie.column_isparent, "false");
		module.set(Hangyeleibie.column_hangyeleibie_fk, pIds);
		module.set(Hangyeleibie.column_name, names);
		module.save();

		return module.getPKValue();
	}

	/**
	 * 更新
	 * @param ids
	 * @param pIds
	 * @param names
	 */
	public void update(String ids, String pIds, String names) {
		Hangyeleibie module = Hangyeleibie.dao.findById(ids);
		if(null != names && !names.isEmpty()){
			//更新模块名称
			module.set(Hangyeleibie.column_name, names).update();

		}else if(null != pIds && !pIds.isEmpty()){
			//更新上级模块
			module.set(Hangyeleibie.column_hangyeleibie_fk, pIds).update();
		}
	}

	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	public boolean delete(String ids) {
		Hangyeleibie module = Hangyeleibie.dao.findById(ids);

		// 是否存在子节点
		if(module.getStr(Hangyeleibie.column_isparent).equals("true")){
			return false; //存在子节点，不能直接删除
		}

		// 修改上级节点的isparent
		Hangyeleibie pModule = Hangyeleibie.dao.findById(module.getStr(Hangyeleibie.column_hangyeleibie_fk));
		String sql = getSql(Hangyeleibie.sqlId_childCount);
		Record record = Db.use(ConstantInit.db_dataSource_main).findFirst(sql, pModule.getPKValue());
		Long counts = record.getNumber("counts").longValue();
		if(counts == 1){
			pModule.set(Hangyeleibie.column_isparent, "false");
			pModule.update();
		}

		// 删除
		Hangyeleibie.dao.deleteById(ids);

		return true;
	}


}
