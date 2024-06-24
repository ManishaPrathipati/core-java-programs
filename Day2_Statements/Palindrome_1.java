import java.util.Scanner;
public class Palindrome_1{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to Check whether the Number is Palindrome or Not");
		int input=scan.nextInt();
		int palind=input;
		int rev=0;

		while(input!=0){
			int remind=input%10;
			rev=rev*10+remind;
			input/=10;
		}
		if(rev==palind)
			System.out.println("The Given Number is a Palindrome Number");
		else
			System.out.println("The Given Number is not a Palindrome Number");
	}
}