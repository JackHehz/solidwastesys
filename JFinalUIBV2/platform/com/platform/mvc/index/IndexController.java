package com.platform.mvc.index;

import java.util.List;
import java.util.*;

import com.service.mvc.dwr.RequestFilter;
import org.apache.log4j.Logger;

import com.platform.annotation.Controller;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.menu.Menu;
import com.platform.mvc.resources.ResourcesService;
import com.platform.mvc.systems.Systems;
import com.platform.mvc.user.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页处理
 */
@SuppressWarnings("unused")
//@Controller(controllerKey = {"/jf/platform/", "/jf/platform/index"})
public class IndexController extends BaseController {

	private static Logger log = Logger.getLogger(IndexController.class);
	
	private List<Systems> systemsList; // 系统列表
	private List<Menu> menuList; // 菜单列表
	
	/**
	 * 首页
	 */
	public void index() {
		User user = getCUser(); // cookie认证自动登陆处理
		if(null != user){//后台
			String sql = IndexService.service.getSql(Systems.sqlId_all);
			systemsList = Systems.dao.find(sql);
			if(null == ids || ids.isEmpty()){ // 默认系统
				ids = "8a40c0353fa828a6013fa898d4ac0020";
			}
			menuList = IndexService.service.menu(ids, user, getI18nPram());
			User.userName=user.getStr(User.column_username);
			User.userIds = user.getStr(User.column_ids);
			User.userflag=user.getStr(User.column_user_flag);
//			HttpServletRequest request = RequestFilter.threadLocalRequest.get();
//			String path = request.getContextPath();
//			System.out.println(path+"777777");
			setAttr("userid",User.userIds);
			render("/platform/index/index.html");
		}else{
			render("/platform/login/login.html");
		}
	}
	
	/**
	 * 首页content
	 */
	public void content(){;
		setAttrs(ResourcesService.service.pv());
		setAttrs(ResourcesService.service.getResources());
		render("/platform/index/content.html");
	}
	public void car_driver(){;
		setAttrs(ResourcesService.service.pv());
		setAttrs(ResourcesService.service.getResources());
		render("/platform/index/car_driver.html");
	}
	public void withoutplan(){;
		setAttrs(ResourcesService.service.pv());
		setAttrs(ResourcesService.service.getResources());
		render("/platform/index/withoutplan.html");
	}
	
}
