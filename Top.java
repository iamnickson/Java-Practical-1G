public class Top
{
	int Stack[];
	int top=0;
	int low=0;
	int a;
	int i=0;
	boolean isEmpty=false;

	public Top(int n)
	{
		Stack=new int[n];
		a=n;
	}
	public boolean isEmpty()
	{
		if(size()==0)
			isEmpty= true;
		return isEmpty;
	}
	public void push(int elt)
	{
		if(low==0)
		{
			Stack[top]=elt;
			low=low+1;
		}
		else
		{
			for(int i=low; i>0; i--)
			{
				Stack[i]=Stack[i-1];
			}
			Stack[top]=elt;
			low=low+1;
		}
	}
	public int pop()
	{
		int elt=Stack[top];
		for(i=0; i<a-1; i++)
		{
			Stack[i]=Stack[i+1];
		}
		low=low-1;
		return elt;
	}
	public int peek()
	{
		return Stack[top];
	}
	public int size()
	{
		return low-1;
	}
}