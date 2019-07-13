package com.example.postgrecallapi.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url(String.format("jdbc:postgresql://%s:%s/%s",
                        "localhost",
                        5432,
                        "subirdb"))
                .username("postgres")
                .password("pass")
                .build();
    }
}
