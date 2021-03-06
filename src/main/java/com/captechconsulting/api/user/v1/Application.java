package com.captechconsulting.api.user.v1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		new Application() //
				.configure(new SpringApplicationBuilder(Application.class)) //
				.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
