package file_processing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that reads a file called "input_matrix.txt", where
 *         the first line has the number of rows and the number of columns
 *         separated by space. Create a file called "output_matrix.txt" with the
 *         data in the matrix format. Use functions to read and write the array.
 */

public class Prog4_FilesAndMatrices {

	public static int[][] readMatrix(String path) {
		int matrix[][] = null;
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));

			String line = "";
			line = buffRead.readLine();

			String lin_col[] = line.split(" ");
			int lin = Integer.parseInt(lin_col[0]);
			int col = Integer.parseInt(lin_col[1]);

			matrix = new int[lin][col];

			line = buffRead.readLine();

			int num;
			int i = 0;
			int j = 0;
			while (line != null) {
				num = Integer.parseInt(line);

				if (j < col) {
					matrix[i][j] = num;
					j++;
				} else {
					i++;
					j = 0;
					matrix[i][j] = num;
					j++;
				}

				line = buffRead.readLine();
			}
			buffRead.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return matrix;
	}

	public static void writeMatrix(String path, int m[][]) {
		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

			int lin, col, i, j;
			lin = m.length;
			col = m[0].length;

			System.out.println("MATRIX: ");
			for (i = 0; i < lin; i++) {
				for (j = 0; j < col; j++) {
					System.out.print(m[i][j] + "\t");
					buffWrite.append(m[i][j] + "\t");
				}
				buffWrite.append("\n");
				System.out.println();
			}

			buffWrite.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String pathIn = "input_matrix.txt";
		String pathOut = "output_matrix.txt";

		int m[][] = readMatrix(pathIn);
		writeMatrix(pathOut, m);
	}
}
