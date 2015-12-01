package com.rregisterinfo.mvc.rregisterinfo;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class RregisterinfoService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RregisterinfoService.class);
	
	public static final RregisterinfoService service = Enhancer.enhance(RregisterinfoService.class);
	
}
