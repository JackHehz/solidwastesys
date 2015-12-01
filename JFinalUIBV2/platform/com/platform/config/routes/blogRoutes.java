package com.platform.config.routes;
import com.jfinal.config.Routes;
import com.Blog.mvc.blog_test.blog_testController;

/**
 * Created by hyw on 2015/10/2.
 */
public class blogRoutes extends Routes {
    @Override
    public void config() {
        add("/jf/enterprises/blog_test", blog_testController.class);
    }

}
