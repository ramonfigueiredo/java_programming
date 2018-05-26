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
 *         Create a program that reads a file called "input_vector.txt", where
 *         the first value of this file is the size of the vector. Create a file
 *         named "largest_smallest.txt" that saves the largest value on the
 *         first line and the smallest value on the second line in the vector.
 *         Use functions to read and write files.
 */

public class Prog3_LargestAndSmallestValuesInFiles {
	
	public static int[] readVetor(String path) {
		int v[] = null;
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));

			String line = "";
			line = buffRead.readLine();

			int size = Integer.parseInt(line);
			v = new int[size];

			line = buffRead.readLine();

			int num;
			int pos = 0;
			while (line != null) {
				num = Integer.parseInt(line);
				v[pos] = num;
				pos++;

				line = buffRead.readLine();
			}
			buffRead.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return v;
	}

	public static void writeLargestAndSmallestValues(String path, int v[]) {
		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

			int i, largest, smallest;
			largest = v[0];
			smallest = v[0];
			for (i = 0; i < v.length; i++) {
				System.out.println("v[" + i + "] = " + v[i]);

				if (v[i] > largest)
					largest = v[i];

				if (v[i] < smallest)
					smallest = v[i];
			}

			buffWrite.append(largest + "\n");
			buffWrite.append(smallest + "\n");

			System.out.println("Largest = " + largest);
			System.out.println("Smallest = " + smallest);

			buffWrite.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String pathIn = "input_vector.txt";
		String pathOut = "largest_smallest.txt";

		int v[] = readVetor(pathIn);
		writeLargestAndSmallestValues(pathOut, v);
	}
}
