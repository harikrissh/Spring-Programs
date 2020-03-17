package springprograms;

import java.util.Iterator;
import java.util.Set;

public class VenCus {
	int vId;
	String vName;
	Set<String> customers;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public Set<String> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<String> customers) {
		this.customers = customers;
	}
	
	public void display(){
		System.out.println("Vendor Id: "+vId);
		System.out.println("Vendor Name: "+vName);
		Iterator<String> i=customers.iterator();
		System.out.println("Customers:");
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
