package A;
import java.util.*;
public class CopyOfArray {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scn.nextInt();
		int a1[]=new int[n];
		System.out.println("Enter the elements in first array");
		for (int i=0;i<n;i++)
		{
			a1[i]=scn.nextInt();
		}
		int []a2=Arrays.copyOf(a1,n);
		System.out.println("Elements in second array ");
		for (int i=0;i<n;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}

}
