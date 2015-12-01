package com.driver.mvc.driver;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class DriverService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(DriverService.class);
	
	public static final DriverService service = Enhancer.enhance(DriverService.class);
	
}
