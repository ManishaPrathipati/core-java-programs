import java.util.Scanner;
public class Factorial_2{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to Find Factorial");
		int input=scan.nextInt();
		int fact=1;
		int i=input;
		while(i>=1){
			fact*=i;
			i--;
		}
		System.out.println(fact);
	}
}