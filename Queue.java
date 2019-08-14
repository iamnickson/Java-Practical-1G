public class Queue
{
	int array[];
	int front,rear ;
	boolean isEmpty=false;
	
	public Queue(int n)
	{
		array= new int[n];
		front = 0;
		rear = -1;
	}
	public boolean isEmpty()
	{
		return front > rear;
	}
	public void enQueue(int elt)
	{
		array[++rear]=elt;
	}
	public int deQueue()
	{
		int Elt=array[front];
		front++;
		return Elt;
	}
	public int front()
	{
		int fElt=array[front];
		return fElt;
	}
	public int size()
	{
		int length=rear-front+1;
		return length;
	}
}