package springprograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBean {
	
	@Bean(name="car2")
	public Car callCar(){
		return new Car();
	}
}
