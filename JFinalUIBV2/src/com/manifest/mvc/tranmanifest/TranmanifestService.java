package com.manifest.mvc.tranmanifest;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class TranmanifestService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TranmanifestService.class);
	
	public static final TranmanifestService service = Enhancer.enhance(TranmanifestService.class);
	
}
