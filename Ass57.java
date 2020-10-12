/*1. Write Java program which accept number of rows and number of columns  from user and display below pattern.  
Input : iRow = 4 iCol = 4  
Output : A B C D  
 A B C D  
 A B C D  
 A B C D  

 2. Write Java program which accept number of rows and number of columns  from user and display below pattern.  
Input : iRow = 4 iCol = 4  
Output : A B C D  
 a b c d  
 A B C D  
 a b c d  

 3. Write Java program which accept number of rows and number of columns  from user and display below pattern.  
Input : iRow = 3 iCol = 5  
Output : A A A A A  
		 B B B B B 
		 C C C C C  

4.Input : iRow = 4 iCol = 5  
Output :
 4 4 4 4 4  
 3 3 3 3 3  
 2 2 2 2 2  
 1 1 1 1 1 
 
 5.
 Input : iRow = 3 iCol = 4  
Output : 1 2 3 4  
 5 6 7 8  
 9 10 11 12  */
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
				if(j==0)
				{
					System.out.print("A");
				}
				else if(j==1)
				{
					System.out.print("B");
				}
				else if(j==2)
				{
					System.out.print("C");
				}
				else if(j==3)
				{
					System.out.print("D");
				}
			}
			System.out.println();
		}
	}
	
	void prog2(int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i%2==0)
				{
				if(j==0)
				{System.out.print("A");}
				else if(j==1)
				{System.out.print("B");}
				else if(j==2)
				{System.out.print("C");}
				else if(j==3)
				{System.out.print("D");}
				}
				else{
					if(j==0)
				{System.out.print("a");}
				else if(j==1)
				{System.out.print("b");}
				else if(j==2)
				{System.out.print("c");}
				else if(j==3)
				{System.out.print("d");}
				}
			}
			System.out.println();
		}
	}
	
	void prog3(int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0)
				{
					System.out.print("A");
				}
				else if(i==1)
				{
					System.out.print("B");
				}
				else if(i==2)
				{
					System.out.print("C");
				}
				else if(i==3)
				{
					System.out.print("D");
				}
			}
			System.out.println();
		}
	}
	
	void prog4(int row,int col)
	{
		for(int i=0;i<row;i++)   //for(int i=4;i>row;i--) alternate way and print(i) directly
		{
			for(int j=0;j<col;j++)
			{
				/*if(i==0)
				{
					System.out.print(4);
				}
				else if(i==1)
				{
					System.out.print(3);
				}
				else if(i==2)
				{
					System.out.print(2);
				}
				else if(i==3)
				{
					System.out.print(1);
				}*/
				
				System.out.print(row-i);
			}
			System.out.println();
		}
	}
	
	void prog5(int row,int col)
	{
		int counter=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{				
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
	}
}

class Ass57
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