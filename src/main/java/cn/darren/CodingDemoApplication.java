package cn.darren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "cn.darren.mapper")
@SpringBootApplication
public class CodingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodingDemoApplication.class, args);
    }

}
