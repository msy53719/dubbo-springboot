package com.project.framework.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class ApplicationsForXmlStart {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationsForXmlStart.class);

	}

}
