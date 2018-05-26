package file_processing;

/**
 * @author Ramon Figueiredo Pessoa
 * 
 * Create a program that reads a file called "input_vector.txt", where the first value of this file is the size of the vector. 
 * Create a file named "output_vector.txt" with the same data as the file "input_vector.txt". Use functions to read and write the vector.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prog2_FilesAndVectors {

	public static int[] readVector(String path) {
		int vector[] = null;
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));

			String line = "";
			line = buffRead.readLine();

			int size = Integer.parseInt(line);
			vector = new int[size];

			line = buffRead.readLine();

			int num;
			int pos = 0;
			while (line != null) {
				num = Integer.parseInt(line);
				vector[pos] = num;
				pos++;

				line = buffRead.readLine();
			}
			buffRead.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return vector;
	}

	public static void writeVector(String path, int v[]) {
		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

			int i;
			for (i = 0; i < v.length; i++) {
				System.out.println("v[" + i + "] = " + v[i]);

				buffWrite.append(v[i] + "\n");
			}

			buffWrite.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String pathIn = "input_vector.txt";
		String pathOut = "output_vector.txt";

		int v[] = readVector(pathIn);
		writeVector(pathOut, v);
	}
}
