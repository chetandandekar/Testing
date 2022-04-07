package logicbasedprogram;

public class HcfOf2No 
{
	public static void main(String[] args) 
	{
		int x=20, y=40;
		int hcf=0;
		for (int i=1;i<21 || i<41;i++)
		{
			if(x%i==0 & y%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("HCF is "+hcf);
	}
}
