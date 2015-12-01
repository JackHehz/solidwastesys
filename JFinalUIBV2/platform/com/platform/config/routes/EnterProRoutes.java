package com.platform.config.routes;

import com.enterprises.mvc.enterinfoprocess.EnterinfoProcessController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/4.
 */
public class EnterProRoutes  extends Routes{
    @Override
    public void config() {
        add("/jf/Enterprise/enterinfoProcess", EnterinfoProcessController.class);
    }
}
