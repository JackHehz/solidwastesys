package com.Blog.mvc.blog_test;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class blog_testValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(blog_testValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/enterprises/blog_test/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/enterprises/blog_test/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(blog_test.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/enterprises/blog_test/save")){
			controller.render("/enterprises/xxx.html");
		
		} else if (actionKey.equals("/jf/enterprises/blog_test/update")){
			controller.render("/enterprises/xxx.html");
		
		}
	}
	
}
