package com.platform.config.routes;

import com.enterprises.mvc.rwaste.RwasteController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/4.
 */
public class WasteRoutes extends Routes {

    @Override
    public void config() {
        add("/jf/Enterprise/rwaste", RwasteController.class);
    }

}
