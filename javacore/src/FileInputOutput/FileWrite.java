package FileInputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
public static void main(String[] args) {
	
	
	FileOutputStream fos = null;
	try { 
		
		System.out.println("Enter The FileName:");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		fos = new FileOutputStream("C:\\Users\\sahil\\Documents\\File I_o\\"+s1);
		
			
		System.out.println("Enter The E-Mail :");
		String s = sc.nextLine();
		
		byte[] b = s.getBytes();
		fos.write(b);
		
		System.out.println("file Created Successfully");
		
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

}
}
