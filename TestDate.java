public class TestDate
{
	public static void main(String args [])
	{
		Date d1=new Date();
		Date d2=new Date();
		d2.setDate(5, 15, 1960);
		
		System.out.println(d2.ToString());
		System.out.println(d1.ToString());
	}
}