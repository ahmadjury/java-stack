package com.a;

public class Main {

	public static void main(String[] args) {
		BanckAccount user1 = new BanckAccount();
		BanckAccount user2 = new BanckAccount();
		BanckAccount user3 = new BanckAccount();
		System.out.println("________________________________________________________________");	
		System.out.println(BanckAccount.member());
		System.out.println("________________________________________________________________");
		System.out.println(user1.getTotalAmmount());
		System.out.println("________________________________________________________________");
		System.out.println(user1.getNumber());
		System.out.println(user2.getNumber());
		System.out.println(user3.getNumber());
		System.out.println("________________________________________________________________");
		System.out.println(user3.getCheckingbalance());
		System.out.println("________________________________________________________________");
		System.out.println(user3.getSavingbalance());
		System.out.println("________________________________________________________________");
		user1.deposit(50.0, 100.0);
		System.out.println(user1.getCheckingbalance());
		System.out.println(user1.getSavingbalance());
		System.out.println(user1.totalCheckingSaving());
		System.out.println("________________________________________________________________");
		user1.withdorw(10, 10);
		System.out.println(user1.getCheckingbalance());
		System.out.println(user1.getSavingbalance());
		System.out.println(user1.totalCheckingSaving());
		System.out.println("________________________________________________________________");
		user1.withdorw(10, 100);
		System.out.println("________________________________________________________________");
		user1.withdorw(100, 10);
		System.out.println("________________________________________________________________");
		user2.deposit(30.0, 100.0);
		System.out.println(BanckAccount.getTotalAmmount());
		

	}

}
