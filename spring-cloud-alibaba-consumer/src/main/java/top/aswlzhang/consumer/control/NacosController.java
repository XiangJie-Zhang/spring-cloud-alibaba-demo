package top.aswlzhang.consumer.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.aswlzhang.consumer.service.NacosService;

@RequestMapping("consumer")
@RestController
public class NacosController {
    private RestTemplate restTemplate;
    @Autowired
    private NacosService nacosService;

    /**
     * 第二种调用方式，Feign。推荐
     */
    @GetMapping("test1/{one}")
    public String test1(@PathVariable(value = "one") String one){
        return nacosService.sout(one);
    }

    /**
     * 第二种调用方式，Ribbon。
     */
    @GetMapping("test2/{one}")
    public String test2(@PathVariable(value = "one") String one){
        return restTemplate.getForObject("http://nacos-provider/provider/sout/" + one, String.class);

    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}
