package config.load.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-24 11:15
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigLoadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigLoadServerApplication.class,args);
    }

}
