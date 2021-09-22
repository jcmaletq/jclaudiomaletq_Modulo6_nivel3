package com.jobs.application;

import com.jobs.domain.IPaymentRate;
import com.jobs.domain.IIRPFRate;

public class PaymentFactory {

//  calculo según puesto, dejo empleado igualado a Senior	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
/*	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}
*/	
	public static IPaymentRate createPaymentRateJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}	
	public static IPaymentRate createPaymentRateMidi(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.90;
			}
		};
	}
	public static IPaymentRate createPaymentRateSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.95;
			}
		};
	}
// calculo irpf
	public static IIRPFRate createIrpfRateBoss(){
		return new IIRPFRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(1-0.32);
			}
		};
	}
	
	public static IIRPFRate createIrpfRateManager(){
		return new IIRPFRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(1-0.26);
			}
		};
	}
/*	
	public static IIRPFRate createIrpfRateEmployee(){
		return new IIRPFRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(1-0.24);
			}
		};
	}
	*/
	public static IIRPFRate createIrpfRateJunior(){
		return new IIRPFRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(1-0.02);
			}
		};
	}	
	public static IIRPFRate createIrpfRateMidi(){
		return new IIRPFRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(1-0.15);
			}
		};
	}
	public static IIRPFRate createIrpfRateSenior(){
		return new IIRPFRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(1-0.24);
			}
		};
	}
}

