package com.api.service;

/**
 * 此为模拟的短信接口，api工程只负责提供接口
 * 具体实现交给provider来处理
 * 需要provider来引用该接口
 * Created by Ablert
 * on 2018/5/30.
 * @author Ablert
 */
public interface MsgService {

    /**
     * 发送短信，参数为发送对象
     * @param destination
     * @return
     */
    String sendMessage(String destination);
}
