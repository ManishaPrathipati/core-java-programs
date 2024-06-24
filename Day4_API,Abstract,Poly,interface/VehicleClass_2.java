class Vehicle{

	public void drive(){
		System.out.println("We can Drive the Vehicle");
	}
}

class Bike extends Vehicle{
	String name;
	String brand;
	double speed;

	public Bike(String name, String brand, double speed){
		this.name=name;
		this.brand=brand;
		this.speed=speed;
	}

	public void bikeRide(){
		System.out.println("Ride Your Favourite " + this.name + " bike of " + this.brand + " with " + this.speed + " KMPH speed" );
	}

}

class Car extends Vehicle{

	String name;
	String brand;
	String colour;

	public Car(String name, String brand, String colour){
		this.name=name;
		this.brand=brand;
		this.colour=colour;
	}

	public void rideCar(){
		System.out.println("Would You like to drive " + this.name + " Car of " + this.brand + " with " + this.colour + " Colour" );
	}

}

class VehicleClass_2{

	 public static void main(String[] args){
		Car c=new Car("Duster", "Renault", "Grey");
	   	    c.rideCar();
		    c.drive();

		Bike b=new Bike("Fascino", "Yamaha", 40.0);
			b.bikeRide();
			b.drive();

		Vehicle v=new Vehicle();
			v.drive();
	}
	
}