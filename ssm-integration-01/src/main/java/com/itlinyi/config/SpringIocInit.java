package com.itlinyi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author 林一
 * @version 1.0
 */
@Configuration
public class SpringIocInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //root IOC容器的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DataSourceJavaConfig.class, MapperJavaConfigNew.class, ServiceJavaConfig.class};
    }

    //web IOC容器的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcJavaConfig.class,};
    }

    //dispatcherService的拦截路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/"};
    }
}
