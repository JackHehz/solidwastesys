package com.transinfo.mvc.transwaste;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class TranswasteValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TranswasteValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/transinfo/transwaste/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/transinfo/transwaste/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Transwaste.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/transinfo/transwaste/save")){
			controller.render("/transinfo/xxx.html");
		
		} else if (actionKey.equals("/jf/transinfo/transwaste/update")){
			controller.render("/transinfo/xxx.html");
		
		}
	}
	
}
