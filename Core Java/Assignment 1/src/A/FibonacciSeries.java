package A;
import java.util.*;
public class FibonacciSeries {
	public static void main (String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter number of series");
		int i = scn.nextInt();
		int n1=1,n2=1,n3,j; 
		float n=0;
		 if (i == 1)
		 {
			 System.out.print("The first "+i+" Fibonacci numbers are: ");
			 System.out.println(n1);
			 System.out.println("The average is "+n1/i);
			 }   
		 else if (i == 2)
		 {
			 System.out.print("The first "+i+" Fibonacci numbers are: ");
		     System.out.println(n1+" "+n2);  
		     n = n1 +n2;
		     System.out.println("The average is "+n/i);
		  }  
		 else 
		 { 
	     System.out.print("The first "+i+" Fibonacci numbers are: ");	 
		 System.out.print(n1+" "+n2); 
		 n=n1+n2;
		 for(j=2;j<i;++j)  
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3); 
		  n=n+n3;
		  n1=n2;    
		  n2=n3;    
		 }  
		 System.out.println(" ");
		 System.out.println("The average is "+n/i);
		  }
		}
		

	}


