package top.aswlzhang.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.aswlzhang.consumer.service.fallback.NacosServiceFallback;

// 声明调用的服务提供者名字
@FeignClient(name = "nacos-provider", fallback = NacosServiceFallback.class)
public interface NacosService {

    /**
     * 把服务调用者的方法拿过来调用
     * @param sout 输出
     * @return 结果
     */
    @GetMapping("provider/sout/{content}")
    String sout(@PathVariable(value = "content") String sout);
}
