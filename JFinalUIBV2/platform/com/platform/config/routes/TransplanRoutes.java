package com.platform.config.routes;
import com.jfinal.config.Routes;
import com.plan.mvc.transplan.TransplanController;

/**
 * Created by Administrator on 2015/11/23.
 */
public class TransplanRoutes extends Routes{
    public void config() {
        add("/jf/plan/transplan", TransplanController.class);

    }
}
