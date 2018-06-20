package consumer.hystrix.one;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-20 15:28
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class HystrixOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixOneApplication.class, args);
        log.info("Application  Spring Cloud HystrixOne CircuitBreaker start-up is success!");
    }

}
