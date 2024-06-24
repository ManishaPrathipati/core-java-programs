public class FloatArithmetic{

	public static void main(String[] args){
		float a=2.3f, b=1.2f, c=4.8f;
		System.out.println("Addition of " + a + " , " + b + " and " + c + " is: " + (a+b+c) );
		System.out.println("Subtraction of " + c + " , " + a + " and " + b + " is: " + (c-a-b) );
		System.out.println("Multiplication of " + a + " , " + b + " and " + c + " is: " + (a*b*c) );
		System.out.println("Division of " + b + " , " + a + " is: " + (b/a) );
		System.out.println("Modulus of " + c + " and " + b + " is: " + (c%b) );	
	}
}