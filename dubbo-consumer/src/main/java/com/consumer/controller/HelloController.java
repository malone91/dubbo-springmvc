package com.consumer.controller;

import com.consumer.service.HelloService;
import com.api.service.MsgService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Ablert
 * on 2018/5/30.
 * @author Ablert
 */
@Controller
public class HelloController {

    @Resource
    private HelloService helloService;

    @Resource
    private MsgService msgService;

    /**
     * 原始的打招呼方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(String name) {
        return helloService.sayHello(name);
    }

    /**
     * 将接口封装在专门的项目中，实现发短信方法
     * @param destination
     * @return
     */
    @RequestMapping(value = "/sendMsg")
    @ResponseBody
    public String sendMsg(String destination) {
        return msgService.sendMessage(destination);
    }
}
