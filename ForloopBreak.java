package logicbasedprogram;

public class ForloopBreak {

	public static void main(String[] args) {
		
		//Break a for loop at i=5 & i=7
		
		for(int i=1;i<11;i++)
		{
			if(i==5 || i==7)
			{
				System.out.print("");
			}
			else
			{
				System.out.println(i);
			}

		}

	}

}
