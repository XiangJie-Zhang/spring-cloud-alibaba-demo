package top.awslzhang.rocketmq.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;



public interface MySink {

    @Input("input1")
    SubscribableChannel input1();

    @Input("input2")
    SubscribableChannel input2();


}
