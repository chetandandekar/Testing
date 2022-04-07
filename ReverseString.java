package logicbasedprogram;

public class ReverseString {

	public static void main(String[] args) 
	{		
		//Reverse String
		
		String s="SARIKA SHIRUDE";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}		
		System.out.println();
		
		//Reverse Array
		
		String name[] = {"chetan","sarika","yogita"};
		
		for(int i=0;i<=name.length-1;i++ )
		{
			String s1 = name[i];
			System.out.print(" ");
			
			
			for(int j=s1.length()-1;j>=0;j--)
			{
				System.out.print(s1.charAt(j));
			}
		}	
	}
}
