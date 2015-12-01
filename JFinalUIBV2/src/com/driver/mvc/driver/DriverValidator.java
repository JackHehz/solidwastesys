package com.driver.mvc.driver;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class DriverValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(DriverValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/driver/driver/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/driver/driver/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Driver.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/driver/driver/save")){
			controller.render("/driver/xxx.html");
		
		} else if (actionKey.equals("/jf/driver/driver/update")){
			controller.render("/driver/xxx.html");
		
		}
	}
	
}
