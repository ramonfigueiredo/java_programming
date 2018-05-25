package methods_and_recursion;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that finds the factorial of any number using
 *         recursion.
 * 
 */

public class Prog2Factorial {

	public static int fatorial(int num) throws Exception {
		if (num < 0) {
			throw new Exception("There is no factorial of a negative number.");
		} else if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * fatorial(num - 1);
		}

	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		System.out.println("Enter the number you want to get the factorial: ");
		n = read.nextInt();

		try {
			System.out.printf("The factorial of the number %d is %d.", n, fatorial(n));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
