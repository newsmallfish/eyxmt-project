package com.eyxmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class EyxmtProjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EyxmtProjectsApplication.class, args);
    }

}
