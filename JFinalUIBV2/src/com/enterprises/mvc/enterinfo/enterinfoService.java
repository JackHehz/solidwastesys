package com.enterprises.mvc.enterinfo;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class enterinfoService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(enterinfoService.class);
	
	public static final enterinfoService service = Enhancer.enhance(enterinfoService.class);
	
}
