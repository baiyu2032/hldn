package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(value = "cn.dao")
public class UcouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcouponApplication.class, args);
    }
}
