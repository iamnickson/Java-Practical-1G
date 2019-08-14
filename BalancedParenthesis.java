public class BalancedParenthesis
{
	char Stack[];
	int top;
	boolean isEmpty=false;
	
	public BalancedParenthesis(int n)
	{
		Stack=new char[n];
		top=-1;
	}
	public boolean isEmpty()
	{
		if(top==-1)
			isEmpty= true;
		return isEmpty;
	}
	public void push(char elt)
	{
		Stack[++top]=elt;
	}
	public char pop()
	{
		char elt=Stack[top];
		top=top-1;
		return elt;
	}
	public char peek()
	{
		return Stack[top];
	}
	public int size()
	{
		return top+1;
	}
}