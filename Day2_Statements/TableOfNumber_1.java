import java.util.Scanner;
public class TableOfNumber_1{
	
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to get the Table");
		int num=scan.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}