package com.enterprises.mvc.rwaste;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class RwasteValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RwasteValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/rwaste/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/Enterprise/rwaste/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Rwaste.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/rwaste/save")){
			controller.render("/Enterprise/xxx.html");
		
		} else if (actionKey.equals("/jf/Enterprise/rwaste/update")){
			controller.render("/Enterprise/xxx.html");
		
		}
	}
	
}