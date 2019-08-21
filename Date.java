public class Date
{
	private int day;
	private int month;
	private int year;

	public Date()
	{
		day=28;
		month=10;
		year=1985;
	}
	void setDate(int dd, int mm, int yyyy)
	{
		day=dd;
		month=mm;
		year=yyyy;
	}
	int getDay()
	{
		return day;
	}
	int getMonth()
	{
		return month;
	}
	int getYear()
	{
		return year;
	}
	String ToString()
	{
		if(day>31 || month>12)
		{
			String date ="Recheck the date";
			return date;
		}
		else if(day<10 || month<10)
		{
			String date ="0"+day+" 0"+month+" "+year;
			return date;
		}
		else
		{
			String date =day+" "+month+" "+year;
			return date;
		}
		return "";
	}
}
