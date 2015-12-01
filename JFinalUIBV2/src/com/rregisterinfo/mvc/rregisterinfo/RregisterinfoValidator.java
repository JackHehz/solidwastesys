package com.rregisterinfo.mvc.rregisterinfo;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class RregisterinfoValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RregisterinfoValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/rregisterinfo/rregisterinfo/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/rregisterinfo/rregisterinfo/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Rregisterinfo.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/rregisterinfo/rregisterinfo/save")){
			controller.render("/rregisterinfo/xxx.html");
		
		} else if (actionKey.equals("/jf/rregisterinfo/rregisterinfo/update")){
			controller.render("/rregisterinfo/xxx.html");
		
		}
	}
	
}
