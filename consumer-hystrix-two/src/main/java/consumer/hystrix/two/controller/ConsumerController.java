package consumer.hystrix.two.controller;

import consumer.hystrix.two.remote.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-19 17:54
 */
@RestController
public class ConsumerController {

    @Autowired
    IIndexService indexService;

    @RequestMapping(value = "sayHello/{name}")
    public String index(@PathVariable("name") String name) {
        return indexService.sayHello(name);
    }


}
