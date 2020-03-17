package springprograms;

import java.util.List;

public class Training {
	int batchNo;
	String batchName;
	List<Technology> tech;
	public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public List<Technology> getTech() {
		return tech;
	}
	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
	public void display(){
		System.out.println("Batch No: "+batchNo);
		System.out.println("Batch Name: "+batchName);
		System.out.println("Technologies:");
		for(Technology t: tech){
			System.out.println(t);
		}
	}
}
