package com.itlinyi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author 林一
 * @version 1.0
 * <p>
 * 控制层的配置类（controller，springmvc）
 * 1.controller
 * 2.handlerMapping handlerAdapter
 * 3.全局异常处理
 * 4.静态资源处理
 * 5.jsp视图解析器前后缀
 * 6.json转化器
 * 7.拦截器
 */
@EnableWebMvc // 作用 * 6.json转化器  * 2.handlerMapping handlerAdapter
@Configuration
@ComponentScan({"com.itlinyi.controller", "com.itlinyi.exceptionhandler"})
public class WebMvcJavaConfig implements WebMvcConfigurer {
    /**
     * 重写configureDefaultServletHandling方法,开启静态资源处理
     *
     * @param configurer 配置默认 servlet 处理器的配置器
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views", ".jsp");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor().addPathPatterns().excludePathPatterns();
    }

}
