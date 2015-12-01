package com.weixin.mvc.keyword;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.jfinal.aop.Enhancer;
import com.platform.mvc.base.BaseService;
import com.weixin.lucene.DocKeyword;

public class KeywordService extends BaseService {

	private static Logger log = Logger.getLogger(KeywordService.class);

	public static final KeywordService service = Enhancer.enhance(KeywordService.class);
	
	/**
	 * 保存
	 * @param keyword
	 * @return
	 */
	public String save(Keyword keyword){
		log.debug("添加关键字：" + JSON.toJSONString(keyword));
		keyword.save();
		new DocKeyword().add(keyword); // 索引
		return keyword.getPKValue();
	}

	/**
	 * 更新
	 * @param keyword
	 */
	public void update(Keyword keyword){
		log.debug("更新关键字：" + JSON.toJSONString(keyword));
		keyword.update();
		new DocKeyword().update(keyword); // 索引
	}

	/**
	 * 删除
	 * @param ids
	 */
	public void delete(String ids){
		log.debug("删除关键字：ids = " + ids);
		Keyword.dao.deleteById(ids);
		new DocKeyword().delete(ids); // 索引
	}
	
}
