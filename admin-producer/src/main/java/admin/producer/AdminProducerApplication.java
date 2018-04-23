package admin.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-23 14:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AdminProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminProducerApplication.class, args);
    }

}
