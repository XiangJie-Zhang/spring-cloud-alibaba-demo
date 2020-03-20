package top.awslzhang.provider.control;

import org.springframework.beans.factory.annotation.Value;
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
}
