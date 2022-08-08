import java.util.Scanner;
public class Transpose
{
	public static void main(String args[])
	{
		int i,j;
		System.out.println("enter total rows and columns");
		Scanner s= new Scanner(System.in);
		int row=s.nextInt();
		int column =s.nextInt();
		int array[][]=new int[row][column];
		System.out.println("enter matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				array[i][j]=s.nextInt();
				System.out.println(" ");
			}
		}
		System.out.println("the above matrix before Tranpose is ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.println(array[i][j]+" ");
			}
				System.out.println(" ");
			}
		System.out.println("the above matrix after Tranpose is");
		for(i=0;i<column;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.println(array[j][i]+" ");
				System.out.println(" ");
			}
		}
	}
}
