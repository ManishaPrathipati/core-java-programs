import java.util.Scanner;
public class Factorial_1{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to Find Factorial");
		int input=scan.nextInt();
		int res=1;

		for(int i=1; i<=input; i++){
			res*=i;
		}
		System.out.println(res);
	}
}