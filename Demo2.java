import java.lang.*;
import java.util.*;

class arithmetic
{
	int add(int no1,int no2)
	{
		int res=0;
		res = no1 + no2;
		return res;
	}
	
}
class Demo2
{
	public static void main(String arg[])
	{
		int val1=0,val2=0,ret=0;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter first no");
		val1 = obj.nextInt();
		
		System.out.println("enter Second no");
		val2 = obj.nextInt();
		
		arithmetic obj1 = new arithmetic();
		ret = obj1.add(val1,val2);
		
		System.out.println("addition is : "+ret);
		
		
	}
}		
