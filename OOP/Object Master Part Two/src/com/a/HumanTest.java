package com.a;

public class HumanTest {

	public static void main(String[] args) {
			
		Human H1 = new Human();
		
		Ninja N1 = new Ninja();
		N1.steal(H1);
		
		N1.runAway();
		
		Wizard W1 = new Wizard();
		W1.heal(H1);
		
		W1.fireball(H1);
		
		Samurai Sa1 = new Samurai();
		Sa1.deathBlow(H1);
		
		Sa1.meditate();
		
		Samurai Sa2 = new Samurai();
		Samurai Sa3 = new Samurai();
		
		System.out.println(Samurai.howMany());
		}

}
