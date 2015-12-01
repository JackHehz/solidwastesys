package com.enterprises.mvc.enterinfoprocess;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class EnterinfoProcessService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(EnterinfoProcessService.class);
	
	public static final EnterinfoProcessService service = Enhancer.enhance(EnterinfoProcessService.class);
	
}
