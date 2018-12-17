//package com.project.framework.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.ConsumerConfig;
//import com.alibaba.dubbo.config.ProtocolConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import com.alibaba.dubbo.config.ServiceConfig;
//import com.project.framework.service.UserService;
//
//@Configuration
//public class DubboConfig {
//	@Bean
//	public ApplicationConfig applicationConfig() {
//		ApplicationConfig applicationConfig = new ApplicationConfig();
//		applicationConfig.setName("dubbo-server");
//		return applicationConfig;
//
//	}
//
//	@Bean
//	public RegistryConfig registryConfig() {
//		RegistryConfig registryConfig = new RegistryConfig();
//		registryConfig.setProtocol("zookeeper");
//		registryConfig.setAddress("127.0.0.1:2181");
//		//registryConfig.setClient("curator");
//		return registryConfig;
//	}
//
//	   @Bean    
//	    public ProtocolConfig protocolConfig(){
//	        ProtocolConfig protocolConfig = new ProtocolConfig();
//	        protocolConfig.setName("dubbo");
//	        protocolConfig.setPort(20880);
//	        return protocolConfig;
//	    }
//
//	   @Bean
//	    public ConsumerConfig consumerConfig() {
//	        ConsumerConfig consumerConfig = new ConsumerConfig();
//	        consumerConfig.setTimeout(3000);
//	        return consumerConfig;
//	    }
//	   
//	   @Bean
//	    public ServiceConfig<UserService> userServiceConfig(UserService userService){
//	        ServiceConfig<UserService> serviceConfig = new ServiceConfig<UserService>();
//	        serviceConfig.setInterface(UserService.class);
//	        serviceConfig.setRef(userService);
//	        serviceConfig.setVersion("1.0.0");
//	        return serviceConfig;
//	    }
//	
//}
