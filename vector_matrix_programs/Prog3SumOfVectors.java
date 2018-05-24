package vector_matrix;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program to read data in two X and Y vectors with 10
 *         positions each. Create a third vector Z that has the sum of the
 *         positions of the previous vectors. For example: Position 1 of X with
 *         position 1 of Y and store in position 1 of Z.
 */

public class Prog3SumOfVectors {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] X = new int[10];
		int[] Y = new int[10];
		int[] Z = new int[10];
		int i;

		System.out.println("Enter the positions of the vector X: ");

		for (i = 0; i < 10; i++) {
			X[i] = read.nextInt();
		}
		System.out.println("Enter the positions of the vector Y");
		for (i = 0; i < 10; i++) {
			Y[i] = read.nextInt();
		}
		// Storing the positions of Z
		System.out.println("\nVector Z: ");
		for (i = 0; i < 10; i++) {
			Z[i] = X[i] + Y[i];
			System.out.printf("Value of Z[%d] = %d\n", i, Z[i]);
		}
	}
}
