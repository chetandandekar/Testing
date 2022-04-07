package logicbasedprogram;

public class CharacterCount {

	
		public static void main(String[] args) 
		{
		      String s1="Chetan Dandekar";
		      int n=0;
		       for (int i=0; i<=s1.length()-1; i++)
		       {
		    	   if (s1.charAt(i)=='a')
		    	   {
		    		   n=n+1;
		    	   }
		       }
		       System.out.println(n);
	    }

}
