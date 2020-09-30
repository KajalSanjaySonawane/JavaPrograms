//Fibonnacci series Logic: 0+1+1+2+3+5+8+13+21+34+......
import java.lang.*;
import java.util.*;

class Logic
{
	void Fibonacci(int val)
	{
		int first=0,second=1,third=0;
			for(int i=1;i<=val;i++)
			{
				while(first<=val)  // this condition tells that if you want fibonnacci series less than given no
				{
				System.out.println("fibonacci series is :"+first);
				third=first+second;
				first=second;
				second=third;
				}
			}
	}
}


class Demo8
{
	public static void main(String arg[])
	{
		
		int no=0,res=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the number upto you want fibonacci series :");
		no = obj.nextInt();
		
		Logic lobj= new Logic();
		lobj.Fibonacci(no);
	}
}

