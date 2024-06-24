class School{

	private String offManager;
	private String clsManager;
	private String securityManager;

	public void setOffManager(String offManag){
		this.offManager=offManag;
	}
	public String getOffManager(){
		return this.offManager;
	}

	public void setClsManager(String clsManag){
		this.clsManager=clsManag;
	}
	public String getClsManager(){
		return this.clsManager;
	}

	public void setSecurityManager(String secManag){
		this.securityManager=secManag;
	}
	public String getSecurityManager(){
		return this.securityManager;
	}

	
}

class Management extends School{

	public void offLogin(){
		if(super.getOffManager().equals("Sambasiva Rao"))
			System.out.println("Office Login Successful");
		else
			System.out.println("UserName is not correct, We are not Log you into the Office Page");
	}

	public void clsLogin(){
		if(super.getClsManager().equals("Chandra Shekar"))
			System.out.println("Class Login Successful");
		else
			System.out.println("UserName is not correct, We are not Log you into the Class Page");
	}

	public void securityLogin(){
		if(super.getSecurityManager().equals("Shankar Rao"))
			System.out.println("Security Login Successful");
		else
			System.out.println("UserName is not correct, We are not Log you into the Security Page");
	}	
	
}

class SchoolManagement_1{

	 public static void main(String[] args){

		Management m=new Management();
			m.setOffManager("SambasivaRao");
			m.setClsManager("Chandra Shekar");
			m.setSecurityManager("Shankar Rao");

			m.offLogin();
			m.clsLogin();
			m.securityLogin();
	}
	
}