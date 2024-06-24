import java.util.Scanner;
public class FibonacciSeries_2{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number upto which you need the Fibonacci Series");
		int num=scan.nextInt();
		int a=0, b=1, c=a+b;
		System.out.println(a);
		System.out.println(b);
		while(c<=num){
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}
}