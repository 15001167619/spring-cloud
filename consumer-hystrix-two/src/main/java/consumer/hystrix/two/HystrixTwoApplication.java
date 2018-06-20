package consumer.hystrix.two;

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
 * @date 2018-04-20 15:30
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class HystrixTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTwoApplication.class, args);
        log.info("Application  Spring Cloud HystrixTwo CircuitBreaker start-up is success!");
    }

}
