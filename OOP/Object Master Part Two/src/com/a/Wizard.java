package com.a;

	public class Wizard extends Human {
		public Wizard() {
		this.health=50;
		this.intelligence=8;
		}
		
		
		public void heal(Human y) {
			 y.health+=this.intelligence;
			 System.out.println(" health:"+ y.health ); // how can i print his name 
			 System.out.println("intelligence:"+this.intelligence);
		}
		public void fireball(Human y) {
			 y.health-=this.intelligence*3;	
			 System.out.println(" health:"+ y.health );
			 System.out.println(" intelligence:"+ y.intelligence );
		}	

	}
