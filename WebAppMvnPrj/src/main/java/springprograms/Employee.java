package springprograms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	String empNo;
	String empName;
	@Autowired
	@Qualifier(value="address") //value should be id of Address bean 
	Address address;
	
	public Employee(String empNo, String empName, Address address) {
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
	}
	
	public String toString(){
		return "EmpNo: "+empNo+"\nEmpName: "+empName+"\n"+address;
	}
}
