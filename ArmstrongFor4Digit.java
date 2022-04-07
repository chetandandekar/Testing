package logicbasedprogram;

public class ArmstrongFor4Digit 
{
	public static void main(String[] args) 
	{
		int num=1634;
		int rvariable=num;
		int sum=0;
		while (num>0)
		{
			int r=num%10;
			sum=sum+r*r*r*r;
			num=num/10;
		}
		if(rvariable==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
