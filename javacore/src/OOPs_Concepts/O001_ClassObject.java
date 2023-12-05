package OOPs_Concepts;

class School
{
	int fId;
	static String fName;
	String fSubject;
	
	
 public School(int fId , String fName , String fSubject)
{
		this.fId=fId;
		this.fName=fName;
		this.fSubject=fSubject;
		
	
}
 


public void  fPrint()
{
	
	System.out.println(fId+" "+fName+" "+fSubject);
	
}

}
public class O001_ClassObject {
	
	public static void main(String[] args) {
		
		School Sc = new School(1 , "Sahil" , "English");
		Sc.fPrint();

		School Sc1 = new School(2 , "Arjun " , "Guj"); 
		Sc1.fPrint();
		
	}

}
