package com.monthreport.mvc.wastemonthreport;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class WastemonthreportValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(WastemonthreportValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/monthreport/wastemonthreport/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/monthreport/wastemonthreport/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Wastemonthreport.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/monthreport/wastemonthreport/save")){
			controller.render("/monthreport/xxx.html");
		
		} else if (actionKey.equals("/jf/monthreport/wastemonthreport/update")){
			controller.render("/monthreport/xxx.html");
		
		}
	}
	
}
