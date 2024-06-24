public class GenTask{

	public static void main(String[] args){

		int n=0, space=4, ite=-1;
		for(int i=1; i<=4; i++){
			space--;
			ite+=2;
			for(int j=1; j<=space; j++){
				System.out.print("    ");
			}
			for(int j=1; j<=ite; j++){
				if(i==1)
					System.out.print(i);
				else if(i==4 && j==4){
					System.out.print("*  ");
					n+=4;
				}
				else{
					n+=4;
					System.out.print(n + "  ");
				}
			}
			System.out.println();
		}
	}
}