package if_else;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 * 
 * Create a program that reads 3 integers and print how many are even and how many are odd.
 *
 */

import javax.swing.JOptionPane;

public class Prog3HowManyNumberEvenOrOdd {

	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog(null, "Digite o numero 1");
		String number2 = JOptionPane.showInputDialog(null, "Digite o numero 2");
		String number3 = JOptionPane.showInputDialog(null, "Digite o numero 3");

		boolean exitSystem = validateInputNumbersIsEmpty(number1, number2, number3);
		if (exitSystem) {
			System.exit(1);
		} else {
			
			if(validateInputNumbersIsNumeric(number1, number2, number3)) {
				System.exit(1);
			}
			double num1 = Double.parseDouble(number1);
			double num2 = Double.parseDouble(number2);
			double num3 = Double.parseDouble(number3);

			int countEven = 0;
			int countOdd = 0;

			if (num1 % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}

			if (num2 % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}

			if (num3 % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}

			JOptionPane.showMessageDialog(null, "The number of even numbers is: " + countEven);
			JOptionPane.showMessageDialog(null, "The number of odd numbers is: " + countOdd);
		}
	}

	private static boolean validateInputNumbersIsEmpty(String number1, String number2, String number3) {
		boolean exitSystem = false;
		if (number1 == null || number1.isEmpty()) {
			System.err.println("It is necessary type the first number.");
			exitSystem = true;
		}
		if (number2 == null || number2.isEmpty()) {
			System.err.println("It is necessary type the second number.");
			exitSystem = true;
		}
		if (number3 == null || number3.isEmpty()) {
			System.err.println("It is necessary type the third number.");
			exitSystem = true;
		}
		return exitSystem;
	}
	
	private static boolean validateInputNumbersIsNumeric(String number1, String number2, String number3) {
		boolean exitSystem = false;
		if (!isNumeric(number1)) {
			System.err.println("The first input is not numeric.");
			exitSystem = true;
		}
		if (!isNumeric(number2)) {
			System.err.println("The second input is not numeric.");
			exitSystem = true;
		}
		if (!isNumeric(number3)) {
			System.err.println("The third input is not numeric.");
			exitSystem = true;
		}
		return exitSystem;
	}
	
	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
