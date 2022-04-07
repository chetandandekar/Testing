package logicbasedprogram;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		int num=100;
		int temp=0;
		for (int i=2;i<=99;i++)
		{
			if (num%i==0)
			{
				temp=temp+i;
			}
		}
		if (temp>0)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}	
	}
}