import java.util.Scanner;
public class FactorizationOfNumber_1{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to find Factors");
		int num=scan.nextInt();
	
		for(int i=1; i<=num; i++){
			if(num%i==0)
				System.out.println(i);
		}
	}
}