
package logicbasedprogram;

public class Primenumber {

	public static void main(String[] args) 
	{
		int num=15;
		int ref=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				ref=ref+i;
			}
		}
		if (ref>0)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}

}
