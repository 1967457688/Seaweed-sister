package com.luolight.SeaweedS;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication//springboot启动类
@MapperScan("com.luolight.SeaweedS")//扫描mapper
@ServletComponentScan
public class SeaweedSisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeaweedSisterApplication.class, args);
	}
}
