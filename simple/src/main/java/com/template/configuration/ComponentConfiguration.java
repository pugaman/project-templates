package com.template.configuration;

import com.template.component.ComponentImpl;
import com.template.component.IComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pgolovenkov on 10.03.2017.
 */
@Configuration
public class ComponentConfiguration {

    @Bean
    public IComponent component(){
        return new ComponentImpl();
    }

}
