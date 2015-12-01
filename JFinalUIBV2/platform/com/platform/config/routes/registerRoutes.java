package com.platform.config.routes;

import com.enterprises.mvc.registerapproval.RegisterapprovalController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/22.
 */
public class registerRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/Enterprise/registerapproval", RegisterapprovalController.class);
    }
}
