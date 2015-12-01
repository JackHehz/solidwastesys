package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.enterprises.mvc.enterinfo.enterinfoController;

/**
 * Created by hyw on 2015/10/2.
 */
public class EnterRoutes extends Routes{
    @Override
    public void config() {
        add("/jf/Enterprise/enterinfo", enterinfoController.class);
    }
}
