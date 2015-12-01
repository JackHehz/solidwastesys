package com.platform.config.routes;

import com.carinformation.mvc.carinformationsearch.CarinformationsearchController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/14.
 */
public class CarinformationsearchRoutes extends Routes{
    @Override
    public void config() {
        add("/jf/carinformation/carinformationsearch", CarinformationsearchController.class);
    }
}
