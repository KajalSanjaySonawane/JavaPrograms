//write a program which calculate even fact ip: 7 op: 2*4*6
import java.lang.*;
import java.util.*;

class fact
{
	int evenfact(int val1)
	{
		int cnt=1;
		for(int i=1;i<val1;i++)
			{
				if(i % 2==0)
				{
					cnt = i * cnt;
					//System.out.println("even fact are :"+cnt);
				}
				
			}
		return cnt;
		
	}
	
	
}
class Demo3
{
	public static void main(String arg[])
	{
		int no1=0,res =0;
		Scanner obj= new Scanner(System.in);
		
		System.out.println("enter no for factorial");
		no1 = obj.nextInt();
		
		fact fobj= new fact();
		res = fobj.evenfact(no1);
		
		System.out.println("Multiplication of even fact of given no is "+res);
	}
	
}
