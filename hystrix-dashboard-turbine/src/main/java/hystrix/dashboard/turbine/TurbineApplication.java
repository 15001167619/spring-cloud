package hystrix.dashboard.turbine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-20 15:34
 */
@Slf4j
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class,args);
        log.info("Application  Spring Cloud Turbine start-up is success!");
    }

}
