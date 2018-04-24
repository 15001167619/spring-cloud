package config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-04-24 11:21
 */
@RestController
@RefreshScope //可以刷新配置  Post请求 http://localhost:6082/refresh
public class ConfigController {

    @Value("${config.name}")
    private String configName;

    @RequestMapping(value = "config")
    public String getConfig() {
        return "项目部署环境："+this.configName;
    }

}
