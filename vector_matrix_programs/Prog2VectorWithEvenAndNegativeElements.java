package vector_matrix;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 * 
 *         Create a program to read and store an X vector with 10 elements.
 *         Generate a second vector Y containing all the even and negative
 *         elements of X. Print it on the screen.
 */

public class Prog2VectorWithEvenAndNegativeElements {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int vector1[] = new int[10];
		int vector2[] = new int[10];
		int i;
		int numElemVector2 = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("Enter the number " + (i + 1) + ": ");
			vector1[i] = read.nextInt();
			if ((vector1[i] % 2) == 0 && vector1[i] < 0) {
				vector2[numElemVector2] = vector1[i];
				numElemVector2++;
			}
		}

		System.out.println("All even and negative elements are: ");
		for (i = 0; i < numElemVector2; i++) {
			System.out.println(vector2[i]);
		}
	}
}
