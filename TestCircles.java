public class TestCircles
{
	public static void main(String args [])
	{
		Circles c1;
		Circles c2;
		
		c1=new Circles();
		c2= new Circles(7);
		Circles c3=new Circles(14, "Black");
		
		

		System.out.println("Circle c1: Colour "+c1.colour+" radius "+c1.radius+" area "+c1.findArea()+" Circumference "+c1.findPerimeter());
		System.out.println("Circle c2: Colour "+c2.colour+" radius "+c2.radius+" area "+c2.findArea()+" Circumference "+c2.findPerimeter());
		System.out.println("Circle c3: Colour "+c3.colour+" radius "+c3.radius+" area "+c3.findArea()+" Circumference "+c3.findPerimeter());
		/* System.out.println("Circle c2: Radius "+c2.radius); */
	}
}