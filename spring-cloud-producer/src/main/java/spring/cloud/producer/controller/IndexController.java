package spring.cloud.producer.controller;

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

    @RequestMapping(value = "sayHi")
    public String sayHi(@RequestParam String name) {
        return "Hi!!! "+name+"，this is first message";
    }

}