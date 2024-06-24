import java.util.Scanner;
public class SimpleInterestCalculator_2{
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){

		System.out.println("Thanks for Choosing Our Calculator to Calculate Simple Interest");
		System.out.println("Please Enter the Principle Amount to Calculate Simple Interest");
		float principalAmount=scan.nextFloat();
		System.out.println("Please Enter the time to Calculate Simple Interest");
		float time=scan.nextFloat();
		System.out.println("Please Enter the rate of interest to Calculate Simple Interest");
		float rateOfInterest=scan.nextFloat();

		float simpleInterest=simpleInterest(principalAmount, time, rateOfInterest); 	
		
		System.out.println("Your Simple Interest for the given requirements is: " + simpleInterest);	
	}
	
	public static float simpleInterest(float pA, float t, float rOI){

		float simpleInterest=(pA*t*rOI)/100;
		return simpleInterest;
	}
}