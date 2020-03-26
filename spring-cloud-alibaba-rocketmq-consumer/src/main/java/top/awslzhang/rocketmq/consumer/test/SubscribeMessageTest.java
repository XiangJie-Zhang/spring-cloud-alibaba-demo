package top.awslzhang.rocketmq.consumer.test;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class SubscribeMessageTest {

    @StreamListener("input1")
    public void receiveInput1(String message) {
        System.out.println("Receive input: " + message);
    }

    @StreamListener("input2")
    public void receiveInput2(String message) {
        System.out.println("Receive input: " + message);
    }
}
