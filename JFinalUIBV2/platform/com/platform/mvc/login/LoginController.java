package com.platform.mvc.login;

import com.platform.mvc.user.UserInfo;
import com.platform.mvc.user.UserService;
import com.platform.mvc.user.UserValidator;
import org.apache.log4j.Logger;

import com.jfinal.aop.Before;
import com.platform.constant.ConstantLogin;
import com.platform.constant.ConstantWebContext;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.user.User;
import com.platform.tools.ToolWeb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 登陆处理
 */
//@Controller(controllerKey = "/jf/platform/login")
public class LoginController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(LoginController.class);
	
	/**
	 * 准备登陆
	 */
	public void index() {
		User user = getCUser(); // cookie认证自动登陆处理
		if(null != user){//后台
			redirect("/jf/platform/");
		}else{
			render("/platform/login/login.html");
		}
	}

	/**
	 * 验证账号是否可用
	 */
	public void valiUserName(){
		String userIds = getPara("userIds");
		String userName = getPara("userName");
		boolean bool = LoginService.service.valiUserName(userIds, userName);
		renderText(String.valueOf(bool));
	}
	
	/**
	 * 验证邮箱是否可用
	 */
	public void valiMailBox(){
		String userInfoIds = getPara("userInfoIds");
		String mailBox = getPara("mailBox");
		boolean bool = LoginService.service.valiMailBox(userInfoIds, mailBox);
		renderText(String.valueOf(bool));
	}

	/**
	 * 验证身份证是否可用
	 */
	public void valiIdcard(){
		String userInfoIds = getPara("userInfoIds");
		String idcard = getPara("idcard");
		boolean bool = LoginService.service.valiIdcard(userInfoIds, idcard);
		renderText(String.valueOf(bool));
	}

	/**
	 * 验证手机号是否可用
	 */
	public void valiMobile(){
		String userInfoIds = getPara("userInfoIds");
		String mobile = getPara("mobile");
		boolean bool = LoginService.service.valiMobile(userInfoIds, mobile);
		renderText(String.valueOf(bool));
	}

	/**
	 * 登陆验证
	 */
	@Before(LoginValidator.class)
	public void vali() {
		boolean authCode = authCode();
		if(authCode){

			String username = getPara("username");
			User.userName=username;
			Map<String, Object> param_user = new HashMap<String, Object>();
			param_user.put("column_ids", User.column_username);
			//param_user.put("username",User.userName);
			String sql_user = getSqlByBeetl(User.sqlId_userids, param_user);
			System.out.println(sql_user+" 111");
			List<User> userList = User.dao.find(sql_user,User.userName);
			User user=null;
			user = userList.get(0);
			User.userIds = user.getStr(User.column_ids);
			User.userflag=user.getStr(User.column_user_flag);
			System.out.println(User.userIds+" 222");
			System.out.println(User.userflag+" 111");


			String password = getPara("password");
			String remember = getPara("remember");
			boolean autoLogin = false;
			if(null != remember && remember.equals("1")){
				autoLogin = true;
			}
			int result = LoginService.service.login(getRequest(), getResponse(), username, password, autoLogin);
			if(result == ConstantLogin.login_info_3){
				redirect("/jf/platform/index");
				return;
			}
		}
		
		redirect("/jf/platform/login");
	}

	/**
	 * 锁屏验证密码
	 */
	@Before(LoginValidator.class)
	public void pass() {
		User user = getCUser();
		String password = getPara("password");
		
		int result = LoginService.service.pass(getRequest(), getResponse(), user.getStr("username"), password);
		if(result == ConstantLogin.login_info_3){
			redirect("/jf/platform/index");
			return;
		}
		
		redirect("/jf/platform/login");
	}

	/**
	 * 注销
	 */
	public void logout() {
		ToolWeb.addCookie(getResponse(), "", "/", true, ConstantWebContext.cookie_authmark, null, 0);
		redirect("/jf/platform/login");
	}

	/**
	 * 保存新增用户
	 */
	@Before(UserValidator.class)
	public void save() {
		String password = getPara("password");
		User user = getModel(User.class);
		UserInfo userInfo = getModel(UserInfo.class);
		UserService.service.save(user, password, userInfo);
		render("/jf/platform/login");
	}

}
