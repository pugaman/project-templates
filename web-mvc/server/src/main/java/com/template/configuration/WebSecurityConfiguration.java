package com.template.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by pgolovenkov on 10.03.2017.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("admin").roles("ADMIN").build());
        manager.createUser(User.withUsername("user").password("user").roles("USER").build());
        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Http authorization configuration
        http.authorizeRequests()
                .antMatchers("/public/**").permitAll()
                .antMatchers("/api/rest/public/**").permitAll()
                .antMatchers("/api/rest/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin();

        //Logout configuration
        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/");

    }
}
