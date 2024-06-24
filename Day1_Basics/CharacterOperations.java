public class CharacterOperations{

	public static void main(String[] args){
		
		char ch='i';
	
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			System.out.println("Given Character is a Vowel");
		else
			System.out.println("Given Character is a not a Vowel");	

	
		char ch1='a', ch2='c';
			System.out.println(ch1+ch2);
			System.out.println(ch2-ch1);
			System.out.println(ch1*ch2);	
			System.out.println(ch2/ch1);
			System.out.println(ch2%ch1);
	}
}