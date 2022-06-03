package com.yanik.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.yanik.interfaces.Car;
import com.yanik.interfaces.Engine;

@Component("audi")
public class Audi implements Car {
	// autowire automatically creates object of the engine class and type can be used easily (Spring way)
	@Autowired(required = false)   // if object is not required it will not create object
	@Qualifier("V8Engine")			// removes the ambiguity with interface[which type to call]
	Engine engine;

	// @Autowired //if we use it here then it will give the updated value inside setter if not here then old value
//	public void setEngine(Engine engine) {
//		engine.type = "New V8 engine.";
//		this.engine = engine;
//	}

	@Override
	public String specs() { 
		String specs = "Sedan from Audi and engine type is "+engine.type();
		return specs;
	}

}
