package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	private String description;
	private double gob_pay;

	public Volunteer(String name, String address, String phone, String description, double gob_pay) throws Exception {
		super(name, address, phone);
		this.description = description;
		this.gob_pay = gob_pay;
	}

	@Override
	public void pay() {
		//TODO
	}
	@Override
	public void bonus() {
		//TODO
	}
	public Boolean salaryValidation (double gob_pay, double max) {
		double salarybyyear;
		boolean interm;
		if(gob_pay  < max) {
			interm = true;
		  } else {
			System.out.println("error en ayuda informada supera la cantidad max de "+max );  
			interm = false;
		  }
			return interm	;
		}

	@Override
	public String toString() {
	return this.getClass().toString().replace("class com.jobs.domain.","") +
				" [id= " + id +
			", name= " + name + 
			", address= " + address +
			", phone= " + phone +
	        ", description= " + description + 
			", Gobernametal Paid= " + gob_pay + 
			"]"+ "\n";

	}
	
	

}
