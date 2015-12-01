package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.servlet.mvc.jqueryajaxserver.JqueryAjaxServer;


/**
 * Created by hyw on 2015/11/7.
 */
public class ajaxroutes extends Routes {
    @Override
    public void config() {
        addClass("/jf/test/ajax", JqueryAjaxServer.class);
    }
}
