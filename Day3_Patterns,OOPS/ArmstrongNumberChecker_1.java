import java.util.Scanner;
public class ArmstrongNumberChecker_1{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to check whether the given Number is Armstrong or not");
		int n=scan.nextInt(), temp=n, input=n, c=0, sum=0;
		while(n!=0){
			int rem=n%10;
			c++;
			n/=10;
		}
		while(temp!=0){
			int rem=temp%10, res=1;
			for(int i=1; i<=c; i++){
				res*=rem;
			}
			sum+=res;
			temp/=10;
		}
		if(input==sum)
			System.out.println(input + " is an Armstrong Number");
		else
			System.out.println(input + " is not a Armstrong Number");
		
	}
}