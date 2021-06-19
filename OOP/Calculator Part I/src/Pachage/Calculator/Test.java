package Pachage.Calculator;

public class Test {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();

		 cal.setOperandOne(5);
		 cal.setOperandtwo(13);	
		 cal.setOperation("+");
		 cal.performOperation();
		 System.out.println(cal.getresult());
		 
		 Calculator cal2 = new Calculator();

		 cal.setOperandOne(5);
		 cal.setOperandtwo(13);	
		 cal.setOperation("-");
		 cal.performOperation();
		 System.out.println(cal.getresult());
			
	}
}
