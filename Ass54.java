/*
1.Write a java program which accept number from user and return the  count of even digits.  
Input : 2395  
Output : 1  
Input : 1018  
Output : 2  

2.Write a program which accept number from user and return the  count of odd digits.  

3.Write a program which accept number from user and return the  count of digits in between 3 and 7.  

4.Write a program which accept number from user and return  multiplication of all digits.  
Input : 2395  
Output : 270  

5.Write a program which accept number from user and return  difference between summation of even digits and summation of odd  digits.  
Input : 2395  
Output : -15 (2 - 17)  
Input : 1018  
Output : 6 (8 - 2)  
Input : 8440  
Output : 16 (16 - 0)  
Input : 5733  
Output : -18 (0 - 18)  

*/import java.lang.*;
import java.util.*;

class Digit
{
	int CountEven(int val)
	{
		int cnt=0;
		while(val != 0)
		{
			//r= val%10;
			if((val%10) %2 == 0)
			{
				cnt++;
			}
			val = val /10;
		}
		return cnt;
	}
	
	int CountOdd(int val)
	{
		int cnt=0;
		while(val != 0)
		{
			//r= val%10;
			if((val%10) %2 != 0)
			{
				cnt++;
			}
			val = val /10;
		}
		return cnt;
	}
	
	int Count3_7(int val)
	{
		int cnt =0;
		while(val != 0)
		{
			if(((val%10) >3) && ((val%10)<7))
			{
				cnt++;
			}
			val = val/10;
		}
		return cnt;
	}
	
	int DigitMulti(int val)
	{
		int mul=1,r=0,sumEven=0,sumOdd=0;
		while(val != 0)
		{	
			r=val%10;
			if(r%2 == 0)
			{
				sumEven=sumEven+r;
			}
			else
			{
				sumOdd=sumOdd+r;
			}
			val = val/10;
		}
		return sumEven-sumOdd;
	}
}

class Ass54
{
	public static void main(String arg[])
	{
		
		int no=0,res=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the number :");
		no = obj.nextInt();
		
		Digit aobj= new Digit();

		//res = aobj.CountEven(no); //prog 1:ass 54
		//System.out.println("count of even digits in number are:"+res);
		
		//res = aobj.CountOdd(no);	//prog 2:ass 54
		//System.out.println("count of odd digits in number are:"+res);
		
		//res = aobj.Count3_7(no); 	//prog 3:ass 54
		//System.out.println("count of digit in between 3 to 7 are :"+res);
		
		//res = aobj.DigitMulti(no); 	//prog 4:ass 54
		//System.out.println("multiplication of entered each digit is :"+res);
		
		res=aobj.DigitMulti(no); //prog 5:ass 54
		System.out.println("Difference between summation of even digits and summation of odd digits is:"+res);
	}
	
	
}

