package for_while;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Make a program that reads an indeterminate number of numbers, when
 *         the number read is zero, ends the data entry. Show the largest
 *         number read.
 */

public class Prog4TheLargestNumber {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		int largest;
		
		System.out.println("Enter a number (0 to finish): ");
		num = read.nextInt();
		largest = num;
		
		while(num != 0)
		{
			if(num > largest)
			{
				largest = num;
			}
			
			System.out.println("Enter a number (0 to finish): ");
			num = read.nextInt();
		}
		
		System.out.println("The largest number is: " + largest);
	}
}
