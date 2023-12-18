package OOPs_Concepts;


public class AgeNotValidException extends Exception {
	
	int AgeCk;
	
	public AgeNotValidException(int AgeCk)
	{
		this.AgeCk = AgeCk;
	}
	
	public void getMsg()
	{
		System.err.println("You Need More " + AgeCk + " Year To Eligible");
	}

}
