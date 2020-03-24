package top.awslzhang.provider.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {

    @Value("${server.port}")
    private String port;

    @GetMapping("provider/sout/{content}")
    public String sout(@PathVariable(value = "content") String sout){
        return String.format("hello, %s ,this is Provider! by port %s",sout ,port);
    }

    // 注入配置文件上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    // 从上下文中读取配置
    @GetMapping(value = "/hi")
    public String sayHi() {
        // 直接读取的话，读取到的不是最新的值。只能通过上下文来读取
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
