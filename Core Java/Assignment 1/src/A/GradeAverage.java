package A;
import java.util.*;
public class GradeAverage
{
	public static void main (String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = scn.nextInt();
		n = n+1;
		int a[];
		int t=0;
		a = new int[n];
		for(int i=1; i<n; i++)  
		{  
			System.out.print("Enter the Grade of "+i+" Student");  
		    a[i]=scn.nextInt(); 
		    if (a[i]>100 || a[i]<0)
		    {
		    	System.out.println("Invalid Input try again");
			    i--;
		      }
		    else
		    {
		    	t=t+a[i];
		      }
		  }
		System.out.println(" ");
		n=n-1;
		System.out.println("The average is: "+t/n);
	}
}
