package logicbasedprogram;

public class AddEvenOdd {

	public static void main(String[] args) 
	{

		int sum=0;
		int add=0;
		for (int i=1;i<=4;i++)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
			
			else
			{
				add=add+i;
			}
		}
		System.out.println("Sum of odd number is "+add);
		System.out.println("Sum of even number is "+sum);
	}

}
