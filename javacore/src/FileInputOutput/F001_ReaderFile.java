package FileInputOutput;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class F001_ReaderFile {
	public static void main(String[] args) {

		FileReader fr = null;
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The File Name: ");
		String s = sc.next();

		try {
			
			fr = new FileReader("C:\\Users\\sahil\\Documents\\File I_o\\"+s);
			int i = fr.read();

			while (i != -1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fr.read();
			}

		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{

			try 
			{
				fr.close();
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
