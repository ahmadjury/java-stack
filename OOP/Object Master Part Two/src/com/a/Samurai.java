package com.a;

public class Samurai extends Human{
	 public static int counter=0;	
	
		public Samurai() {
		this.health = 200;
		counter++;
	}
	public void deathBlow(Human x) {
		 x.health = 0;
		this.health+= health/ 2;
		System.out.println("human health:"+x.health);
		System.out.println(" samurai health:"+this.health);
	}	
	public void meditate() {
		this.health =this.health + (this.health/2);	
		System.out.println("samurai health:"+this.health);
	}
	
	public static int howMany() {
		return counter;
	}
}

