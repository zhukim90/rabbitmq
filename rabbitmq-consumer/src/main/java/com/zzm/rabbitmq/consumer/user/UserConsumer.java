package com.zzm.rabbitmq.consumer.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserConsumer
 * @Description: 用户注册消息消费者
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:36
 * @Version: 1.0
 */
@Component
public class UserConsumer {

    /**
     * logback
     */
    private Logger logger = LoggerFactory.getLogger(UserConsumer.class);

    @RabbitListener(queues = "user.register.queue")
    @RabbitHandler
    public void execute(String userId)
    {

        //这里写业务逻辑代码
        logger.info("用户注册消费者【节点1】获取消息，用户编号：{}",userId);
    }
}
