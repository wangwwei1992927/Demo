package com.example.demo.config;

import com.example.demo.interceptor.AuthInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 描述
 * @author: Wangwei
 * @date: 2020/6/5 11:47
 */
@Component
public class WebConfig implements WebMvcConfigurer {

   /* @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor());
        super.addInterceptors(registry);
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor());
    }
}
