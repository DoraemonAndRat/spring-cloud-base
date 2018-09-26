package com.peng.main.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by fp295 on 2018/4/9.
 */
@EnableResourceServer
@SpringCloudApplication
public class MainDataApplication2 {
    public static void main (String[] args){
        SpringApplication.run(MainDataApplication2.class, args);
    }
}
