package com.om.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = { "com.om.*" })
@PropertySource("classpath:application.properties")
public class PropertiesConfig {
    @Autowired
    private Environment env;

    public String getConfigValue(String configKey) {
        System.out.println("env ="+env);
        System.out.println("configKey summa "+env.getProperty(configKey));

        return env.getProperty(configKey);
    }
}
