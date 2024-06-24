class Shape{

	public void shape(){
		System.out.println("We have Different types of Shapes in Geometry");
	}
}

class Circle extends Shape{
	float radius;

	Circle(float rad){
		this.radius=rad;
	}
	public void circleArea(){
		System.out.println("Area of Circle is: " + (2*3.14*this.radius*this.radius));
	}

}

class Square extends Shape{

	float side;

	Square(float side){
		this.side=side;
	}
	public void squareArea(){
		System.out.println("Area of Square is: " + (this.side * this.side));
	}
}

class ShapeInterface_1{

	 public static void main(String[] args){
		Square s=new Square(12);
	   	    s.squareArea();
		    s.shape();

		Circle c=new Circle(4);
			c.circleArea();
			c.shape();

		Shape sh=new Shape();
			sh.shape();
	}
	
}