package Assignment_Progs;

import java.util.Scanner;
public class A013_Modules3and5 {
public static void main(String[] args)
{
	for (int i = 1; i <= 100; i++)
	{
        System.out.print(i + " ");

        if (i % 3 == 0) {
            System.out.print("(divisible by 3) ");
        }

        if (i % 5 == 0) {
            System.out.print("(divisible by 5) ");
        }

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.print("(divisible by both 3 and 5) ");
        }

        System.out.println();
    }
	
	
}
}
