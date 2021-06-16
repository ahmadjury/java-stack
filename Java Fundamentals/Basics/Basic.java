import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class Basic{
	static void toCount(){	
		for (int i = 1;i<226;i++){
		System.out.println(i);
		}

	}
// System.out.println("____________________________________________________________");			
	static void odd(){
		for (int i = 1;i<226;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		
		}		
	}	
// System.out.println("____________________________________________________________");			
	static void printSum(){
		int sum=0;
		for (int i = 1;i<226;i++){
			sum += i;
			String x=String.format("new number: %d, sum: %d", i, sum);
			System.out.println(x);
		}
	}
// System.out.println("____________________________________________________________");			

	static void Iterating (){
			int [] array = {1,2,3,4,5,6};
			for (int i = 0;i<array.length;i++){
				System.out.println(array[i]);
			}
	}	
// System.out.println("____________________________________________________________");			

	static void FindMax (){
		
		int[] array1= {1,2,3,4,5};
		int max=0;
		for (int i = 0 ; i<array1.length ; i++){
			if(array1[i]>max){
				max=array1[i];
			}
		}
		System.out.println(max);
	}
	
// System.out.println("____________________________________________________________");			

	static void getAverage (){
		int[] array2= {1,2,3};
		int avg2=0;
		int sum2=0;
		int num2=0;
		for (int i =0;i<array2.length;i++){
			num2++;
			sum2+=array2[i];
		}
		avg2= sum2/num2;
		System.out.println(num2);
		System.out.println(sum2);
		System.out.println(avg2);
	}
// System.out.println("____________________________________________________________");			

	static void arrayWithOddNumbers(){
			ArrayList<Integer> arrayOdd=new ArrayList<Integer>();
			for (int i = 0;i<=255;i++){
				if(i%2!=0){
				arrayOdd.add(i);
				}
			}
			System.out.println(arrayOdd);
	}
// System.out.println("____________________________________________________________");			
	static void greaterThanY(){
			int[] array3= {1,2,3,4,5,6};
			int y = 2;
			int count=0;
			for (int i=0 ; i<array3.length ; i++){
				if(array3[i]>y){
					count++;
				}
			}
			System.out.println(count);	
	}		
// System.out.println("____________________________________________________________");		
	static void squareTheValues(){
			ArrayList<Integer> array4 = new ArrayList<Integer>();
			array4.add(1);
			array4.add(2);
			array4.add(3);
			array4.add(4);
			System.out.println(array4);
			for (int i = 0 ; i<array4.size() ; i++){
				array4.set(i,(array4.get(i)*array4.get(i)));
			}
			System.out.println(array4);
	}

// System.out.println("____________________________________________________________");
	static void eliminateNegativeNumbers(){
		ArrayList<Integer> array5 = new ArrayList<Integer>();
		array5.add(1);
		array5.add(2);
		array5.add(3);
		array5.add(-4);
		System.out.println(array5);
		for (int i = 0 ; i<array5.size() ; i++){
			if(array5.get(i)<0){
				array5.set(i,(array5.get(i)*-1));
			}	
		}
		System.out.println(array5);
	}
// System.out.println("____________________________________________________________");
	static void maxMinAverage(){
		int[] arr = {1,5,10,-2};
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (int i =0 ;i<arr.length ; i++){
			if (arr[i]<min){
				min = arr[i];
			}			
			if (arr[i]>max){
				max = arr[i];
			}
			sum+=arr[i];
			count++;	
		}
		avg=sum/count;
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);		
	}
// System.out.println("____________________________________________________________");
	static void shiftingValuesArray(){
		int[] arr = {1, 5, 10, 7, -2};
		for (int i =0 ; i<arr.length-1 ; i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		System.out.println(Arrays.toString(arr));		

	}
}			

	
	

