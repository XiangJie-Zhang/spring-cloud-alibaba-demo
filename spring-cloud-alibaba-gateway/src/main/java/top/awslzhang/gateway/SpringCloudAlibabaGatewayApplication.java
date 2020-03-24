package top.awslzhang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@FeignClient
public class SpringCloudAlibabaGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaGatewayApplication.class, args);
    }
}
