package spring.cloud.single.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-19 9:33
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer//该注解表明应用为eureka服务，也可以联合多个服务作为集群，对外提供服务注册以及发现功能
public class SingleEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleEurekaApplication.class,args);
        log.info("Application  Spring Cloud Single Eureka start-up is success!");
    }

}
