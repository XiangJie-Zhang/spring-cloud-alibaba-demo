package top.aswlzhang.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 开启第二种调用方式
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudAlibabaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaConsumerApplication.class, args);
    }
}
