public class TestPoint
{
	public static void main(String args [])
	{
		Point p1=new Point();
		Point p2=new Point(2, 6);
		Point p3=new Point(7, 18);
		Point p4=new Point(3, 5);
		p1.setX(7);
		p1.setY(6);
		
		System.out.println(p1.distance(p1,p2));
		System.out.println(p2.distance(p3,p2));
		System.out.println(p4.distance(p4,p2));
	}
}