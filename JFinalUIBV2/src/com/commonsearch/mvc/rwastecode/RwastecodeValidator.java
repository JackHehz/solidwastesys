package com.commonsearch.mvc.rwastecode;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class RwastecodeValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(RwastecodeValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/commonsearch/rwastecode/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/commonsearch/rwastecode/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Rwastecode.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/commonsearch/rwastecode/save")){
			controller.render("/commonsearch/xxx.html");
		
		} else if (actionKey.equals("/jf/commonsearch/rwastecode/update")){
			controller.render("/commonsearch/xxx.html");
		
		}
	}
	
}
