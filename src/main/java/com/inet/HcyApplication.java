package com.inet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HCY
 */
@SpringBootApplication
@MapperScan("com.inet.codebase.mapper")
public class HcyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcyApplication.class, args);
    }

}
