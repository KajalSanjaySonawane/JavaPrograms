/*
1. Write java program which accept N numbers from user and accept  one another number as NO , check whether NO is present or not.  
 Input : N : 6  
 NO: 66  
 Elements : 85 66 3 66 93 88  
 Output : TRUE  


2. Write java program which accept N numbers from user and accept  one another number as NO , return index of first occurrence of that  NO.  
 Input : N : 6  
 NO: 66  
 Elements : 85 66 3 66 93 88  
 Output : 1  

3. Write java program which accept N numbers from user and accept  one another number as NO , return index of last occurrence of that NO.  
 Input : N : 6  
 NO: 66  
 Elements : 85 66 3 66 93 88  
 Output : 3  

4. Write java program which accept N numbers from user and accept  Range, Display all elements from that range  
 Input : N : 6  
 Start: 60  
 End : 90  
 Elements : 85 66 3 76 93 88  
 Output : 66 76 88  

5. Write java program which accept N numbers from user and return  product of all odd elements.  
 Input : N : 6  
 Elements : 15 66 3 70 10 88
 Output : 45  
*/
import java.lang.*;
import java.util.*;

class Number
{
	int check(int Arr[],int val)
	{
		int ans=0;
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j] == val)
			{
				ans=Arr[j];
			}
		}
		return ans;
	}
	
	int FirstOccurence(int Arr[],int val)
	{
		int ans=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i] == val)
			{
				ans=i;
				break;
			}
		}
		return ans;
	}
	
	int LastOccurence(int Arr[],int val)
	{
		int ans=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i] == val)
			{
				ans=i;
				continue;
			}
		}
		return ans;
	}
	
	void WithinRange(int Arr[],int first,int second)
	{
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i] >first) && (Arr[i]<second))
			{
				System.out.println("The values that are within range are:"+Arr[i]);
			}
		}
	}
	
	int ProductOdd(int Arr[])
	{
		int prod=1;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i] %2 != 0)
			{
				prod=prod*Arr[i];
			}
		}
		return prod;
	}
}

class Ass55
{
	public static void main(String arg[])
	{
		
		int ele=0,no=0,res=0,start=0,end=0;
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
		
		System.out.println("enter the no you want to search:");
		no = obj.nextInt();
		
		Number aobj= new Number();

		/*res = aobj.check(arr,no);		//prog 1:ass 55
		if(res == no)
		{
			System.out.println("No is found");
		}
		else
		{
			System.out.println("NO is not found in array");
		}*/
		
		/*res = aobj.FirstOccurence(arr,no);   //prog 2:ass 55
		System.out.println("First Occurence of that no found at index is :"+res);
		
		res = aobj.LastOccurence(arr,no);   //prog 3:ass 55
		System.out.println("Last Occurence of that no found at index is :"+res);
		
		System.out.println("enter start value of range");
		start=obj.nextInt();
		System.out.println("enter end val of range");
		end  = obj.nextInt();
		
		aobj.WithinRange(arr,start,end);  //prog 4:ass 55*/
		
		res=aobj.ProductOdd(arr);  //prog 5:ass 55
		System.out.println("Product of all odd elements is :"+res);
	}
	
	
}

