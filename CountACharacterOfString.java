package logicbasedprogram;

public class CountACharacterOfString 
{
	public static void main(String[] args) 
	{
		String s="I LOVE TESTING AND CODING";
		
		int Count=s.length();
		//System.out.println(Count);
		int Remove=s.replace("O", "").length();
	    int charcount=Count-Remove;
	    System.out.println(charcount);  
	}
}
