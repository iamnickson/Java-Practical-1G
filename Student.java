public class Student
{
	int findTotal=0;
	double calculateAverage=0.0;
	int total=0;
	int m1; 
	int m2;
	int m3; 
	int m4;
	int m5;
	String name;
	String regNo;
	
	public Student()
	{
		name="Turing";
		regNo="2015J002";
		m1=80;
		m2=90;
		m3=85;
		m4=95;
		m5=100;
	}
	public Student(String sname, String sregNo)
	{
		name=sname;
		regNo=sregNo;
	}
	public Student(String sname, String sregNo, int a, int b, int c, int d, int e)
	{
		name=sname;
		regNo=sregNo;
		m1=a;
		m2=b;
		m3=c;
		m4=d;
		m5=e;
	}
	int findTotal()
	{
		findTotal=m1+m2+m3+m4+m5;
		return findTotal;
	}
	double calculateAverage()
	{
		calculateAverage = (m1+m2+m3+m4+m5)/5;
		return calculateAverage;
	}
}
