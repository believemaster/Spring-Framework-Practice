package com.yanik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yanik.cars.Audi;
import com.yanik.cars.Celerio;
import com.yanik.interfaces.Car;


public class App {

	public static void main(String[] args) {
		Car celerio = new Celerio();
		Audi audi = new Audi();
	
		/*
		 * System.out.println(celerio.specs());
		 *  System.out.println(audi.specs());
		 */
		
		/*
		 * Car myCar = new Celerio(); 
		 * System.out.println(myCar.specs());
		 */
		
		//		Dependency injection below
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("audi" , Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
