package org.bank;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit overriden by AxisBank");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	}

}
