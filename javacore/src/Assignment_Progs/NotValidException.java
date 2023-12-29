package Assignment_Progs;


	public class NotValidException extends Exception {
		
		int AgeCk;
		
		public NotValidException(int AgeCk)
		{
			this.AgeCk = AgeCk;
		}
		
		public void getMsg()
		{
			System.err.println("You Need More " + AgeCk + " Year To Eligible");
		}

	}

