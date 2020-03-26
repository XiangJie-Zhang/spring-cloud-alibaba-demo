package top.awslzhang.rocketmq.provider.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public interface MySource {
    @Output("output1")
    MessageChannel output1(); // 获取name为output的binding

    @Output("output2")
    MessageChannel output2(); // 获取name为output的binding
}
