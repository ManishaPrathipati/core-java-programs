import java.util.Scanner;
public class PrimeNumberChecker_2{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter one Number to check Whether the number is Prime or Not");
		int num=scan.nextInt();
		
		if(isPrime(num))
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

	public static boolean isPrime(int num){
		int count=0;
		for(int i=1; i<=num; i++){

			if(num%i==0)
				count++;
		}
		return count==2;
	}
}