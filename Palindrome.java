public class Palindrome
{
	char Stack[];
	char Queue[];
	int front,rear, top;
	boolean isQueueEmpty;
	boolean isStackEmpty;
	
	public Palindrome(int n)
	{
		Queue= new char[n];
		Stack=new char[n];
		front = 0;
		rear = -1;
		top=-1;
	}
	public boolean isQueueEmpty()
	{
		return front > rear;
	}
	public boolean isStackEmpty()
	{
		if(top!=Stack.length-1)
			isStackEmpty= false;
		return isStackEmpty;
	}
	public void enQueue(char elt)
	{
		Queue[++rear]=elt;
	}
	public char deQueue()
	{
		char Elt=Queue[front];
		front++;
		return Elt;
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
	public char front()
	{
		return Queue[front];
	}
	public char peek()
	{
		return Stack[top];
	}
	public int length()
	{
		return rear-front+1;
	}
	public int size()
	{
		return top+1;
	}
}