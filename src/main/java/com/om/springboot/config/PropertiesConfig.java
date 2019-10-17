package com.om.springboot.config;

import com.om.springboot.util.ConfigurationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.util.Properties;

@Component
@ConfigurationProperties
@PropertySource("classpath:custom.properties")
public class PropertiesConfig {
    @Autowired
    private Environment env;

    public String getConfigValue(String configKey) {
        System.out.println("env ="+env);
        //System.out.println("configKey summa "+env.getProperty(configKey));
        System.out.println("testuser.duplicate ==> "+ConfigurationUtil.ConfigurationUtil().getProperty(""));
        return "User with email - {0} already exists.";
        //return env.getProperty(configKey);
    }
}
