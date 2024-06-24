import java.util.Scanner;
public class Pattern_1{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the input number");
		int input=scan.nextInt(), num=1, ite=-1;
		for(int i=1; i<=input; i++){
			ite+=2;
			for(int j=1; j<=ite; j++){
				if(i>j)
					System.out.print(num--);
				else
					System.out.print(num++);
			}
		System.out.println();
		}
	}
}