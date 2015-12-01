package com.manageplan.mvc.wastemanageplan;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class WastemanageplanService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(WastemanageplanService.class);
	
	public static final WastemanageplanService service = Enhancer.enhance(WastemanageplanService.class);
	
}
