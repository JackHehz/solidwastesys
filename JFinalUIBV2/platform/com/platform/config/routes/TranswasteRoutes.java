package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.transinfo.mvc.transwaste.TranswasteController;

/**
 * Created by hyw on 2015/10/26.
 */
public class TranswasteRoutes extends Routes {
    @Override
    public void config() {
       add(" /jf/transinfo/transwaste", TranswasteController.class);

    }
}
