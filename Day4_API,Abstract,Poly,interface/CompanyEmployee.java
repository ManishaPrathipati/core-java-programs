class Company{

	private String companyName;
	private String offMailDomain;
	
	public void setCompanyName(String companyName){
		this.companyName=companyName;
	}
	public String getCompanyName(){
		return this.companyName;
	}

	public void setOffMailDomain(String offMailDomain){
		this.offMailDomain=offMailDomain;
	}
	public String getOffMailDomain(){
		return this.offMailDomain;
	}
}

class Employee_1 extends Company{
	private String empName;
	private String empMailId;

	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return this.empName;
	}

	public void setEmpMailId(String empMailId){
		this.empMailId=empMailId;
	}
	public String getEmpMailId(){
		return this.empMailId;
	}

	public void displayAccessOfEmp1(){
		String res="";
		for(int i=0; i<this.empMailId.length(); i++){
			if(this.empMailId.charAt(i)=='@'){
				res=this.empMailId.substring(i,this.empMailId.length());
			}
		}
		if(res.equals(super.getOffMailDomain())){
			System.out.println("Dear " + this.empName + " Your Login is Successful");
		}
		else
			System.out.println("Dear " + this.empName + " Your Login is UnSuccessful");
	}
}

class Employee_2 extends Company{
	private String empName;
	private String empMailId;

	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return this.empName;
	}

	public void setEmpMailId(String empMailId){
		this.empMailId=empMailId;
	}
	public String getEmpMailId(){
		return this.empMailId;
	}

	public void displayAccessOfEmp2(){
		String res="";
		for(int i=0; i<this.empMailId.length(); i++){
			if(this.empMailId.charAt(i)=='@'){
				res=this.empMailId.substring(i,this.empMailId.length());
			}
		}
		if(res.equals(super.getOffMailDomain())){
			System.out.println("Dear " + this.empName + " Your Login is Successful");
		}
		else
			System.out.println("Dear " + this.empName + " Your Login is UnSuccessful");
	}
}

class Employee_3 extends Company{
	private String empName;
	private String empMailId;

	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return this.empName;
	}

	public void setEmpMailId(String empMailId){
		this.empMailId=empMailId;
	}
	public String getEmpMailId(){
		return this.empMailId;
	}

	public void displayAccessOfEmp3(){
		String res="";
		for(int i=0; i<this.empMailId.length(); i++){
			if(this.empMailId.charAt(i)=='@'){
				res=this.empMailId.substring(i,this.empMailId.length());
			}
		}
		if(res.equals(super.getOffMailDomain())){
			System.out.println("Dear " + this.empName + " Your Login is Successful");
		}
		else
			System.out.println("Dear " + this.empName + " Your Login is UnSuccessful");
	}
}

class CompanyEmployee{

	 public static void main(String[] args){
		
		Employee_1 e1=new Employee_1();	
			e1.setCompanyName("Massil Technologies");
			e1.setOffMailDomain("@massiltech.com");

			e1.setEmpName("Manisha Prathipati");
			e1.setEmpMailId("manisha.p@massiltech.com");
			e1.displayAccessOfEmp1();

		Employee_2 e2=new Employee_2();
			e2.setCompanyName("Massil Technologies");
			e2.setOffMailDomain("@massiltech.com");

			e2.setEmpName("Sri Manjusha");
			e2.setEmpMailId("manjushasha.y@massiltech.com");
			e2.displayAccessOfEmp2();

		Employee_3 e3=new Employee_3();
			e3.setCompanyName("Massil Technologies");
			e3.setOffMailDomain("@massiltech.com");

			e3.setEmpName("Lakshmi");
			e3.setEmpMailId("lakshmi.k@massiltechh.com");
			e3.displayAccessOfEmp3();
	}
	
}