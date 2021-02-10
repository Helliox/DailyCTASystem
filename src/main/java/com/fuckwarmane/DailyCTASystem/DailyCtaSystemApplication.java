package com.fuckwarmane.DailyCTASystem;

import com.fuckwarmane.DailyCTASystem.Services.DataStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DailyCtaSystemApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder appliaction)
	{
		return appliaction.sources(DailyCtaSystemApplication.class);
	}

	public static void main(String[] args) {
		DataStorage.initialize();
		SpringApplication.run(DailyCtaSystemApplication.class, args);
	}

}
