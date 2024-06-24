import java.util.Scanner;
public class SumOfDigits_1{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to Find Sum of Digits Of a Number");
		int input=scan.nextInt();
		int sum=0;

		while(input!=0){
			int remind=input%10;	
			sum+=remind;
			input/=10;
		}
		
		System.out.println("The Sum Of Digits Of a Given Number is: " + sum);
	}
}