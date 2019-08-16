public class CircularQueue
{
	int array[];
	int front,rear ;
	boolean isEmpty=false;
	boolean isFull=false;
	int Elt;
	
	public CircularQueue(int n)
	{
		array= new int[n];
		front = 0;
		rear = -1;
	}
	public void enQueue(int elt)
	{
		array[++rear]=elt;
		if((rear==(array.length-1)) && front>0)
		{
			rear=-1;
		}
	}
	public int deQueue()
	{
		Elt=array[front];
		front++;
		if(front==array.length)
		{
			front=0;
		}
		else if(front==rear)
		{
			System.out.println("All printed");
		}
		return Elt;
	}
	public int front()
	{
		int fElt=array[front];
		return fElt;
	}
	public int size()
	{
		if(rear<front)
		{
			return array.length-front+rear+1;
		}
		else
		{
			return rear-front+1;
		}
	}
}