class Massil{

	public void companyDetails(){
		System.out.println("Welcome to Massil Technologies");
	}
}

class CEO extends Massil{
	String name;

	CEO(String name){
		this.name=name;
	}
	public void ceoDetails(){
		System.out.println("CEO of Massil Technologies is: " + this.name);
	}

}

class TeamLead extends CEO{
	String tlName;

	TeamLead(String tlName, String name){
		super(name);
		this.tlName=tlName;
	}
	public void teamLead(){
		System.out.println(this.tlName + " is reporting to " + this.name);
	}
}

class Employee extends TeamLead{
	String empName;
        
	Employee(String empName, String tlName, String ceoName){
		super(tlName, ceoName);
		this.empName=empName;
	}
	public void employee(){
		System.out.println(this.empName + " is reporting to " + this.tlName + " and " + this.tlName + " is reporting to " + this.name);
	}
}

class EmployeeInterface_1{

	 public static void main(String[] args){
		Massil m=new Massil();
		CEO ceo=new CEO("Satish");
		TeamLead tl=new TeamLead("Rajesh", "Satish");
		Employee e=new Employee("Manisha", "Rajesh", "Satish");
		
		e.employee();
	}
	
}