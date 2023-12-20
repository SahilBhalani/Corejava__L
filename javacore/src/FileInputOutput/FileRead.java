package FileInputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The File Name: ");
		String s = sc.nextLine();
		
		try
		{
			fis = new FileInputStream("C:\\Users\\sahil\\Documents\\File I_o\\"+s);
			int i =  fis.read();
			
			while(i!=-1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fis.read();
			}
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
