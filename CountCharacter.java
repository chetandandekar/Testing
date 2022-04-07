package logicbasedprogram;

public class CountCharacter {

	public static void main(String[] args) 
	{
		String name="SSSSS Sarika Shirude";
		int result =name.length();//total length
		//System.out.println(result);
		int CountAfterRemove=name.replaceAll("S", "").length();//length after replace
		//System.out.println(CountAfterRemove);		
		int FinalCount=result-CountAfterRemove;//difference
		System.out.println(FinalCount);
	}

}
