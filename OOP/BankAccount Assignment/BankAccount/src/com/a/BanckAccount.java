package com.a;

import java.util.Random;

public class BanckAccount {
	private int account_number;
	private double checking_balance;
	private double saving_balance;
	private static int number_of_accounts=0;
	private static double total_ammount;

	public BanckAccount() {
	super();
	this.account_number = randomNumber();
	this.checking_balance = checking_balance;
	this.saving_balance = saving_balance;
	number_of_accounts++;
	
}
	public static int member() {
		return number_of_accounts;
	}
	
	public static double getTotalAmmount() {
		return total_ammount;
	}
	
	private int randomNumber() {
	    int m = (int) Math.pow(10, 9);
	    return m + new Random().nextInt(9 * m);
	}
	public int getNumber() {
		return account_number;
	}
	public double getCheckingbalance() {
		return checking_balance;
	}
	public double getSavingbalance() {
		return saving_balance;
	}
	
	public void deposit(double checking, double saving) {
		this.checking_balance +=checking;
		this.saving_balance +=saving;
		total_ammount+=checking+saving;
	}
	
	public void withdorw(double checking, double saving) {
		if(checking<=checking_balance &&saving<=saving_balance) {
		this.checking_balance -=checking;
		this.saving_balance-=saving;
		total_ammount-=(checking+saving);
		}
		
		else {
			System.out.println("insufficent mony in your account"); 
		}
	}
	public double totalCheckingSaving() {
		double total=this.checking_balance + this.saving_balance;
		return total;
		}

}
