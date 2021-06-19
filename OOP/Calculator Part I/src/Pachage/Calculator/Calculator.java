package Pachage.Calculator;

class Calculator implements java.io.Serializable  {
		
		private int OperandOne;
		private int Operandtwo;
		private String Operation;
		private int result;
		
		public Calculator() {}
		
		public void setResult(int n) {
			this.result=n;
		}	
		public void setOperandOne(int n) {
			this.OperandOne=n;
		}
		public void setOperandtwo(int n) {
			this.Operandtwo=n;
		}
		public void setOperation(String n) {
			this.Operation=n;
			
		}
		public int getresult() {
			return result;
		}
		public int getOperandOne() {
			return OperandOne;
		}
		public int getOperandtwo() {
			return Operandtwo;
		}
		public String getOperation() {
			return Operation;
		}
		
		public void performOperation() {
			
			if ( getOperation().equals("+")) {
				int result = getOperandOne() + getOperandtwo();
				setResult(result);
			}
			else if ( getOperation().equals("-")) {
				int result = getOperandOne() - getOperandtwo();
				setResult(result);
			}
			
		
		}}
		
		


	