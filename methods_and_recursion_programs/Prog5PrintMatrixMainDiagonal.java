package methods_and_recursion;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that uses a function that receives a 5x5 matrix as a
 *         parameter. The function should print the elements on the main
 *         diagonal of the matrix.
 */
public class Prog5PrintMatrixMainDiagonal {

	public static void printMatrixMainDiagonal(int mat[][], int size) {
		int i;
		int j;

		System.out.println("Matrix: ");
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				System.out.println(mat[i][j]);
			}
			System.out.println();
		}

		System.out.println("The elements of the main diagonal are: ");
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				if (i == j)
					System.out.println(mat[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i, j;
		int matrix[][] = new int[5][5];

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Enter the value of the position m[" + i + "][" + j + "]: ");
				matrix[i][j] = read.nextInt();
			}
		}

		printMatrixMainDiagonal(matrix, 5);

	}
}
