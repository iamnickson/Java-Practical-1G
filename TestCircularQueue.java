import java.util.Scanner;
public class TestCircularQueue
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of the Empty Queue");
		int na=input.nextInt();
		CircularQueue qq=new CircularQueue(na);
		qq.enQueue(10);
		qq.enQueue(20);
		qq.deQueue();
		qq.enQueue(30);
		qq.enQueue(40);
		qq.deQueue();
		qq.enQueue(50);
		qq.enQueue(60);
		for(int i=0; i<na; i++)
		{
			int element=qq.deQueue();
			System.out.println(element);
		}
		System.out.println(qq.size());
	}
}