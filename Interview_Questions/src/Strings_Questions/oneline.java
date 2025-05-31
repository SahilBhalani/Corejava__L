package Strings_Questions;

public class oneline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos,num=10;
		for(pos=31;pos>=0;pos--)
		{
			System.out.print(num>>pos&1);
		}
			 
	}

}
