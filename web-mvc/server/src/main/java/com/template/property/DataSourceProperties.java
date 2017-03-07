package com.template.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by pgolovenkov on 06.03.2017.
 */
@Component
@ConfigurationProperties(prefix = "datasource")
public class DataSourceProperties {

    private static String DEFAULT_URL = "";
    private static String DEFAULT_USERNAME = "";
    private static String DEFAULT_PASSWORD = "";
    private static String DEFAULT_DRIVER_CLASS_NAME = "";

    private String url;
    private String username;
    private String password;
    private String driverClassName;

    @PostConstruct
    private void init(){
        if(getUrl() == null){
            setUrl(DEFAULT_URL);
        }
        if(getUsername() == null){
            setUsername(DEFAULT_USERNAME);
        }
        if(getPassword() == null){
            setPassword(DEFAULT_PASSWORD);
        }
        if(getDriverClassName() == null){
            setDriverClassName(DEFAULT_DRIVER_CLASS_NAME);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
