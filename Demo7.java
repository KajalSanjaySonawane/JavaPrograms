//1.Armstrong no Logic : 153 = len(153)=3 => 1^3  + 5^3  + 3^3 => 1 + 125+27 => 153 
import java.lang.*;
import java.util.*;

class Logic
{
	int cnt=0,r=0;
	
	void length(int val)
	{
		while(val != 0)
		{
			r=val%10;
			cnt++;
			val=val/10;
		}
		System.out.println("length of no is :"+cnt);
	}
	int Armstrong(int val)
	{
		int ans=1,sum=0;
		
		while(val != 0)
		{
			r= val%10;
			ans=1;
			for(int j=1;j<=cnt;j++)
			{
				ans=ans*r;
				System.out.println("ans value is :"+ans);
			}
			val = val/10;
			sum = sum+ans;
			
		}
		return sum;
	}
}

class Demo7
{
	public static void main(String arg[])
	{
		
		int no=0,res=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the number :");
		no = obj.nextInt();
		
		Logic aobj= new Logic();
		aobj.length(no);
		res = aobj.Armstrong(no);
		if(res == no)
		{
			System.out.println("given no is armstrong"+res);
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}
	
	
}

