package com.ccnu.mapboxdemo2019;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  //数据库自动生成时间开启注解
@SpringBootApplication
public class Mapboxdemo2019Application {

    public static void main(String[] args) {
        SpringApplication.run(Mapboxdemo2019Application.class, args);
    }

}
