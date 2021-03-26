package com.example.productserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
*@description: 配置控制器
*@author: wangdh
*@date: 2021/3/25 14:35
*/

@RefreshScope
@RestController
public class ConfigController {

    /**
     * 数据源url
     */
    @Value("${spring.datasource.url}")
    private String url;

    /**
     * 数据源用户名
     */
    @Value("${spring.datasource.username}")
    private String username;

    /**
     * 数据源密码
     */
    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @GetMapping("/getDatasource")
    public Map<String,Object> getDatasource() {
        Map<String,Object> map = new HashMap<>(8);
        map.put("url",url);
        map.put("username",username);
        map.put("password",password);
        map.put("driverClassName",driverClassName);
        return map;
    }

    @PostMapping("/setPassword1")
    public void setPassword1(String password){
        this.setPassword(password);
    }

}
