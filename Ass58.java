/*
1. Write Java program which accept number of rows and number of  columns from user and display below pattern.  
Input : iRow = 4 iCol = 3  
Output : * * *  
 * * *  
 * * *  
 * * *  

 2.Input : iRow = 4 iCol = 3  
Output : 
 1 2 3  
 1 2 3  
 1 2 3  
 1 2 3  
  
3.Input : iRow = 3 iCol = 5  
Output :  
 5 4 3 2 1  
 5 4 3 2 1  
 5 4 3 2 1  
  
4.Input : iRow = 3 iCol = 4  
Output : 
 * # * #  
 * # * #  
 * # * #  

5.Input : iRow = 3 iCol = 4  
Output : 1 1 1 1  
 2 2 2 2  
 3 3 3 3  
 4 4 4 4 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	void prog1(int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	
	void prog2(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
	
	void prog3(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
	void prog4(int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j%2!=0)
				{System.out.print("# ");}
				else
				{System.out.print("* ");}
			}
			System.out.println();
		}
	}
	
	void prog5(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{System.out.print(i);}
			System.out.println();
		}
	}
}

class Ass58
{
	public static void main(String args[])
	{
		
		int rows=0,columns=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter no of rows");
		rows=sobj.nextInt();
		System.out.println("enter no of columns");
		columns=sobj.nextInt();
		
		Pattern obj=new Pattern();
		//obj.prog1(rows,columns);
		//obj.prog2(rows,columns);
		//obj.prog3(rows,columns);
		//obj.prog4(rows,columns);
		obj.prog5(rows,columns);
	}
}