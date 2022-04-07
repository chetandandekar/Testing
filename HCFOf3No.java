package logicbasedprogram;

public class HCFOf3No {

	public static void main(String[] args) 
	{
		int a=42, b=21, c=84;
		int hcf=0;
		for(int i=1; i<7 || i<22 || i<67; i++)
		{
			if (a%i==0 & b%i==0 & c%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("Hcf is "+hcf);
	}
}
