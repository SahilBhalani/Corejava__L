package Pattern;

public class squarep1 {


		public static void main(String[] args) 
		{
			
			
//			*****
//			*****
//			*****
//			*****
//			*****
			
			int lines = 5;
			for(int j=1;j<=lines;j++)
			{
				for(int i=1;i<=lines;i++)
				{
					if(i==1 || i==lines || j==1 || j==lines)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
		}
	}


