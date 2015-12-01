package com.platform.config.routes;

import com.commonsearch.mvc.hangyeleibie.HangyeleibieController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/24.
 */
public class hangyeRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/commonsearch/hangyeleibie", HangyeleibieController.class);
    }
}
