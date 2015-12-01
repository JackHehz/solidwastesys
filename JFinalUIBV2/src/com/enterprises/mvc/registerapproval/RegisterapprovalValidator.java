package com.enterprises.mvc.registerapproval;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class RegisterapprovalValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RegisterapprovalValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/registerapproval/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/Enterprise/registerapproval/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Registerapproval.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/registerapproval/save")){
			controller.render("/Enterprise/xxx.html");
		
		} else if (actionKey.equals("/jf/Enterprise/registerapproval/update")){
			controller.render("/Enterprise/xxx.html");
		
		}
	}
	
}
