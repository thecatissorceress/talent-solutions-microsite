package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		
		return "Sedan from toyota";
	}

}
