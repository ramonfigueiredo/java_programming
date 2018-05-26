package if_else;

import javax.swing.JOptionPane;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 * 
 *         Create a program that reads the storage capacity of a FlashDrive in
 *         Gigabytes, calculate and write this measurement in bytes.
 *
 */

public class Prog4GigabytesToBytes {
	public static void main(String[] args) {
		String storage = JOptionPane.showInputDialog(null, "Enter size in gigabyte");
		double size1 = Double.parseDouble(storage);
		double size2 = size1 * Math.pow(1024, 3);
		JOptionPane.showMessageDialog(null, "The byte size is equal to:" + size2);
		System.out.println(size2);
	}
}
