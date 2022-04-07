package logicbasedprogram;

public class Lcm 
{
	public static void main(String[] args) 
	{
		int a=44, b=84;
		int hcf=0;
		for(int i=1; i<45 || i<85
				;i++)
		{
			if(a%i==0 & b%i==0)
			{
				hcf=i;
			}
		}
		int lcm=a*b/hcf;
		System.out.println(lcm);
	}

}
