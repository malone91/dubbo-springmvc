package com.consumer.service.impl;

import com.api.service.MsgService;

/**
 * api项目接口的实现类
 * Created by Ablert
 * on 2018/5/30.
 * @author Ablert
 */
public class MsgServiceImpl implements MsgService {

    @Override
    public String sendMessage(String destination) {
        return "send msg to " + destination;
    }
}
