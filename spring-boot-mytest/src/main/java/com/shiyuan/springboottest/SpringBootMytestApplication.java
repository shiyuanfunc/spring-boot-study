package com.shiyuan.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyselfImportRegiresty.class)
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
