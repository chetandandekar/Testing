package logicbasedprogram;

public class LargestAmong3 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		if (a>b & a>c)
		{
			System.out.println("larger number is "+a);
		}
		else if (b>a & b>c)
		{
			System.out.println("larger number is "+b);
		}
		else
		{
			System.out.println("larger number is "+c);
		}
	}

}
