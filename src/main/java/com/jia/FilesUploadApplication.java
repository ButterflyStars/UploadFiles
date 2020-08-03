package com.jia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jia.mapper")
public class FilesUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilesUploadApplication.class, args);
    }

}
