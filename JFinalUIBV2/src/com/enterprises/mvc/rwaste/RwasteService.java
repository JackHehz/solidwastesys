package com.enterprises.mvc.rwaste;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class RwasteService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RwasteService.class);
	
	public static final RwasteService service = Enhancer.enhance(RwasteService.class);
	
}
