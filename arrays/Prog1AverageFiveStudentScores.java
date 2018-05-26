package vector_matrix;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that reads 5 student's scores and stores them in a
 *         vector. Calculate the arithmetic mean of the scores.
 * 
 */

public class Prog1AverageFiveStudentScores {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int i;
		double average;
		double sum = 0;
		double[] studentScores = new double[5];

		System.out.println("Enter students' grade: ");

		for (i = 0; i < 5; i++) {
			studentScores[i] = read.nextDouble();
		}

		for (i = 0; i < 5; i++) {
			sum = sum + studentScores[i];

		}
		average = sum / 5;
		System.out.println("The average score is: " + average);
	}
}
