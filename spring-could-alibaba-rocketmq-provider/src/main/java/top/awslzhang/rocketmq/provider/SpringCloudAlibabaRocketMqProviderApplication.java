package top.awslzhang.rocketmq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import top.awslzhang.rocketmq.provider.channel.MySource;
// 注解Source
//public interface Source {
//    String OUTPUT = "output";
//
//    @Output("output")
//    MessageChannel output();
//}

/**
 * 看他的MessageChannel类，证明他是生产者使用的注解，它从配置文件中查找binging为output里面的topic
 */

// Sink
//public interface Sink {
//    String INPUT = "input";
//
//    @Input("input")
//    SubscribableChannel input();
//}

/**
 * SubscribableChannel，证明他是消费者使用的注解，它从配置文件中查找binging为input里面的topic
  */

@SpringBootApplication
// 配置 Input 和 Output 的 Binding 信息并配合 `@EnableBinding` 注解使其生效
@EnableBinding({MySource.class})
public class SpringCloudAlibabaRocketMqProviderApplication{
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaRocketMqProviderApplication.class, args);
    }

}





