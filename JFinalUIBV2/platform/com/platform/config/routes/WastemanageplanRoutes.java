package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.manageplan.mvc.wastemanageplan.WastemanageplanController;

/**
 * Created by hyw on 2015/10/4.
 */
public class WastemanageplanRoutes extends Routes {

    @Override
    public void config() {
        add("/jf/manageplan/wastemanageplan",WastemanageplanController.class);
    }

}
