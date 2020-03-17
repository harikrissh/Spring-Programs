package demo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	
	@Min(value=4, message="minimum 4 digits")
	int eno;
	
	@Size(min=2, max=20)
	String name;
	
	@Min(value=25000, message="salary must be minimum of 25000")
	@Max(value=55000, message="salary must be maximum of 55000")
	String salary;
	
	@Pattern(regexp="^[0-9]{6}", message="pincode must be 6 digits")
	String pincode;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
