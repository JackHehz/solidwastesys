package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.monthreport.mvc.wastemonthreport.WastemonthreportController;

/**
 * Created by hyw on 2015/10/14.
 */
public class WastemonthreportRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/monthreport/wastemonthreport", WastemonthreportController.class);
    }
}
