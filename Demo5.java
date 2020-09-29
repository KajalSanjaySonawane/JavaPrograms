//accept no from user and check that no is strong or not

//input: 145 = 1! + 4! + 5!  = 145
import java.lang.*;
import java.util.*;

class strong
{
	int checkStrong(int val1)
	{
		int r=0,sum = 0;
		while(val1 != 0)
		{
			r=val1%10;
			int cnt=1;
			for(int i=1;i<=r;i++)
			{
				cnt = i * cnt;
				
			}
			val1 = val1 /10;
			sum = cnt + sum;
							
		}
		return sum;
	}
}
class Demo5
{
	public static void main(String arg[])
	{
		int no1=0,res =0;
		Scanner obj= new Scanner(System.in);
		
		System.out.println("enter no to check strong or not");
		no1 = obj.nextInt();
		
		strong sobj= new strong();
		res = sobj.checkStrong(no1);
		
		if(res == no1)
		{
			System.out.println("NO IS STRONG : "+res);
		}
	}
	
}
