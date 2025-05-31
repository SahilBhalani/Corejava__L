package Functions;

import java.util.Scanner;

public class Factorial_With_Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1 = fact(n);
		System.out.println(n1);

	}

	public static int fact(int n) {

		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;
		}

		return ans;
	}

}
