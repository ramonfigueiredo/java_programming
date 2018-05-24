package if_else;

import javax.swing.JOptionPane;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Write a program to read a number: If the number is even, display the
 *         text "The number is even" If not, display the text "The number is
 *         odd"
 */

public class Prog1 {
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("Enter a number:");
		if (num != null && !num.isEmpty()) {
			try {
				Double num1 = Double.parseDouble(num);

				if (num1 % 2 == 0) {
					JOptionPane.showMessageDialog(null, "The number is even");
				} else {
					JOptionPane.showMessageDialog(null, "The number is odd");
				}
			} catch (NumberFormatException e) {
				System.err.println("You typed a character that is not a number. Try again.");
				e.printStackTrace();
			}

		}
	}
}
