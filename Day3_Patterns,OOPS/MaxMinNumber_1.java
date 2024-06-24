public class MaxMinNumber_1{

	public static void main(String[] args){

		int[] a={14,245,34,45,23,56,98,14};
		int min=a[0], max=a[0];
		for(int i=0; i<a.length; i++){
			if(a[i]<min)
				min=a[i];
			else if(a[i]>max)
				max=a[i];
		}
		System.out.println(min + " is the Minimum value in the given Array");
		System.out.println(max + " is the Maximum value in the given Array");		
	}
}