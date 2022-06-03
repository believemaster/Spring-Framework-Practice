package com.yanik.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yanik.interfaces.Car;

@Component("audi")
public class Audi implements Car {
	// autowire automatically creates object of the engine class and type can be used easily (Spring way)
	@Autowired(required = false)   // if object is not required it will not create object
	Engine engine;

	// @Autowired //if we use it here then it will give the updated value inside setter if not here then old value
	public void setEngine(Engine engine) {
		engine.type = "New V8 engine.";
		this.engine = engine;
	}

	@Override
	public String specs() { 
		String specs = "Sedan from Audi and engine type is "+engine.type;
		return specs;
	}

}
