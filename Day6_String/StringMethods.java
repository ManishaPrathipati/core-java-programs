public class StringMethods{

	public static void main(String[] args){

		String s1="manisha";
		String s2="Prathipati";
		String s3="manisha";
		String s4=new String();
		String s5=new String("manisha");
		String s6=new String("manisha");
		String s7=new String("prathipati");
		
		System.out.println(s1.length());
		System.out.println(s2.length());

		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(5));

		System.out.println(s1==s2);	
		System.out.println(s1==s3);	
		System.out.println(s2==s7);	
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s6));
		System.out.println(s5==s6);	
		System.out.println(s5.equals(s6));

		System.out.println(s1.compareTo(s6));
		System.out.println(s6.compareTo(s2));
		System.out.println(s6.compareTo(s7));

		System.out.println(s5.compareTo(s6));
	}
}