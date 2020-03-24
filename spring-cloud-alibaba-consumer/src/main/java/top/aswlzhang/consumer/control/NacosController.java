package top.aswlzhang.consumer.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.aswlzhang.consumer.service.NacosService;

@RequestMapping("consumer")
@RestController
public class NacosController {

    @Autowired
    private NacosService nacosService;

    /**
     * 第二种调用方式，Feign。推荐
     */
    @GetMapping("test1/{one}")
    public String test1(@PathVariable(value = "one") String one){
        return nacosService.sout(one);
    }

}
