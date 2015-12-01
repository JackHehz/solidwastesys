package com.transinfo.mvc.transwaste;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class TranswasteService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TranswasteService.class);
	
	public static final TranswasteService service = Enhancer.enhance(TranswasteService.class);
	
}
