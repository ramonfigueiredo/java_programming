package file_processing;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that opens a file called "input.txt", read the contents of this file and save it to a new file called "output.txt".
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prog1_OpenSaveFiles {

	public static void main(String[] args) {
		String pathIn = "input.txt";
		String pathOut = "output.txt";

		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(pathIn));
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter(pathOut));

			String line = "";
			line = buffReader.readLine();

			while (line != null) {
				buffWriter.append(line + "\n");
				line = buffReader.readLine();
			}
			buffReader.close();
			buffWriter.close();
			
			System.out.println("Done!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
