package spring.cloud.consumer.hystrix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-20 11:51
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerHystrixAppcation {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixAppcation.class, args);
        log.info("Application  Spring Cloud Consumer CircuitBreaker start-up is success!");
    }

}
