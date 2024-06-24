public class BankAccEncap_2{

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
		if(branch.equalsIgnoreCase("SBI")){
			this.branch=branch;
		}
		else{
			System.out.println("We Are not found Account Details of such Bank");
			this.branch="-------";
		}
	}
	public String getBranch(){
		return this.branch;
	}

	public void setIfscCode(String ifsc){
		if(ifsc.equals("SBIN000")){
			this.ifscCode=ifsc;
		}
		else{
			System.out.println("We Are not found Account Details with the IFSC Code");
			this.ifscCode="-------";
		}
		
	}
	public String getIfscCode(){
		return this.ifscCode;
	}	
	public static void main(String[] args){

		BankAccEncap_2 obj1=new BankAccEncap_2();
				obj1.setName("Manisha Prathipati");
				obj1.setAccountNumber(34527623237821l);
				obj1.setBranch("sbi");
				obj1.setIfscCode("SBIN00");
			
			if(obj1.branch.equalsIgnoreCase("SBI") && obj1.ifscCode.equals("SBIN000")){
				System.out.println("Account Details for the given Specifications are");	
				System.out.println("Person Name: " + (obj1.getName()));
				System.out.println("Person Account Number: " + (obj1.getAccountNumber()));
			}	
	}
}