package com.yanik.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yanik.interfaces.Car;

@Component("audi")
public class Audi implements Car {
	
	@Autowired   // autowire automatically creates object of the engine class and type can be used easily (Spring way)
	Engine engine;

	@Override
	public String specs() { 
		String specs = "Sedan from Audi and engine type is "+engine.type;
		return specs;
	}

}
