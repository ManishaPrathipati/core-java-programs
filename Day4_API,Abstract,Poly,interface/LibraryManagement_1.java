import java.util.Scanner;
class Library{

	private int noOfBooksTkn;
	private int noOfBooksRcv;
	private int avgNoOfBooks;

	public void setNoOfBooksTkn(int noOfBooksTkn){
		this.noOfBooksTkn=noOfBooksTkn;
	}
	public int getNoOfBooksTkn(){
		return this.noOfBooksTkn;
	}

	public void setNoOfBooksRcv(int noOfBooksRcv){
		this.noOfBooksRcv=noOfBooksRcv;
	}
	public int getNoOfBooksRcv(){
		return this.noOfBooksRcv;
	}

	public void setAvgNoOfBooks(int avgNoOfBooks){
		this.avgNoOfBooks=avgNoOfBooks;
	}
	public int getAvgNoOfBooks(){
		return this.avgNoOfBooks;
	}
	
	public void displayAccess(){
		if(this.avgNoOfBooks<(this.noOfBooksTkn-this.noOfBooksRcv)){
			int b=(this.noOfBooksTkn-this.noOfBooksRcv)-this.avgNoOfBooks + 1;
			System.out.println("You do not have the Access to take more books, You Already reached limit Please return " + b + " books");
		}
		else if(this.avgNoOfBooks==(this.noOfBooksTkn-this.noOfBooksRcv))
			System.out.println("You reached the Accessibility for taking books");
		else{
			int b=this.avgNoOfBooks-this.noOfBooksTkn;
			System.out.println("You have the Access to take " + b + " more books");
		}
	}
	
}

class BulkOfBooks extends Library{
	private int noOfBooks;

	public void setNoOfBooks(int noOfBooks){
		this.noOfBooks=noOfBooks;
	}
	public int getNoOfBooks(){
		return this.noOfBooks;
	}

	public void displayBooks(){
		if((this.noOfBooks==super.getNoOfBooksTkn()) && (super.getNoOfBooksRcv()==0))
			System.out.println("Currently No Books are Available to take");
		else{
			int b=this.noOfBooks-(super.getNoOfBooksTkn()-super.getNoOfBooksRcv());
			System.out.println("Currently " + b + " Books are Available for Others to take to take");
		}
	}
	
}


class LibraryManagement_1{

	 public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter total Number of Books");
		int total=scan.nextInt();
		System.out.println("Please Enter total Number of Books You have");
		int btkn=scan.nextInt();
		System.out.println("Please Enter total Number of Books Submitted");
		int brcv=scan.nextInt();
		BulkOfBooks b=new BulkOfBooks();
	
			b.setNoOfBooks(total);
			b.setNoOfBooksTkn(btkn);
			b.setNoOfBooksRcv(brcv);
			b.setAvgNoOfBooks(7);

			b.displayAccess();
			b.displayBooks();
			
	}
	
}