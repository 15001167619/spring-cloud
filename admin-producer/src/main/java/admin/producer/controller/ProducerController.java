package admin.producer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-23 14:49
 */
@RestController
@Slf4j
public class ProducerController {

    @RequestMapping(value = "sayHi")
    public String sayHi(@RequestParam String name) {
        log.info("request one  name is "+name);
        return "Hi "+name+"，This is first message";
    }

}
