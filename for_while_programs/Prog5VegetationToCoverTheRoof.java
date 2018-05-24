package for_while;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Calculate how many m^2 of vegetation will be needed to cover the roof
 *         of a sustainable house. Consider that the roof of the house is
 *         rectangular. The user must inform the dimensions of the roof (length
 *         and width). It is known that the vegetation must cover 80% of the
 *         area to develop. Create a way to allow the user to do the
 *         calculations multiple times (undetermined number of repetitions).
 */

public class Prog5VegetationToCoverTheRoof {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double length;
		double width;
		double area;
		double requiredArea = 0;
		int exitTheProgram;

		do {
			System.out.println("Enter length: ");
			length = read.nextDouble();
			System.out.println(" Enter the width: ");
			width = read.nextDouble();

			area = length * width;
			requiredArea = area * 0.8;

			System.out.println("The required area is: " + requiredArea);
			
			System.out.println("Enter 0 to end the program. Any other number to continue. Type the number of your decision: ");
			exitTheProgram =  read.nextInt();
		} while (exitTheProgram != 0);
	}
}
