import java.util.Arrays;
import java.util.Scanner;
class RotateArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[]myArray=new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++)
		{
			myArray[i]=sc.nextInt();
		}
		System.out.println("contents of array:"+Arrays.toString(myArray));
		int temp=myArray[size-1];
		for(int i=size-1;i<0;i--)
		{
			myArray[i]=myArray[i-1];
		}
		myArray[0]=temp;
		System.out.println("content of the cycled array:"+Arrays.toString(myArray));
	}
}