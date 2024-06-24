import java.util.Scanner;
public class MaxMinNumber_2{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=scan.nextInt();
		System.out.println("Enter Second Number");
		int n2=scan.nextInt();
		System.out.println("Enter Third Number");
		int n3=scan.nextInt();	

		if(n1>n2){
			if(n1>n3)
				System.out.println(n1 + " is a Maximum Number");
			else
				System.out.println(n3 + " is a Maximum Number");
		}
		else
			System.out.println(n2 + " is a Maximum Number");
					
	}

}