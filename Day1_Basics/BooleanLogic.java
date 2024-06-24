public class BooleanLogic{

	public static void main(String[] args){
		
		int input=8;

		if(input<10)
			System.out.println("Given Input " + input + " is Less than 10");
		else if(input>10)
			System.out.println("Given Input " + input + " is Greater than 10");
		else
			System.out.println("Given Input " + input + " is Equal to 10");

		Boolean b=true;

		if(b)
			System.out.println("Given Condition is " + b );
		else
			System.out.println("Given Condition is not" + b ); 
		
		int i=1;
		while(b){
			if(i!=9)	
				System.out.println(i++);
			else
				break;
		}

	}
}