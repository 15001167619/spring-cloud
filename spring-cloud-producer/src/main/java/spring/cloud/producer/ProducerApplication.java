package spring.cloud.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-19 17:38
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient//开启服务注册的功能
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class,args);
        log.info("Application  Spring Cloud Producer start-up is success!");
    }

}
