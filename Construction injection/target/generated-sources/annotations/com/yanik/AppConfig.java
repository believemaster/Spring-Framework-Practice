package com.yanik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration ;

import com.yanik.cars.Audi;
import com.yanik.cars.Celerio;
import com.yanik.specs.EngineType;

@Configuration
@ComponentScan("com.yanik")
public class AppConfig {
	
	@Bean("audi")
	public Audi audi() {
		return new Audi();
	}
	
	@Bean("celerio")
	public Celerio celerio() {
		return new Celerio();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("v-8 engine");
	}
	
}
