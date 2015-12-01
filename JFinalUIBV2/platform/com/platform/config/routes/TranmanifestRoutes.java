package com.platform.config.routes;

import com.jfinal.config.Routes;
import com.manifest.mvc.tranmanifest.TranmanifestController;

/**
 * Created by Administrator on 2015/11/21.
 */
public class TranmanifestRoutes extends Routes{
    @Override
    public void config() {
        add("/jf/manifest/tranmanifest", TranmanifestController.class);

    }
}
