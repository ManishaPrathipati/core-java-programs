import java.util.Scanner;
public class BreakStatement_2{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please select the courses from the below");
		System.out.println("1. Java \n 2. SQL \n 3. HTML \n 4. CSS \n 5. JavaScript");
		int choice=scan.nextInt();
		switch(choice){
			case 1:
				System.out.println("Thanks for Choosing Java Course...!!!");
				break;
			case 2:
				System.out.println("Thanks for Choosing SQL Course...!!!");
				break;
			case 3:
				System.out.println("Thanks for Choosing HTML Course...!!!");
				break;
			case 4:
				System.out.println("Thanks for Choosing CSS Course...!!!");
				break;
			case 5:
				System.out.println("Thanks for Choosing JavaScript Course...!!!");
				break;
			default:
				System.out.println("You are not Choosen the Correct Option, Please Select from the above Options...!!!");
				break;
		}
	}
}