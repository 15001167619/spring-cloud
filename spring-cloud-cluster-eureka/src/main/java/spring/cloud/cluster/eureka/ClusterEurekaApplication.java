package spring.cloud.cluster.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-19 11:26
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class ClusterEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClusterEurekaApplication.class,args);
        log.info("Application  Spring Cloud Cluster Eureka start-up is success!");
    }

}
