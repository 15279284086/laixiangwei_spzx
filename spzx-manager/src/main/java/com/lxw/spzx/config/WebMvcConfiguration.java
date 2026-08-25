package com.lxw.spzx.config;

import com.lxw.spzx.interceptor.LoginAuthInterceptor;
import com.lxw.spzx.manager.properties.UserAuthProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebMvcConfiguration  implements WebMvcConfigurer {
    @Autowired
    private UserAuthProperties userAuthProperties ;        // 注入实体类对象

    @Autowired
    private LoginAuthInterceptor loginAuthInterceptor ;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // 添加路径规则
                .allowCredentials(true)               // 是否允许在跨域的情况下传递Cookie
                .allowedOriginPatterns("*")           // 允许请求来源的域规则
                .allowedMethods("*")
                .allowedHeaders("*") ;                // 允许所有的请求头
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println(userAuthProperties.getNoAuthUrls());
        registry.addInterceptor(loginAuthInterceptor)
                .excludePathPatterns(userAuthProperties.getNoAuthUrls())
                .addPathPatterns("/**");
    }

}
