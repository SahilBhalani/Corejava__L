package Assignment_Progs;


class agenotvalid extends Exception
{
	int age;

	public agenotvalid(int age) {
		this.age = age;
		
		System.err.println("Age Not Valid");
	}
}

class namenotvalid extends Exception
{
	String name;

	public namenotvalid(String name) {
		this.name = name;
		
		System.err.println("Name Not Valid");
	}
	
}

class student
{
	int rollno;
	int age;
	String name;
	String course;
	
	public student(int rollno, int age, String name, String course) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.course = course;
	}
	


public void agevalidnot() throws agenotvalid
{
	if(age>15 && age<21 )
	{
		System.out.println("Age is Valid");
	}
	
	else
	{
		throw new agenotvalid(age);
	}
}

public void  namevalidnot() throws namenotvalid
{
	for(int i=0;i<name.length();i++)
	{
		if(!Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i)))
		{
			throw new namenotvalid(name);
		}
	}
	System.err.println("Name Is Valid");
}
}
public class A043_AgenotWithinRange {
public static void main(String[] args) {
	student s1 = new student(1, 13, "s@hil", "bca");
	
	try {
		s1.agevalidnot();
	} catch (agenotvalid e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	try {
		s1.namevalidnot();
	} catch (namenotvalid e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}



