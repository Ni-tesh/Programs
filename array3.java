import java.util.*;
class Test
{
public static void main(String[] args)
  {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number of rows:");
	int r=in.nextInt();
	System.out.println("Enter no. of coloumn:");
	int c=in.nextInt();
	int[][] array=new int[r][c];
	System.out.println("Enter values:");
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array.length;j++)
		{
			array[i][j]=in.nextInt();
		}
 	}
      System.out.println("-------");
      for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[i][j]);
		}
	System.out.println("-----");
	}
     }
} 
