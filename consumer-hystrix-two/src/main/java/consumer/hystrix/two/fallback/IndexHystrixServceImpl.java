package consumer.hystrix.two.fallback;

import consumer.hystrix.two.remote.IIndexService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 武海升
 * @version 2.0
 * @description  Hystrix 回调类
 * @date 2018-04-20 13:25
 */
@Component
public class IndexHystrixServceImpl implements IIndexService {

    @Override
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hi!!! "+name+"，服务提供者异常Two...";
    }

}
