package edu.sdjzu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.sdjzu.mapper")
public class DatabaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }
}
