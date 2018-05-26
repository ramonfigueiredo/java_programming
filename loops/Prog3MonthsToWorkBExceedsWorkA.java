package for_while;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that receives the profit of a work A of 400m^2. It
 *         is known that the profit of a work B of 200m^2 equivalent to 1/3 of
 *         that of 400mm^2. If the company applies the profit of work A entirely
 *         in the savings account, which is yielding 2% per month and the work B
 *         will fully apply to the fixed income fund, which is yielding 5% per
 *         month. Calculate and show the number of months needed for the profit
 *         of work B to equal or exceed the profit of Work A.
 */

public class Prog3MonthsToWorkBExceedsWorkA {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double profitA, profitB;
		int months = 0;
		System.out.println("Enter the profit obtained in the work A: ");
		profitA = read.nextDouble();
		profitB = (profitA / 3);
		System.out.println("The profit obtained in work B is: " + profitB);
		while (profitB < profitA) {
			profitA = 1.02 * profitA;
			profitB = 1.05 * profitB;
			months++;

		}
		System.out.println(
				"The number of months for the profit of work B exceeds that of work A is " + months + " months.");
	}
}
