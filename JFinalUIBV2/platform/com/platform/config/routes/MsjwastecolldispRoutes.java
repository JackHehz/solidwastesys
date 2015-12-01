package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.msjwastecolldisp.mvc.msjwastecolldisp.MsjwastecolldispController;


/**
 * Created by hyw on 2015/10/4.
 */
public class MsjwastecolldispRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/msjwastecolldisp/msjwastecolldisp", MsjwastecolldispController.class);
    }
}
