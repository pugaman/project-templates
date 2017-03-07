package com.template.configuration;

import com.template.property.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by pgolovenkov on 06.03.2017.
 */
@Configuration
public class DataSourceConfiguration {

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Bean
    DataSource dataSource() {
        org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();

        dataSource.setUrl(this.dataSourceProperties.getUrl());
        dataSource.setUsername(this.dataSourceProperties.getUsername());
        dataSource.setPassword(this.dataSourceProperties.getPassword());
        dataSource.setDriverClassName(this.dataSourceProperties.getDriverClassName());

        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("Select 1");

        return dataSource;
    }


}
