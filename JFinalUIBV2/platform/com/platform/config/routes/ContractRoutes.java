package com.platform.config.routes;

import com.contract.mvc.contract.ContractController;
import com.jfinal.config.Routes;

/**
 * Created by hyw on 2015/10/22.
 */
public class ContractRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/contract/contract", ContractController.class);
    }
}
