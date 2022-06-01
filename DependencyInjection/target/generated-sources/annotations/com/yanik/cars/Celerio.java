package com.yanik.cars;

import org.springframework.stereotype.Component;

import com.yanik.interfaces.Car;

@Component("celerio")
public class Celerio implements Car {

	@Override
	public String specs() { 
		return "Hatchback from Suzuki";
	}

}
