package logicbasedprogram;

public class Hcf {
	public static void main(String[] args) 
	{
		int a=12; int b=30;
		int hcf=0;                                             
		for (int i=1;i<=a || i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;	  // hcf=6
			}	
		}
		System.out.println("Hcf is "+hcf);
	}
}
