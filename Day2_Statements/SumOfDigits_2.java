import java.util.Scanner;
public class SumOfDigits_2{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to Find Sum of Digits");
		int input=scan.nextInt();
		int sum=sum(input);
		System.out.println("The Sum Of Digits Of a Given Number is: " + sum);
	}

	public static int sum(int i){
		int sum=0;
		while(i!=0){
			int remind=i%10;	
			sum+=remind;
			i/=10;
		}
		return sum;
	}
}