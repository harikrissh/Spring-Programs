package springprograms;

import java.util.List;

public class VenCus2 {
	String vName;
	List<String> cus;
	public VenCus2(String vName, List<String> cus) {
		this.vName = vName;
		this.cus = cus;
	}
	
	public void display(){
		System.out.println("Vendor: "+vName);
		System.out.println("Customers");
		for(String s: cus){
			System.out.println(s);
		}
	}
}
