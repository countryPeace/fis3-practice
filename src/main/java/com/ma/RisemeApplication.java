package com.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.velocity.VelocityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

@SpringBootApplication
public class RisemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RisemeApplication.class, args);
	}

	@Bean(name = "velocityViewResolver")
	public VelocityLayoutViewResolver velocityViewResolver(VelocityProperties properties) {
		VelocityLayoutViewResolver resolver = new VelocityLayoutViewResolver();
		properties.applyToViewResolver(resolver);
		resolver.setLayoutUrl("layout/layout.vm");
		return resolver;
	}

}
