package com.template.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by pgolovenkov on 06.03.2017.
 */
@Component
@ConfigurationProperties(prefix = "jpa")
public class JpaConfigProperties {

    private static final String DEFAULT_DEFAULT_SCHEMA = "";
    private static final String DEFAULT_DDL_AUTO = "";
    private static final String DEFAULT_NAMING_STRATEGY = "";
    private static final String DEFAULT_DIALECT = "";

    private String defaultSchema;
    private String ddlAuto;
    private String namingStrategy;
    private String dialect;

    @PostConstruct
    private void init(){
        if(getDefaultSchema() == null){
            setDefaultSchema(DEFAULT_DEFAULT_SCHEMA);
        }
        if(getDdlAuto() == null){
            setDdlAuto(DEFAULT_DDL_AUTO);
        }
        if(getNamingStrategy() == null){
            setNamingStrategy(DEFAULT_NAMING_STRATEGY);
        }
        if(getDialect() == null){
            setDialect(DEFAULT_DIALECT);
        }
    }

    public String getDefaultSchema() {
        return defaultSchema;
    }

    public void setDefaultSchema(String defaultSchema) {
        this.defaultSchema = defaultSchema;
    }

    public String getDdlAuto() {
        return ddlAuto;
    }

    public void setDdlAuto(String ddlAuto) {
        this.ddlAuto = ddlAuto;
    }

    public String getNamingStrategy() {
        return namingStrategy;
    }

    public void setNamingStrategy(String namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }
}
