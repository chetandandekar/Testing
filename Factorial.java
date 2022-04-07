package logicbasedprogram;

public class Factorial 
{

	public static void main(String[] args) //5!=5*4*3*2*1=120
	{
		int factorial=1; 
		for (int i=1;i<=5;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Value of 5! is "+factorial);
	}

}
