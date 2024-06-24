import java.util.Scanner;
public class FibonacciSeries_3{

	static Scanner scan=new Scanner(System.in);
	System.out.println("Please Enter Numbers in the range for Fibonacci Series");
	int num=scan.nextInt();

	public static void main(String[] args){

		System.out.println("Please Enter the Number from the given range to check whether the number is Fibonacci or not");
		int n=scan.nextInt();

		if(isFib(n))
			System.out.println("You Entered a Fibonacci Number");
		else
			System.out.println("Your Number is not a Fibonacci Number");

		
	}
	
	public static boolean isFib(int n){
		int a=0, b=1, c=a+b;
		if(c==0){
			return true;
		}
		while(c<=num){
			if(c==n){
				return true;
			}
			a=b;
			b=c;
			c=a+b;
		}
		return false;
	}
}