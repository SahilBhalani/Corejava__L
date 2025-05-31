package Patterns;

import java.util.Scanner;

public class P4_TriangleNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 1;
		int nst = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nst; j++) {
				System.out.print(count + " ");
				count++;
			}

			nst++;
			System.out.println();
		}

	}

}
