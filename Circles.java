public class Circles
{
	double radius;
	String colour;
	
	
	public Circles()
	{
		radius=1.0;
		colour="Red";
	}
	public Circles(double r)
	{
		radius=r;
		colour="Blue";
	}
	public Circles(double r, String c)
	{
		radius=r;
		colour=c;
	}
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
