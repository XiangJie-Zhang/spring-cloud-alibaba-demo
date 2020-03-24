package top.aswlzhang.consumer.service.fallback;

import org.springframework.stereotype.Component;
import top.aswlzhang.consumer.service.NacosService;

@Component
public class NacosServiceFallback implements NacosService {

    @Override
    public String sout(String sout) {
        return "你好，熔断服务！";
    }
}
