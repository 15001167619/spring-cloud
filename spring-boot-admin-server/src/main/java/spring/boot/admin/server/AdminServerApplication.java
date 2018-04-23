package spring.boot.admin.server;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-23 14:14
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class AdminServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }

}
