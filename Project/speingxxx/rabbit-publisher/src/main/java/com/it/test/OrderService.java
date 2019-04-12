package com.it.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.it.utils.MessageSendUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 如果下订单成功 ，使用mq 异步推动消息 减库存
 */
@Component
public class OrderService {

    private static final String EXCHANGE = "OrderExchange";
    private static final String ROUING_KEY = "OrderKey";

    @Autowired
    private MessageSendUtils messageSendUtils;

    /**
     * 下订单减库存
     * @return
     */
    public void order() {
        Order order = new Order();
        order.setOrderId("11111");
        order.setGoodsCount(2);
        System.out.println(">>>>>开始发送消息！");
        messageSendUtils.sendMessage(EXCHANGE,ROUING_KEY,JSON.toJSONString(order));
        System.out.println(">>>>>发送消息结束！");
    }
}
