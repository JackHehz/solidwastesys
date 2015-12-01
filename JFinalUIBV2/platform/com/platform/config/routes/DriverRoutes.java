package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.driver.mvc.driver.DriverController;

/**
 * 测试模块路由
 */
public class DriverRoutes extends Routes {

	@Override
	public void config() {
		add("/jf/driver/driver", DriverController.class);
	}

}
