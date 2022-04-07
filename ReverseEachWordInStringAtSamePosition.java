package logicbasedprogram;

public class ReverseEachWordInStringAtSamePosition {

	public static void main(String[] args) 
	{
		String s="CHETAN";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}	
	}
}
