package com.consumer.service.impl;

import com.consumer.service.HelloService;

/**
 * Created by Ablert
 * on 2018/5/30.
 * @author Ablert
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
