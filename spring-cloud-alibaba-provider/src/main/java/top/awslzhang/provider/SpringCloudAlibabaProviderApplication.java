package top.awslzhang.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaProviderApplication.class, args);
    }
}
