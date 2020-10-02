/*
1.Write a Java program which accept string from user and count  number of capital characters.  
Input : “Marvellous Multi OS”  
Output : 4 

2. Write a java program which accept string from user and count  number of small characters.  
Input : “Marvellous”  
Output : 9  

3. Write a java program which accept string from user and return  difference between frequency 
of small characters and frequency  of capital characters.
Input : “MarvellouS”  
Output : 6 (8-2)

4. Write a java program which accept string from user and check  whether it contains vowels in it or not.  
Input : “marvellous”  
Output : TRUE  
Input : “Demo”  
Output : TRUE
Input : “xyz”  
Output : FALSE  

5. Write a java program which accept string from user and display  it in reverse order.  
Input : “MarvellouS”  
Output : “SuollevraM”
*/

import java.lang.*;
import java.util.*;

class StringDemo
{
	int countCapital(char str[])
	{
		int countCapital=0,countLow=0;
		for(int i=0;i<str.length;i++)
		{
			if((str[i]>='A') && (str[i]<='Z'))
			{
				System.out.println("capital letters from string"+str[i]);
				countCapital++;
			}				
			else
			{
				System.out.println("Lower letters from string"+str[i]);
				countLow++;
			}
		}
		//return countLow;  // prog 1:ass56
		//return countCapital;  //prog 2:ass56
		return countLow-countCapital;  //prog 3:ass56
	}
	
	boolean CheckVowel(char str[])
	{
		int countVowel=0,countconsonants=0;
		for(int i=0;i<str.length;i++)
		{
			if((str[i]=='a') || (str[i] =='e')|| (str[i] =='i')|| (str[i] =='o')|| (str[i] =='u')|| (str[i] =='A')|| (str[i] =='E')|| (str[i] =='O')|| (str[i] =='I')|| (str[i] =='U'))
			{
				System.out.println("vowel in string are :"+str[i]);
				countVowel++;
			}				
			else
			{
				System.out.println("consonants in string are :"+str[i]);
				countconsonants++;
			}
		}
		if(countVowel>1)
		{
			return true;
		}
		else
		{return false;
		}
	}
	
	void reverse(char str[])
	{
		int j=0;
		int i=str.length-1;
		for(j=0;j<i;j++)
		{
			char temp=str[j];
			str[j]=str[i];
			str[i]=temp;
			i--;
		}
		for(char c:str)
			System.out.print(c);
		System.out.println();
	}
	
}


class Ass56
{
	public static void main(String args[])
	{	
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a string");
		String str = obj.nextLine();
		System.out.println("string is: "+str);
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("separate array is :"+ch[i]);
		}
		
		StringDemo sobj=new StringDemo();
		//int res=sobj.countCapital(ch);  //prog 1,2,3:ass56
		//System.out.println("Count of capital letters in string is :"+res);
		
		/*boolean ans=sobj.CheckVowel(ch);		//prog 4:ass56
		if(ans == true)
		{System.out.println("String conatians vowels ");}
		else{System.out.println("String conatins no vowels");}*/
		
		sobj.reverse(ch);  //prog 5:ass56
	}
}

