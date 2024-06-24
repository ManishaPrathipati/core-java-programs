class Shape{
	private double side;
	
	public void setSide(double side){
		this.side=side;
	}
	public double getSide(){
		return this.side;
	}
}

class TwoDimension extends Shape{
	private double radius;
	private double length;
	private double breadth;
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return this.radius;
	}

	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return this.length;
	}
	
	public void setBreadth(double breadth){
		this.breadth=breadth;
	}
	public double getBreadth(){
		return this.breadth;
	}

	public void areaOfCircle(){
		if(super.getSide()==2)
		System.out.println("Area of Circle is: " + (2*3.14*this.radius*this.radius));
	}
	
	public void areaOfRectangle(){
		if(super.getSide()==2)
		System.out.println("Area of Rectangle is: " + (this.length*this.breadth));
	}
}

class ThreeDimension extends Shape{

	private double side;

	public void setSide(double side){
		this.side=side;
	}
	public double getSide(){
		return this.side;
	}

	public void areaOfCube(){
		if(super.getSide()==3)
		System.out.println("Area of Cube is: " + (6*this.side*this.side));
	}
	
}

class ShapeHierarchy{

	 public static void main(String[] args){

		TwoDimension td=new TwoDimension();
			td.setSide(2);
			td.setRadius(3);
			td.setLength(4);
			td.setBreadth(5);
			td.areaOfCircle();
			td.areaOfRectangle();
		ThreeDimension td1=new ThreeDimension();
			td1.setSide(2);
			td1.setSide(2);
			td1.areaOfCube();
		
	}
	
}