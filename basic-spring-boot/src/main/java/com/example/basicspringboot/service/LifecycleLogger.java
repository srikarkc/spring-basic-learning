package com.example.basicspringboot.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifecycleLogger implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean initialized: LifecycleLogger");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed: LifecycleLogger");
    }
}
