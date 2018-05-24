package if_else;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that reads a temperature in Farenheit degrees.
 *         Calculate and write this temperature in degrees Celsius.
 * 
 */

public class Prog5FarenheitToCelsius {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Enter the temperature in degrees Fahrenheit: ");
		double F = read.nextDouble();

		double C = (5 / 9.0) * (F - 32);

		System.out.println("This temperature in degrees Celsius is: " + C);
	}
}
