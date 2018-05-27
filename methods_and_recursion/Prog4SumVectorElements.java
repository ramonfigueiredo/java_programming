package methods_and_recursion;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program in that uses a function called 'sumVectorElements' that
 *         sums all numbers of a vector of integers passed to this function (first
 *         parameter) and returns the sum of the elements. The function must 
 *         receive a second parameter called 'size' that contains the number 
 *         of elements in the vector.
 */

public class Prog4SumVectorElements {
	public static int sumVectorElements(int vector[], int size) {

		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + vector[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of your vector: ");
		size = read.nextInt();
		int vector[] = new int[size];
		for (int j = 0; j < size; j++) {
			System.out.println("Enter a number:");
			vector[j] = read.nextInt();

		}
		int x = sumVectorElements(vector, size);
		System.out.println("The sum of the elements of the vector is: " + x);
	}
}
