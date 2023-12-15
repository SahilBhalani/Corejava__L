package Assignment_Progs;

class Member
{
	int Id = 001;
	String Name = "Sahil";
	int Age = 20;
	String Add = "Surat,Gujarat";
	double PhoneNum = 9898989898l;
	int Salary = 250000;


	public void printSalary()
		{
			System.out.println("The Salary Of The " + Name + " Is : " + Salary);
		}

}
public class A025_DataMemCall {
public static void main(String[] args) {
	
	Member m1 = new Member();
	
	m1.printSalary();
	
}
}
