
package logicbasedprogram;

public class PallindromeNo {

	public static void main(String[] args) 
	{
		int num=115511;
		int n=num;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if (sum==num)
		{
			System.out.println("Number is Pallindrome");
		}
		else
		{
			System.out.println("number is not a pallindrome number");
		}
	}

}
