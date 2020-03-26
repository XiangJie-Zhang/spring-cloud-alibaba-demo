package top.awslzhang.rocketmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import top.awslzhang.rocketmq.consumer.channel.MySink;

@SpringBootApplication
@EnableBinding({MySink.class})
public class SpringCloudAlibabaRocketmqConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaRocketmqConsumerApplication.class, args);
    }
}
