package com.jobs.domain;

import com.jobs.application.PaymentFactory;

public class Midi extends Employee{
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	public Midi (String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone,salaryPerMonth,paymentRate, PaymentFactory.createIrpfRateMidi());
		
	}
}
