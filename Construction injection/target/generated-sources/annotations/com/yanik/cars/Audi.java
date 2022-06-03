package com.yanik.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.yanik.interfaces.Car;
import com.yanik.interfaces.Engine;

public class Audi implements Car {
	
	@Autowired
	@Qualifier("engineType")
	Engine engine;

	@Override
	public String specs() { 
		String specs = "Sedan from Audi and engine type is "+engine.type();
		return specs;
	}

}
