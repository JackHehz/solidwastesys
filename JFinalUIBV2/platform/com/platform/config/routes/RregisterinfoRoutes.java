package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.rregisterinfo.mvc.rregisterinfo.RregisterinfoController;

/**
 * Created by hyw on 2015/10/4.
 */
public class RregisterinfoRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/rregisterinfo/rregisterinfo", RregisterinfoController.class);
    }
}
