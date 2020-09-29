//accept range from user and print strong no only
 
//input: 145 = 1! + 4! + 5!  = 145,   40585    
import java.lang.*;
import java.util.*;

class strong
{
	void checkStrong(int val1,int val2)
	{
		
		int sum = 0;
		if(val1>val2)
		{
			
			System.out.println("1st outside LOOP");
			return;
		}
		if(val1<=0 && val2<=0)
		{
			
			System.out.println("2nd outside LOOP");
			return;
		}
		
		for(int j=val1;j<=val2;j++)
		{
			//System.out.println("IN LOOP");
			int temp=j;
			sum =0;
			while(temp != 0)
			{
				int r=temp%10;
				int cnt=1;
				for(int i=1;i<=r;i++)
				{
					cnt = i * cnt;
					//System.out.println("no is "+cnt);
				}
				temp = temp/10;
				sum = cnt + sum;
				/*if(sum>j)
				{
					break;
				}
				
			}
			if(j == sum)
			{
				System.out.println("strong no in range are : "+j);
			}
			/*else
			{
				System.out.println("Not Strong no");
			}*/
		}
	}
}

class Demo4
{
	public static void main(String arg[])
	{
		int no1=0,no2 = 0,res =0;
		Scanner obj= new Scanner(System.in);
		
		System.out.println("enter start value");
		no1 = obj.nextInt();
		
		System.out.println("enter end value");
		no2 = obj.nextInt();
		
		strong sobj= new strong();
		sobj.checkStrong(no1,no2);
		
		//System.out.println("fact of every digit of given no is "+res);
	}
	
}
