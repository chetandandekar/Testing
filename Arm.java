package logicbasedprogram;

public class Arm {

	public static void main(String[] args) 
	{
		//153=1*1*1+5*5*5+3*3*3=1+125+27=153
		
		int num=1634;
		int n=num;
		int sum=0;
			
			while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r*r;      //1.sum=0+27=27 2.sum=27+125=152 3.sum=152+1=153
			n=n/10;
		}
		if (num==sum)
		{
			System.out.println("Number is Armstrong No.");
		}
		else
		{
			System.out.println("Number is not Armstrong No.");
		}

	}

}
