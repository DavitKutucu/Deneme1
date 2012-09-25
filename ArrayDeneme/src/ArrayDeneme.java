import java.util.Scanner;


public class ArrayDeneme {
public static void main(String args[]){
	final int NUMBER_OF_ELEMENTS = 5;
	
	//double[] myList;
	//myList= new double[NUMBER_OF_ELEMENTS];
	
	double[]  myList= new double[NUMBER_OF_ELEMENTS];
	for(int i =0; i<NUMBER_OF_ELEMENTS; i++){
		System.out.println("Ente a random number");
	

		
	Scanner sc =new Scanner(System.in);
	double num1 =sc.nextDouble();
	double num2 =sc.nextDouble();
	double num3 =sc.nextDouble();
	double num4 =sc.nextDouble();
	double num5 =sc.nextDouble();
	double [] liste= {num1 ,num2 ,num3 ,num4 ,num5};
	
	System.out.println("The numbers is ="+(myList.length));
	System.out.println("Array numbers are="+ myList(NUMBER_OF_ELEMENTS));
	System.out.println("List of array is=" + liste);
	}
	}

private static int myList(int NUMBER_OF_ELEMENTS) {
	// TODO Auto-generated method stub
	return NUMBER_OF_ELEMENTS;
}
}

