package com.yanik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration ;

import com.yanik.cars.Audi;
import com.yanik.cars.Celerio;
import com.yanik.specs.V6;
import com.yanik.specs.V8;

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
	
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8() {
		return new V8();
	}
	
}
