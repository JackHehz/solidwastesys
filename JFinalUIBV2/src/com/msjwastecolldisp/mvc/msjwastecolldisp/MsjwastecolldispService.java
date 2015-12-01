package com.msjwastecolldisp.mvc.msjwastecolldisp;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class MsjwastecolldispService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(MsjwastecolldispService.class);
	
	public static final MsjwastecolldispService service = Enhancer.enhance(MsjwastecolldispService.class);
	
}
