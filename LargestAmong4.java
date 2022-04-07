package logicbasedprogram;

public class LargestAmong4 
{
	public static void main(String[] args) 
	{
		int a=4000; int b=200000,c=30000,d=100000000;
		if(a>b & a>c & a>d)
		{
			System.out.println("a is greater "+a);
		}
		else if(b>a & b>c & b>d)
		{
			System.out.println("b is greater "+b);
		}
		else if (c>a & c>b & c>d)
		{
			System.out.println("c is greater "+c);
		}
		else
		{
			System.out.println("D is greater "+d);
		}
		
	}

}
