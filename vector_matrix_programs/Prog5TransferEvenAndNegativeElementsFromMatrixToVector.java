package vector_matrix;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program to read and store values in an X 2x3 matrix.
 *         Generate a vector Y containing all the even and negative elements of
 *         X. Print it on the screen.
 */

public class Prog5TransferEvenAndNegativeElementsFromMatrixToVector {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[][] X = new int[2][3];
		int i, j;

		System.out.println("Enter the values of the matrix X: ");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				X[i][j] = read.nextInt();
			}
		}

		int[] Y = new int[6]; // 2*3
		int aux = 0;

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				if (X[i][j] % 2 == 0 && X[i][j] < 0) {
					Y[aux] = X[i][j];
					aux++;
				}
			}
		}

		System.out.println("The elements of the vector Y are: ");
		for (i = 0; i < aux; i++) {
			System.out.println(Y[i]);
		}
	}
}
