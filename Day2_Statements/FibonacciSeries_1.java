public class FibonacciSeries_1{

	public static void main(String[] args){

		int a=0, b=1, c=a+b, num=100;
		System.out.println(a);
		System.out.println(b);
		while(c<=num){
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}
}