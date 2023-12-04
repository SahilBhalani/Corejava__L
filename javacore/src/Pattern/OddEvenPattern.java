package Pattern;

public class OddEvenPattern {

	public static void main(String[] args) {
		
		int Lines=5;
		int spaceCount=1;
		
		
		for(int j=1;j<=Lines;j++)
		{  
			for(int i=1;i<=spaceCount;i++)
			{
				if(i%2==0 || j%2==0)
				{	
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
		 }
			System.out.println();
			spaceCount++;
		
		}
	
	}
}
