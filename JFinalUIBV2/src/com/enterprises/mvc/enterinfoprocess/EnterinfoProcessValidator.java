package com.enterprises.mvc.enterinfoprocess;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class EnterinfoProcessValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(EnterinfoProcessValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/enterinfoProcess/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/Enterprise/enterinfoProcess/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(EnterinfoProcess.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/enterinfoProcess/save")){
			controller.render("/Enterprise/xxx.html");
		
		} else if (actionKey.equals("/jf/Enterprise/enterinfoProcess/update")){
			controller.render("/Enterprise/xxx.html");
		
		}
	}
	
}
