package com.jobs.domain;


public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected double netsalaryPerMonth;
	protected double salaryPerYear;
	protected double netsalaryPerYear;
	protected double bonusPaid;
	protected IPaymentRate paymentRate;	
	protected IIRPFRate IIrpfRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, IIRPFRate IIrpfRate) throws Exception {
		super(name, address, phone);
		double vnetsalaryPerMonth;
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
		if(IIrpfRate==null) throw new Exception();				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		vnetsalaryPerMonth = paymentRate.pay(salaryPerMonth);
		this.salaryPerYear = vnetsalaryPerMonth*12;
		this.netsalaryPerMonth = IIrpfRate.pay(vnetsalaryPerMonth);
		this.netsalaryPerYear = this.netsalaryPerMonth*12;
		this.bonusPaid = 0;
	}
	public Boolean salaryValidation (double min, double max) {
	double salarybyyear;
	boolean interm;
	salarybyyear= paymentRate.pay(salaryPerMonth)*12;
	if(salarybyyear > min && salarybyyear < max) {
		interm = true;
	  } else {
		System.out.println("salario informado :"+salaryPerMonth+" calculado % mensual "+paymentRate.pay(salaryPerMonth)+" total anual "+salarybyyear );  
		interm = false;
	  }
		return interm	;
	}
	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	@Override
	public void bonus() {
		bonusPaid=salaryPerYear*0.1;
	}

	@Override
	public String toString() {
//		return "Employee [salaryPerMonth=" + salaryPerMonth + ", paymentRate=" + paymentRate + ", id=" + id + ", name="
//				+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
		return this.getClass().toString().replace("class com.jobs.domain.","") +
				" [id= " + id +
				", name= "+ name +
				", address= " + address +
				", phone= " + phone +
				", salaryPerMonth= " + String.format("%.2f",salaryPerMonth) +  
				" \n" +"                      "+
				", netsalaryPerMonth= " + String.format("%.2f",netsalaryPerMonth) + 
				", salaryPerYear= " + String.format("%.2f",salaryPerYear) +
				", netsalaryPerYear= " + String.format("%.2f",netsalaryPerYear) + 				
				", totalPaid= " + String.format("%.2f",totalPaid)+
				" \n" +"                      "+
				", bonusPaid= " + String.format("%.2f",bonusPaid) + "]"+
			    " \n";
    }	
}
