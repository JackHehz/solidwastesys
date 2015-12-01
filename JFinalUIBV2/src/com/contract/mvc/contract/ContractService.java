package com.contract.mvc.contract;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class ContractService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(ContractService.class);
	
	public static final ContractService service = Enhancer.enhance(ContractService.class);
	
}
