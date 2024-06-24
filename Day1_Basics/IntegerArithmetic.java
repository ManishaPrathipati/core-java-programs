public class IntegerArithmetic{

	public static void main(String[] args){
		int a=10, b=20, c=30;
		System.out.println("Addition of " + a + " , " + b + " and " + c + " is: " + (a+b+c) );
		System.out.println("Subtraction of " + c + " , " + a + " and " + a + " is: " + (c-a-a) );
		System.out.println("Multiplication of " + a + " , " + b + " and " + c + " is: " + (a*b*c) );
		System.out.println("Division of " + b + " , " + a + " is: " + (b/a) );
		System.out.println("Modulus of " + c + " and " + b + " is: " + (c%b) );	
	}
}