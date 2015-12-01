package com.enterprises.mvc.enterinfo;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class enterinfoValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(enterinfoValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/enterinfo/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/Enterprise/enterinfo/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(enterinfo.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/Enterprise/enterinfo/save")){
			controller.render("/Enterprise/xxx.html");
		
		} else if (actionKey.equals("/jf/Enterprise/enterinfo/update")){
			controller.render("/Enterprise/xxx.html");
		
		}
	}
	
}
