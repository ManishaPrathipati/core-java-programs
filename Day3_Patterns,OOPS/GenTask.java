public class GenTask{

	public static void main(String[] args){
		int n=1, ite=-1, input=3, space=input;
		for(int i=1; i<=input; i++){
			ite+=2;
			space--;
			for(int j=1; j<=space; j++){
				System.out.print("   ");
			}
			for(int j=1; j<=ite; j++){
				
				if(j==i && i!=1){
					int temp=n-(2*(j-1)), res=0;
					for(int k=1; k<=(i-1)*2; k++){
						res+=temp;
						temp+=2;
					}
					System.out.print(res + "  ");
					
				}
				else{
					System.out.print(n + "  ");
					n+=2;
				}
			}
			System.out.println();
		}
	}
}