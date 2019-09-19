public class TestStudent
{
	public static void main(String args [])
	{
		Student s1;
		Student s2;

		s1=new Student();
		s2= new Student("Alex", "2015J001");
		Student s3=new Student("Charles", "2015J003", 85, 75 , 100, 85, 75);
		
		System.out.println("Name "+s2.name+"	Registration-Number "+s2.regNo);
		System.out.println("Name "+s1.name+"	Registration-Number "+s1.regNo+"	Total "+s1.findTotal()+"	Average "+s1.calculateAverage());
		System.out.println("Name "+s3.name+"	Registration-Number "+s3.regNo+"	Total "+s3.findTotal()+"	Average "+s3.calculateAverage());
	}
}