import java.util.Scanner;
public class ScannerInput{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter one Value");
		int a=scan.nextInt();

		System.out.println("Enter Another Value");
		int b=scan.nextInt();

		System.out.println("Enter a Float Value to Display");
		float f=scan.nextFloat();

		System.out.println("Enter Any String to Display");
		String s=scan.next();

		System.out.println("Your Float Value is: " + f);
		System.out.println("Your String is: " + s);
		System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
		
	}
}