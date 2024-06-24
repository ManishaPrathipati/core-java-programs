import java.util.Scanner;
public class PrimeNumberChecker_1{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter one Number to check Whether the number is Prime or Not");
		int num=scan.nextInt();
		int count=0;

		for(int i=1; i<=num; i++){

			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Prime NUmber");
		else
			System.out.println("Not a Prime NUmber");
	}
}