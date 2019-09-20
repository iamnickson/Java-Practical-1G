public class TestPrivateStudent
{
	public static void main(String args [])
	{
		PrivateStudent s1=new PrivateStudent();
		PrivateStudent s2= new PrivateStudent("Alex", "2015J001");
		s2.setMarks(80, 90, 60);
		s2.setName("Alex");
		s2.setRegNo("2015J001");
		
		
		System.out.println("Name "+s1.getName()+"	Registration-Number "+s1.getRegNo()+" Marks "+s1.getm1()+" "+s1.getm2()+" "+s1.getm3());
		System.out.println("Name "+s2.getName()+"	Registration-Number "+s2.getRegNo()+" Marks "+s2.getm1()+" "+s2.getm2()+" "+s2.getm3());
	}
}