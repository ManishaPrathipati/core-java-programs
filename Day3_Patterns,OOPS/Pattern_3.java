import java.util.Scanner;
public class Pattern_3{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the input value");
		int input=scan.nextInt(), num=0;
		for(int i=1; i<=2*input-1; i++){
			if(i<=input)
				num++;
			else
				num--;
			for(int j=1; j<=2*input-1; j++){
				if(i==j || (i+j)==2*input)
					System.out.print(num);
				else
					System.out.print(" ");	
			}
			System.out.println();
		}
	}
}