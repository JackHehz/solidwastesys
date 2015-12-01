package com.contract.mvc.contract;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class ContractValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(ContractValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/contract/contract/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/contract/contract/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Contract.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/contract/contract/save")){
			controller.render("/contract/xxx.html");
		
		} else if (actionKey.equals("/jf/contract/contract/update")){
			controller.render("/contract/xxx.html");
		
		}
	}
	
}
