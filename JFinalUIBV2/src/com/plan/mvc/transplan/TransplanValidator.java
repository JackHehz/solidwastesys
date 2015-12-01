package com.plan.mvc.transplan;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class TransplanValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TransplanValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/plan/transplan/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/plan/transplan/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Transplan.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/plan/transplan/save")){
			controller.render("/plan/xxx.html");
		
		} else if (actionKey.equals("/jf/plan/transplan/update")){
			controller.render("/plan/xxx.html");
		
		}
	}
	
}
