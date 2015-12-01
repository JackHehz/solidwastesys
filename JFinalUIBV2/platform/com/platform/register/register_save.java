package com.platform.register;

import com.jfinal.aop.Before;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.user.User;
import com.platform.mvc.user.UserInfo;
import com.platform.mvc.user.UserService;
import com.platform.mvc.user.UserValidator;

/**
 * Created by hyw on 2015/10/18.
 */
public class register_save  extends BaseController {
    /**
     * 保存新增用户
     */
    @Before(UserValidator.class)
    public void save() {
        String password = getPara("password");
        User user = getModel(User.class);
        UserInfo userInfo = getModel(UserInfo.class);
        UserService.service.save(user, password, userInfo);
        render("/jf/platform/login");
    }
}
