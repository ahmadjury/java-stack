import java.lang.*;
public class HelloWorld{
	public static double calculateHypotenuse(int legA, int legB){
		double c ; 
		c= Math.sqrt(Math.pow(legA,2)+Math.pow(legB,2));
		System.out.print(c);
		return c;
	}

	public static void main(String []args){
		calculateHypotenuse(2,3);
	}
	
}