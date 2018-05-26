package for_while;

import java.util.Scanner;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 *         Create a program that reads the number of terms of the Series that
 *         you want to display on the screen, determine and show the values
 *         according to the series:
 * 
 *         Series: 2, 4, 8, 16, 32, 64, 128 .......
 */

public class Prog2LoopToPrintSeries {
	public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num; 
        int result;
        
        System.out.println ("Enter the number of terms in the series: ");
        num = read.nextInt();
        
        for (int i=1; i<=num; i++)
        {
        	System.out.print((int)(Math.pow(2, i)) + " ");
        }
        
	}
}
