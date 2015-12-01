package com.carinformation.mvc.carinformationsearch;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class CarinformationsearchService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(CarinformationsearchService.class);
	
	public static final CarinformationsearchService service = Enhancer.enhance(CarinformationsearchService.class);
	
}
