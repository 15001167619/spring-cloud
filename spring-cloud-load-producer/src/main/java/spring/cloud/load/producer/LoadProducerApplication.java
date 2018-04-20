package spring.cloud.load.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-20 11:19
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class LoadProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadProducerApplication.class,args);
        log.info("Application  Spring Cloud Producer start-up is success!");
    }

}
