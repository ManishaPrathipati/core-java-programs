public class BankAccEncap_1{

	private String name;
	private long accountNumber;
	private String branch;
	private String ifscCode;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setAccountNumber(long accNum){
		this.accountNumber=accNum;
		
	}
	public long getAccountNumber(){
		return this.accountNumber;
	}

	public void setBranch(String branch){
		this.branch=branch;
	}
	public String getBranch(){
		return this.branch;
	}

	public void setIfscCode(String ifsc){
		this.ifscCode=ifsc;
		
	}
	public String getIfscCode(){
		return this.ifscCode;
	}	
	public static void main(String[] args){

		BankAccEncap_1 obj1=new BankAccEncap_1();
				obj1.setName("Manisha Prathipati");
				obj1.setAccountNumber(34527623237821l);
				obj1.setBranch("SBI, Chilakaluripet");
				obj1.setIfscCode("SBIN000");
				
			System.out.println("Person Name: " + (obj1.getName()));
			System.out.println("Person Account Number: " + (obj1.getAccountNumber()));
			System.out.println("Person Branch: " + (obj1.getBranch()));
			System.out.println("Person Bank Ifsc: " + (obj1.getIfscCode()));		
	}
}