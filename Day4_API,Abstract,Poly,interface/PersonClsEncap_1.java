public class PersonClsEncap_1{

	private String personId;
	private String name;
	private long mobileNumber;

	public void setPersonId(String personId){
		this.personId=personId;
	}
	public String getPersonId(){
		return this.personId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setMobileNumber(long mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public long getMobileNumber(){
		return this.mobileNumber;
	}
	
	public static void main(String[] args){

		PersonClsEncap_1 obj1=new PersonClsEncap_1();
				obj1.setPersonId("T0040");
				obj1.setName("Manisha Prathipati");
				obj1.setMobileNumber(9876543210l);

			System.out.println("Person Id: " + (obj1.getPersonId()));
			System.out.println("Person Name: " + (obj1.getName()));
			System.out.println("Person Mobile Number: " + (obj1.getMobileNumber()));		
	}
}