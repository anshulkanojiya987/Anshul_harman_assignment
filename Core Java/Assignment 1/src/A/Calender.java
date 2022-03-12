package A;
import java.util.*;
public class Calender
{
	
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter year ");
			int y = scn.nextInt();
			int d=0,m=0;
			if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
			{
				System.out.println("Enter month ");
				m = scn.nextInt();
				if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
				{
					System.out.println("Enter Date ");
					d = scn.nextInt();
					if (d<31 && d>0)
					{
						d=d+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else if(d==31)
					{
						d=1;
						if (m<12 && d>0)
						{
							m=m+1;
							System.out.println(d+"/"+m+"/"+y);
						}
						else if(m==12)
						{
							m=1;
							y=y+1;
							System.out.println(d+"/"+m+"/"+y);
						}
					}
					else
					{
						System.out.println("Invalid Syntex");
					}
				}
				else if (m==4 || m==6 ||m==9 || m==11)
				{
					System.out.println("Enter Date ");
					d = scn.nextInt();
					if (d<30 && d>0)
					{
						d=d+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else if(d==30)
					{
						d=1;
						if (m<12 && d>0)
						{
							m=m+1;
							System.out.println(d+"/"+m+"/"+y);
						}
					}
					else
					{
						System.out.println("Invalid Syntex");
					}
				}
				else if (m==2)
				{
					System.out.println("Enter Date ");
					d = scn.nextInt();
					if (d<29 && d>0)
					{
						d=d+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else if(d==29)
					{
						d=1;
						m=m+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else
					{
						System.out.println("Invalid Syntex");
					}
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
			else 
			{
				System.out.println("Enter month ");
				m = scn.nextInt();
				if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
				{
					System.out.println("Enter Date ");
					d = scn.nextInt();
					if (d<31 && d>0)
					{
						d=d+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else if(d==31)
					{
						d=1;
						if (m<12 && d>0)
						{
							m=m+1;
							System.out.println(d+"/"+m+"/"+y);
						}
						else if(m==12)
						{
							m=1;
							y=y+1;
							System.out.println(d+"/"+m+"/"+y);
						}
					}
					else
					{
						System.out.println("Invalid Syntex");
					}
				}
				else if (m==4 || m==6 ||m==9 || m==11)
				{
					System.out.println("Enter Date ");
					d = scn.nextInt();
					if (d<30 && d>0)
					{
						d=d+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else if(d==30)
					{
						d=1;
						if (m<12 && d>0)
						{
							m=m+1;
							System.out.println(d+"/"+m+"/"+y);
						}
					}
					else
					{
						System.out.println("Invalid Syntex");
					}
				}
				else if (m==2)
				{
					System.out.println("Enter Date ");
					d = scn.nextInt();
					if (d<28 && d>0)
					{
						d=d+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else if(d==28)
					{
						d=1;
						m=m+1;
						System.out.println(d+"/"+m+"/"+y);
					}
					else
					{
						System.out.println("Invalid Syntex");
					}
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
		}	
}
