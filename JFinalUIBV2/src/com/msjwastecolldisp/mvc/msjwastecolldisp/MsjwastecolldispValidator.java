package com.msjwastecolldisp.mvc.msjwastecolldisp;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class MsjwastecolldispValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(MsjwastecolldispValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/msjwastecolldisp/msjwastecolldisp/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/msjwastecolldisp/msjwastecolldisp/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Msjwastecolldisp.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/msjwastecolldisp/msjwastecolldisp/save")){
			controller.render("/msjwastecolldisp/xxx.html");
		
		} else if (actionKey.equals("/jf/msjwastecolldisp/msjwastecolldisp/update")){
			controller.render("/msjwastecolldisp/xxx.html");
		
		}
	}
	
}
