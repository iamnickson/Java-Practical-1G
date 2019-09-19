public class Point
{
	int X;
	int Y;
	
	public Point()
	{
		X=0;
		Y=0;
	}
	public Point(int x, int y)
	{
		X=x;
		Y=y;
	}
	int getX(){
		return X;
	}
	int getY(){
		return Y;
	}
	int [] getXY()
	{
		int[] P1={X,Y};
		return P1;
	}
	void setX(int x)
	{
		X=x;
	}
	void setY(int y)
	{
		Y=y;
	}
	double distance(Point a, Point b)
	{
		double Distance=Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2));
		return Distance;
	}
	/* double distance(Point a, Point b)
	{
		
	} */
}
