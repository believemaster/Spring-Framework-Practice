package com.yanik.cars;

import org.springframework.stereotype.Component;
import com.yanik.interfaces.Car;

@Component("audi")
public class Audi implements Car {

	@Override
	public String specs() { 
		return "Sedan from Audi";
	}

}
