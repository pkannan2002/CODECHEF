import java.util.*;
import java.lang.*;
import java.io.*;
class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int size=s.nextInt();
		    int arr[]=new int[size];
		    int units=s.nextInt();
		    for(int j=0;j<size;j++)
		    {
		        arr[j]=s.nextInt();
		    }
		    for(int j=0;j<size;j++)
		    {
		        if (units!=0)
				{
					if (arr[j]<=units)
					{
						units-=arr[j];
						System.out.print(1);
					}
					else 
					{
						System.out.print(0);
					}
				}
				else 
					{
						System.out.print(0);
					}
				System.out.println();
			}
		}
	}
}