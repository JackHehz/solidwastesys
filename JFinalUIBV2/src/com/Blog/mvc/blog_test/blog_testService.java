package com.Blog.mvc.blog_test;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class blog_testService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(blog_testService.class);
	
	public static final blog_testService service = Enhancer.enhance(blog_testService.class);
	
}
