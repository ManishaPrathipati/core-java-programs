import java.util.Scanner;
public class TableOfNumber_2{
	
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to get the Table");
		int num=scan.nextInt();
		int i=1;
		
		while(i<=10){
			System.out.println(num + " * " + i + " = " + (num*i));
			i++;
		}
	}
}