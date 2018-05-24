package methods_and_recursion;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Write a program to find the largest and smallest number between two
 *         numbers.
 */
public class Prog1FindLargestSmallestNumber {

	public static int largest(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int smallest(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {
		// TODO code application logic here
		Scanner read = new Scanner(System.in);

		int a, b;
		System.out.println("Enter a number: ");
		a = read.nextInt();
		System.out.println("Enter another number: ");
		b = read.nextInt();

		System.out.println("The smallest number is " + smallest(a, b));
		System.out.println("The largest number is " + largest(a, b));
	}
}
