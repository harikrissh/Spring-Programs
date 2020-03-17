package springprograms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bcua")
public class BeanClassUsingAnnotations {
	@Value("hk")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
