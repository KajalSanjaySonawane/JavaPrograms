//find nearest no of given no in array. e.g array is [10,20,30,40,50] and we want to find nearest no of 43 is 40 in array
import java.lang.*;
import java.util.*;

class Logic
{
	void Nearest(int Arr[],int val)
	{
			int lowestdiff=0,diff=0,lowestindex=0;
			
			lowestdiff = val-Arr[0];
			lowestindex = Arr[0];
			for(int i=1;i<Arr.length-1;i++)
			{
				diff = val-Arr[i];				
				if(diff <=0)
				{
					diff = (-1)*(diff);
				}
				if(diff < lowestdiff)
				{
					lowestdiff = diff;
					lowestindex = Arr[i];
				}
			}
			System.out.println("nearest no is :"+lowestindex);
	}
}


class Demo10
{
	public static void main(String arg[])
	{
		
		int ele=0,no=0,res=0;
		int[] arr;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("how many elemets you want to insert in array");
		ele = obj.nextInt();
		
		arr = new int[ele];
		System.out.println("enter array elements :");
		for(int i=0;i<ele;i++)
		{
			arr[i]=obj.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("entered array elemnts are:"+arr[i]);
		}
		System.out.println("enter no to find it's nearest  within array elements:");
		no = obj.nextInt();
		
		Logic lobj= new Logic();
		lobj.Nearest(arr,no);
	}
}

