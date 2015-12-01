package com.plan.mvc.transplan;

import com.platform.tools.security.ToolPbkdf2;
import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class TransplanService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TransplanService.class);
	
	public static final TransplanService service = Enhancer.enhance(TransplanService.class);

	public void update(Transplan transplan,Transplanunion transplanunion) {
		try {


			transplan.update();
			transplanunion.update();


		} catch (Exception e) {
			throw new RuntimeException("更新用户异常", e);
		}
	}


}
