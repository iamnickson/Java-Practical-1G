public class TestCircle
{
	public static void main(String args [])
	{
		Circle c1;
		Circle c2;
		
		c1=new Circle();
		c2= new Circle();
		Circle c3=new Circle();
		
		c1.radius=35.7; 
		c1.colour="Red";
		c2.radius=14; 
		c2.colour="Blue";
		c3.radius=21;
		c3.colour="Green";
		

		System.out.println("Circle c1: Colour "+c1.colour+" radius "+c1.radius+" area "+c1.findArea()+" Circumference "+c1.findPerimeter());
		System.out.println("Circle c2: Colour "+c2.colour+" radius "+c2.radius+" area "+c2.findArea()+" Circumference "+c2.findPerimeter());
		System.out.println("Circle c3: Colour "+c3.colour+" radius "+c3.radius+" area "+c3.findArea()+" Circumference "+c3.findPerimeter());
		
	}
}