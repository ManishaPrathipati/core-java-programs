import java.util.Scanner;
public class ArithmeticCalculator_1{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Choose Your Option from the below to Perfrom Arithmetic Operations");
		System.out.println(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus");
		int option=scan.nextInt();
		
		if(option==1){
			System.out.println("Thanks for Choosing Your Option \n You are Choosen Addition Operation");
			System.out.println("Please Enter the First Number to perform Your selected Operation");
			int i1=scan.nextInt();
			System.out.println("Please Enter the Second Number to perform Your selected Operation");
			int i2=scan.nextInt();
			System.out.println("Addition of " + i1 + ", " + i2 + " is: " + (i1+i2));			
		}
		else if(option==2){
			System.out.println("Thanks for Choosing Your Option \n You are Choosen Subtraction Operation");
			System.out.println("Please Enter the First Number to perform Your selected Operation");
			int i1=scan.nextInt();
			System.out.println("Please Enter the Second Number to perform Your selected Operation");
			int i2=scan.nextInt();
			System.out.println("Subtraction of " + i1 + ", " + i2 + " is: " + (i1-i2));			
		}	 
		else if(option==3){
			System.out.println("Thanks for Choosing Your Option \n You are Choosen Multiplication Operation");
			System.out.println("Please Enter the First Number to perform Your selected Operation");
			int i1=scan.nextInt();
			System.out.println("Please Enter the Second Number to perform Your selected Operation");
			int i2=scan.nextInt();
			System.out.println("Multiplication of " + i1 + ", " + i2 + " is: " + (i1*i2));			
		}
		else if(option==4){
			System.out.println("Thanks for Choosing Your Option \n You are Choosen Division Operation");
			System.out.println("Please Enter the First Number to perform Your selected Operation");
			int i1=scan.nextInt();
			System.out.println("Please Enter the Second Number to perform Your selected Operation");
			int i2=scan.nextInt();
			System.out.println("Division of " + i1 + ", " + i2 + " is: " + (i1/i2));			
		}
		else{
			System.out.println("Thanks for Choosing Your Option \n You are Choosen Modulus Operation");
			System.out.println("Please Enter the First Number to perform Your selected Operation");
			int i1=scan.nextInt();
			System.out.println("Please Enter the Second Number to perform Your selected Operation");
			int i2=scan.nextInt();
			System.out.println("Modulus of " + i1 + ", " + i2 + " is: " + (i1%i2));			
		}			
	}
}