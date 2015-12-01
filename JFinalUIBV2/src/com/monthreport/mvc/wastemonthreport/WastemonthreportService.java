package com.monthreport.mvc.wastemonthreport;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class WastemonthreportService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(WastemonthreportService.class);
	
	public static final WastemonthreportService service = Enhancer.enhance(WastemonthreportService.class);
	
}
