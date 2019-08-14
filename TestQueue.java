import java.util.Scanner;
public class TestQueue
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of the Empty Queue");
		int na=input.nextInt();
		Queue q=new Queue(na);
		q.enQueue(5);
		q.enQueue(3);
		q.deQueue();
		q.enQueue(2);
		q.enQueue(8);
		q.deQueue();
		q.enQueue(9);
		q.enQueue(1);
		q.deQueue();
		q.enQueue(7);
		q.enQueue(6);
		q.deQueue();
		q.deQueue();
		q.enQueue(4);
		q.deQueue();
		q.deQueue();
		int l=q.size();
		for(int i=0; i<l; i++)
		{
			int element=q.deQueue();
			System.out.println(element);
		}
		System.out.println(q.size());
		System.out.println(q.isEmpty());
	}
}