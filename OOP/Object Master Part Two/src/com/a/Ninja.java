package com.a;

	public class Ninja extends Human{
		int stealth;

		public Ninja() {
			this.stealth = 10;
		}	
		public void steal(Human x) {
			 x.health -=this.stealth;
			this.health+= this.stealth;
			
			System.out.println(x.health);
			System.out.println(this.health);
			
			
		}
		public void runAway() {
			this.health-=10;
			System.out.println(this.health);
		}
			
}
