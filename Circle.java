public class Circle
{
	double radius;
	String colour;
	double getRadius()
	{
		return radius;
	}
	double findArea()
	{
		return (22/7)*radius*radius;
	}
	double findPerimeter()
	{
		return 2*(22/7)*radius;
	}
}
