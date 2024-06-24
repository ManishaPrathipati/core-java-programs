import java.util.Scanner;
public class ArithmeticCalculator_3{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		Boolean loop=true;

		while(loop){
			System.out.println("Please Choose Your Option from the below to Perfrom Arithmetic Operations");
			System.out.println(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus");
			int option=scan.nextInt();

			switch(option){
				case 1:
					System.out.println("Thanks for Choosing Your Option....!!!!! \n You are Choosen Addition Operation");
					System.out.println("Please Enter the First Number to perform Your selected Operation");
					int ai1=scan.nextInt();
					System.out.println("Please Enter the Second Number to perform Your selected Operation");
					int ai2=scan.nextInt();
					System.out.println("Addition of " + ai1 + ", " + ai2 + " is: " + (ai1+ai2));
					break;
				case 2:
					System.out.println("Thanks for Choosing Your Option....!!!!! \n You are Choosen Subtraction Operation");
					System.out.println("Please Enter the First Number to perform Your selected Operation");
					int si1=scan.nextInt();
					System.out.println("Please Enter the Second Number to perform Your selected Operation");
					int si2=scan.nextInt();
					System.out.println("Subtraction of " + si1 + ", " + si2 + " is: " + (si1-si2));
					break;
				case 3:
					System.out.println("Thanks for Choosing Your Option....!!!!! \n You are Choosen Multiplication Operation");
					System.out.println("Please Enter the First Number to perform Your selected Operation");
					int mi1=scan.nextInt();
					System.out.println("Please Enter the Second Number to perform Your selected Operation");
					int mi2=scan.nextInt();
					System.out.println("Multiplication of " + mi1 + ", " + mi2 + " is: " + (mi1*mi2));
					break;
				case 4:
					System.out.println("Thanks for Choosing Your Option....!!!!! \n You are Choosen Division Operation");
					System.out.println("Please Enter the First Number to perform Your selected Operation");
					int di1=scan.nextInt();
					System.out.println("Please Enter the Second Number to perform Your selected Operation");
					int di2=scan.nextInt();
					System.out.println("Division of " + di1 + ", " + di2 + " is: " + (di1/di2));
					break;
				case 5:
					System.out.println("Thanks for Choosing Your Option....!!!!! \n You are Choosen Modulus Operation");
					System.out.println("Please Enter the First Number to perform Your selected Operation");
					int modi1=scan.nextInt();
					System.out.println("Please Enter the Second Number to perform Your selected Operation");
					int modi2=scan.nextInt();
					System.out.println("Modulus of " + modi1 + ", " + modi2 + " is: " + (modi1%modi2));	
					break;
				default:
					System.out.println("Ooopss....!!!!! You are not Choosen the Correct Option, Please pick the Correct Option From the above menu");
					loop=false;
			}		
		}
	}
}