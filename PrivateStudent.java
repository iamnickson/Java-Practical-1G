public class PrivateStudent
{
	private int m1; 
	private int m2;
	private int m3;
	private String name;
	private String regNo;
	
	public PrivateStudent()
	{
		name="Turing";
		regNo="2015J002";
		m1=80;
		m2=90;
		m3=85;
	}
	public PrivateStudent(String sname, String sregNo)
	{
		name=sname;
		regNo=sregNo;
	}
	int getm1()
	{
		return m1;
	}
	int getm2()
	{
		return m2;
	}
	int getm3()
	{
		return m3;
	}
	String getName()
	{
		return name;
	}
	String getRegNo()
	{
		return regNo;
	}
	void setMarks(int a, int b, int c)
	{
		m1=a;
		m2=b;
		m3=c;
	}
	void setName(String sname)
	{
		name=sname;
	}
	void setRegNo(String sregNo)
	{
		regNo=sregNo;
	}
}
