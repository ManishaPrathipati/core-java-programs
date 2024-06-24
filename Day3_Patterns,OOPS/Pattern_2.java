public class Pattern_2{

	public static void main(String[] args){
		char ch='A', space=0, star=5;
		for(int i=1; i<=5; i++){
			space++;
			for(int j=1; j<=space; j++){
				if(i==j)
					System.out.print(ch++);
				else
					System.out.print(ch);
				
			}
			star--;
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}