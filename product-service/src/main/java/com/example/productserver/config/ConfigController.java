package com.example.productserver.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
*@description: 配置控制器
*@author: wangdh
*@date: 2021/3/25 14:35
*/
@RestController
@RefreshScope
@RequestMapping("config")
public class ConfigController {

    /**
     * 数据源url
     */
    @Value("${datasource.url}")
    private String url;

    /**
     * 数据源用户名
     */
    @Value("${datasource.username}")
    private String username;

    /**
     * 数据源密码
     */
    @Value("${datasource.password}")
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @RequestMapping(value = "/getDatasource", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getDatasource() {
        Map<String,Object> map = new HashMap<>(8);
        map.put("url",url);
        map.put("username",username);
        map.put("password",password);
        return map;
    }
}
