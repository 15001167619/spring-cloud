package spring.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.consumer.remote.IIndexService;

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

    @RequestMapping(value = "sayHi/{name}")
    public String index(@PathVariable("name") String name) {//此类中的方法和远程服务spring-cloud-producer中controller中的方法名和参数需保持一致。
        return indexService.sayHi(name);
    }


}
