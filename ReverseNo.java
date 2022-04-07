package logicbasedprogram;

public class ReverseNo {

	public static void main(String[] args) 
	{
		int number=456122032;
		int Output=0;
		int reverseNo=number;
		while(reverseNo>0)
		{
			int r=reverseNo%10;
			Output=Output*10+r;
			reverseNo=reverseNo/10;
		}
		System.out.println("This is reverse number "+Output);
	}
}
