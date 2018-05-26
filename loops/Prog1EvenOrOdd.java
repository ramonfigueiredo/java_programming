package for_while;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 * Create a program that reads 20 integers and print how many are even and how many are odd.
 */

public class Prog1EvenOrOdd {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, i, count_even, count_odd;
		
		count_even = 0;
		count_odd = 0;
		
		for(i = 0; i < 20; i++)
		{
			System.out.println("Enter a number: ");
			num = read.nextInt();
			if( (num % 2) == 0)
			{
				count_even++;
			}
			else
			{
				count_odd++;
			}
		}
		
		System.out.println("Number of even numbers =" + count_even);
		System.out.println("Number of odd numbers =" + count_odd);
	}
}
