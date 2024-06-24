class Animal{
	private String anm1;
	private String anm2;
	private String anm3;

	public void setAnm1(String anm1){
		this.anm1=anm1;
	}
	public String getAnm1(){
		return this.anm1;
	}

	public void setAnm2(String anm2){
		this.anm2=anm2;
	}
	public String getAnm2(){
		return this.anm2;
	}

	public void setAnm3(String anm3){
		this.anm3=anm3;
	}
	public String getAnm3(){
		return this.anm3;
	}
}

class Lion extends Animal{
	private String name;
		
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void displayAnimal(){
		if((super.getAnm1().equals(this.name)) || (super.getAnm2().equals(this.name)) || (super.getAnm3().equals(this.name))){
			System.out.println("Lion is the King of all Animals");
		}
		else{
			System.out.println(super.getAnm1() + " is Fear of " + this.name);
			System.out.println(super.getAnm2() + " is Fear of " + this.name);
			System.out.println(super.getAnm3() + " is Fear of " + this.name);
		}
	}
}

class AnimalKingdom{
	public static void main(String[] args){
		
		Lion l=new Lion();
			l.setAnm1("Deer");
			l.setAnm2("Tiger");
			l.setAnm3("Ziraffee");
			l.setName("Lion");
			l.displayAnimal();
	}
}