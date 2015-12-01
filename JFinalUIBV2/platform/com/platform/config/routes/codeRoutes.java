package com.platform.config.routes;

import com.commonsearch.mvc.rwastecode.Rwastecode;
import com.commonsearch.mvc.rwastecode.RwastecodeController;
import com.enterprises.mvc.rwaste.RwasteController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/23.
 */
public class codeRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/commonsearch/rwastecode", RwastecodeController.class);
    }
}
