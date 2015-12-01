package com.enterprises.mvc.registerapproval;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class RegisterapprovalService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RegisterapprovalService.class);
	
	public static final RegisterapprovalService service = Enhancer.enhance(RegisterapprovalService.class);
	
}
