import java.lang.*;
import java.util.*;

class ArrDemo
{
	int Difference(int Arr[])
	{
		int sumEven=0,sumOdd = 0;
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j] %2 == 0)
			{
				sumEven = sumEven + Arr[j];
			}
			else
			{
				sumOdd = sumOdd + Arr[j];
			}
		}
		return sumEven - sumOdd;
	}
	
	void Divisible(int Arr[])
	{
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j] %5 == 0)
			{
				System.out.println("The no's which are divisible by 5 are :"+Arr[j]);
			}
		}
	}
	
	void DivisibleEven(int Arr[])
	{
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j] %5 == 0 && Arr[j] %2 == 0)
			{
				System.out.println("The no's which are divisible by 5 are :"+Arr[j]);
			}
		}
	}
}

class Demo6
{
	public static void main(String arg[])
	{
		
		int ele=0,res=0;
		int[] arr;	//initialize array
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("how many elemets you want:");
		ele = obj.nextInt();
		
		System.out.println("enter the elemets: \n");
		arr = new int[ele]; 	//allocate size to array
		for(int i=0;i<ele;i++)
		{
			arr[i] = obj.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("entered ele are:"+arr[i]);
		}
		
		ArrDemo aobj= new ArrDemo();
		//res = aobj.Difference(arr);   prog 1:ass 53
		//System.out.println("Difference between summation of even and summation of Odd elements is : "+res);
		//aobj.Divisible(arr);  prog 2:ass 53
		aobj.DivisibleEven(arr);	//prog 3:ass 53
		
		
		
	}
	
	
}

