package com.commonsearch.mvc.hangyeleibie;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class HangyeleibieValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(HangyeleibieValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/commonsearch/hangyeleibie/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/commonsearch/hangyeleibie/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Hangyeleibie.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/commonsearch/hangyeleibie/save")){
			controller.render("/commonsearch/xxx.html");
		
		} else if (actionKey.equals("/jf/commonsearch/hangyeleibie/update")){
			controller.render("/commonsearch/xxx.html");
		
		}
	}
	
}
