package spring.cloud.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-19 17:53
 */
@FeignClient(name= "spring-cloud-producer")//name:远程服务名，即spring.application.name配置的名称
public interface IIndexService {

    @RequestMapping(value = "sayHi")//此类中的方法和远程服务中contoller中的方法名和参数需保持一致
    public String sayHi(@RequestParam(value = "name") String name);

}
