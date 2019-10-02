import java.util.Scanner;
public class FriendsPairs
{
	public static void main(String args[])
	
	{
		Scanner input=new Scanner(System.in);
		char [][] Array =new char [6][6];
		
		Array [0][0]='#';
		Array [0][1]='A';
		Array [0][2]='B';
		Array [0][3]='C';
		Array [0][4]='D';
		Array [0][5]='E';
		
		Array [1][0]='F';
		Array [1][1]='*';
		Array [1][2]='0';
		Array [1][3]='*';
		Array [1][4]='0';
		Array [1][5]='*';
		
		Array [2][0]='G';
		Array [2][1]='*';
		Array [2][2]='*';
		Array [2][3]='0';
		Array [2][4]='*';
		Array [2][5]='*';
		
		Array [3][0]='H';
		Array [3][1]='*';
		Array [3][2]='0';
		Array [3][3]='*';
		Array [3][4]='0';
		Array [3][5]='0';
		
		Array [4][0]='I';
		Array [4][1]='*';
		Array [4][2]='0';
		Array [4][3]='0';
		Array [4][4]='*';
		Array [4][5]='*';
		
		Array [5][0]='J';
		Array [5][1]='*';
		Array [5][2]='0';
		Array [5][3]='*';
		Array [5][4]='0';
		Array [5][5]='*';
		
		
		for (int i=0;i<6;i++)
			
			{
				for(int j=0;j<6;j++)
				{
					System.out.print(" "+Array[i][j]);
				}
				System.out.println();
				
				
				if Array[i][j]=='*'
				{
				System.out.print(" "+i," "+j);
				}
				
				
				
				
				
				
				
			}
		
		
	}
	
	
	
}