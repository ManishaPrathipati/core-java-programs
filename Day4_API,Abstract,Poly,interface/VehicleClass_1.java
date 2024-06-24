class Vehicle{

	public void drive(){
		System.out.println("We can Drive the Vehicle");
	}
}

class Bike extends Vehicle{

	public void bikeRide(){
		System.out.println("Bike is A Two Wheeler Vehicle");
	}

}

class Car extends Vehicle{

	public void ride(){
		System.out.println("Car is A Four Wheeler Vehicle");
	}
}

class VehicleClass_1{

	 public static void main(String[] args){
		Car c=new Car();
	   	    c.ride();
		    c.drive();

		Bike b=new Bike();
			b.bikeRide();
			b.drive();

		Vehicle v=new Vehicle();
			v.drive();
	}
	
}