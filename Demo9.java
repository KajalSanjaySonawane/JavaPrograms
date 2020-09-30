//Lucky no Logic: [4,2,6,-3,7,5,5,10]=>in this array 2 and 10 are lucky no bcz 6-4=2 and 10-5=5 
// In simple term start from index[1] and ends on index[len-1] and nextNo-prevNo= that index no
import java.lang.*;
import java.util.*;

class Logic
{
	void Lucky(int Arr[])
	{
			for(int i=1;i<Arr.length-1;i++)
			{
				if(Arr[i] == (Arr[i+1] - Arr[i-1]))
				{
					System.out.println("Lucky no is: "+Arr[i]);
				}
			}
	}
}


class Demo9
{
	public static void main(String arg[])
	{
		
		int ele=0,res=0;
		int[] arr;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("how many elemets you want to insert in array");
		ele = obj.nextInt();
		
		arr = new int[ele];
		for(int i=0;i<ele;i++)
		{
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("entered array elemnts are:"+arr[i]);
		}
		Logic lobj= new Logic();
		lobj.Lucky(arr);
	}
}

