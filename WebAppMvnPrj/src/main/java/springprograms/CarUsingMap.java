package springprograms;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CarUsingMap {
	List<Integer> mileages;
	Map<String, String> cars;
	
	public List<Integer> getMileages() {
		return mileages;
	}
	public void setMileages(List<Integer> mileages) {
		this.mileages = mileages;
	}
	public Map<String, String> getCars() {
		return cars;
	}
	public void setCars(Map<String, String> cars) {
		this.cars = cars;
	}
	public void display(){
		Iterator<Entry<String, String>> itr=cars.entrySet().iterator();
		Iterator<Integer> list=mileages.iterator();
		while(itr.hasNext() && list.hasNext()){
			Map.Entry<String, String> en=itr.next();
			System.out.println(en.getKey()+" "+en.getValue()+" has a mileage of "+list.next()+" kmph");
		}
	}
}
