package top.awslzhang.rocketmq.provider.test;

import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import top.awslzhang.rocketmq.provider.channel.MySource;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试发送消息
 *
 * 实现CommandLineRunner接口，即在spring boot项目启动时执行此方法
 */
@Component
public class TestMessageSend implements CommandLineRunner {

    @Autowired
    private MySource channel;

    @Override
    public void run(String... args) throws Exception {
        Map<String, Object> headers = new HashMap<>();
        headers.put(MessageConst.PROPERTY_TAGS, "tagStr");
        Message message = MessageBuilder.createMessage("aaa", new MessageHeaders(headers));
        channel.output1().send(message);
        channel.output2().send(MessageBuilder.withPayload("ddd").build());
    }
}
