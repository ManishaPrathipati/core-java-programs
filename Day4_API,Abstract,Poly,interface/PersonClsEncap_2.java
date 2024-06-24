public class PersonClsEncap_2{

	private String personId;
	private String name;
	private double salary;

	public void setPersonId(String personId){
		if(personId.charAt(0)=='T'){
			this.personId=personId;
		}
		else{
			System.out.println("Given Id Series is not Accepted");
			this.personId="-----";
		}
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

	public void setSalary(double sal){
		if(sal>=10000){
			this.salary=sal;
		}
		else{
			System.out.println("Salary Requirements are not matching");
			this.salary=00000;
		}
		
	}
	public double getSalary(){
		return this.salary;
	}
	
	public static void main(String[] args){

		PersonClsEncap_2 obj1=new PersonClsEncap_2();
				obj1.setPersonId("I0040");
				obj1.setName("Manisha Prathipati");
				obj1.setSalary(386745);

			if(obj1.personId.charAt(0)=='T' && obj1.salary>=10000){
				System.out.println("Person Id: " + (obj1.getPersonId()));
				System.out.println("Person Name: " + (obj1.getName()));
				System.out.println("Person Salary: " + (obj1.getSalary()));
			}		
	}
}