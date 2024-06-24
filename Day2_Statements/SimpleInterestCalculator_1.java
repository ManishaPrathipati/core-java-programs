import java.util.Scanner;
public class SimpleInterestCalculator_1{
	
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Thanks for Choosing Our Calculator to Calculate Simple Interest");
		System.out.println("Please Enter the Principle Amount to Calculate Simple Interest");
		float principalAmount=scan.nextFloat();
		System.out.println("Please Enter the time to Calculate Simple Interest");
		float time=scan.nextFloat();
		System.out.println("Please Enter the rate of interest to Calculate Simple Interest");
		float rateOfInterest=scan.nextFloat();
		float simpleInterest=(principalAmount*time*rateOfInterest)/100;
		
		System.out.println("Your Simple Interest for the given requirements is: " + simpleInterest);	
	}
	
}