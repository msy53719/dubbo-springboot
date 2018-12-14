package com.project.framework.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;

@SpringBootApplication
@EnableDubboConfig
@ComponentScan(value= "com.project.framework")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);

	}

}
