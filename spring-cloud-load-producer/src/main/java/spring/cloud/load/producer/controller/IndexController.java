package spring.cloud.load.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-19 17:41
 */
@RestController
public class IndexController {

    @RequestMapping(value = "sayHi")//消费者spring-cloud-consumer 调用名称一致
    public String index(@RequestParam String name) {
        return "Hi!!! "+name+"，接收第二条消息";
    }

}
