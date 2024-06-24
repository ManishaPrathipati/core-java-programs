public class GenTask_1{

	public static void main(String[] args){

		int n=7; char ch='F';
		for(int i=5; i>=1; i--){
			if(i%2==0)
				ch-=2;
			else
				n-=2;
			for(int j=i; j>=1; j--){
				if(i%2==0)
					System.out.print(ch);
				else
					System.out.print(n);
			}
			System.out.println();
		}
	}
}