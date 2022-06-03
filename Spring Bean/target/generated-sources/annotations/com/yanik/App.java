package com.yanik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yanik.cars.Audi;
import com.yanik.cars.Celerio;
import com.yanik.interfaces.Car;


public class App {

	public static void main(String[] args) {
		//		Dependency injection below
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("audi" , Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
