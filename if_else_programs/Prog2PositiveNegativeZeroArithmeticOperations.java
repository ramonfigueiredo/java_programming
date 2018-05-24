package if_else;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 * 
 *         Write a program to: Read two numbers. Show whether the first number
 *         is positive, negative, or zero. Show whether the second number is
 *         positive, negative, or zero. Show the result of addition,
 *         subtraction, multiplication and division of the two numbers.
 */

public class Prog2PositiveNegativeZeroArithmeticOperations {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float n1, n2;
		System.out.println("Enter the first number: ");
		n1 = read.nextFloat();
		System.out.println("Enter the second number: ");
		n2 = read.nextFloat();

		if (n1 > 0) {
			System.out.println("The first number is positive");
		} else if (n1 < 0) {
			System.out.println("The first number is negative");
		} else {
			System.out.println("The first number is zero");
		}

		if (n2 > 0) {
			System.out.println("The second number is positive");
		} else if (n2 < 0) {
			System.out.println("The second number is negative");
		} else {
			System.out.println("The second number is zero");
		}

		System.out.println("Sum of the two numbers: " + (n1 + n2));
		System.out.println("Subtraction of the two numbers: " + (n1 - n2));
		System.out.println("Multiplication of the two numbers: " + (n1 * n2));
		if (n2 != 0) {
			System.out.println("Division of the two numbers: " + (n1 / n2));
		} else {
			System.out.println("It is not possible to divide because the second number is zero");
		}

	}
}
