package vector_matrix;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 * 
 * Create a program that reads the values and stores it in a 3x3 matrix. Create the 3x3 identity matrix.
 */

import java.util.Scanner;

public class Prog4_3x3_IdentityMatrix {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int m[][] = new int[3][3];
		int ident[][] = new int[3][3];
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter the value at the m[" + i + "][" + j + "]: ");
				m[i][j] = read.nextInt();
			}
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					ident[i][j] = 1;
				} else {
					ident[i][j] = 0;
				}
			}
		}

		System.out.println("Matrix read: ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Identity matrix: ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(ident[i][j] + " ");
			}
			System.out.println();
		}
	}
}
