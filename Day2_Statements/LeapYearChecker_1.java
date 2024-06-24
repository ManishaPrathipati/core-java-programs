import java.util.Scanner;
public class LeapYearChecker_1{
	
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Year to Check Whether the Year is a Leap Year or not");
		int year=scan.nextInt();
		
		if(year%100==0){
			if(year%400==0)
				System.out.println("Given Year is a Leap Year");
			else
				System.out.println("Given Year is not a Leap Year");
		}
		else{
			if(year%4==0)
				System.out.println("Given Year is a Leap Year");
			else
				System.out.println("Given Year is not a Leap Year");
		}
	}
}