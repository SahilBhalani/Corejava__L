package Assignment_Progs;

import java.util.ArrayList;

public class A066_CompareArraylist {
public static void main(String[] args) {
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	a2.add(10);
	a2.add(20);
	a2.add(30);
	
	
	
	int k = 0;
	if(a1.size()!=a2.size())
	{
		System.out.println("not equal");
	}
	else
	{
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i)!=a2.get(i))
			{
				k = 1;
				break;
			}
		}
		if(k==0)
		{
			System.out.println(" List Is Equal");
		}
		else
		{
			System.out.println("List Is Not Equal");
		}
	}
}
}
