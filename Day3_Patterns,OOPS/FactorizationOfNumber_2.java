import java.util.Scanner;
public class FactorizationOfNumber_2{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to find Factors");
		int num=scan.nextInt();
		System.out.println("Factors of " + num + " are ");
		numFactors(num);
	}
	
	public static void numFactors(int num){
		for(int i=1; i<=num; i++){
			if(num%i==0)
				System.out.print(i+ " ");
		}
	}
}