Some programming examples in Java
===========================

## Contents
1. [Conditional Operators](#conditional)
2. [Loops](#loops)
3. [Arrays](#arrays)
4. [Methods and Recursion](#methods)
5. [Files Processing](#files)
6. [Object Oriented Programming (OOP)](#oop)

## Conditional

1. Create a program to read a number
	* If the number is even, display the text "The number is even"
	* If not, display the text "The number is odd"

	Solution (Java): [Prog1EvenOdd.java](https://github.com/ramon-pessoa/java_programming/blob/master/conditional_operators/Prog1EvenOdd.java)

2. Create a program to:
	* Read two numbers
	* Show if the first number is positive, negative or zero
	* Show whether the second number is positive, negative or zero
	* Show the result of addition, subtraction, multiplication and division of the two numbers

	Solution (Java): [Prog2PositiveNegativeZeroArithmeticOperations.java](https://github.com/ramon-pessoa/java_programming/blob/master/conditional_operators/Prog2PositiveNegativeZeroArithmeticOperations.java)

3. Create a program that reads 3 integers and print how many are even and how many are odd.

	Solution (Java): [Prog3HowManyNumberEvenOrOdd.java](https://github.com/ramon-pessoa/java_programming/blob/master/conditional_operators/Prog3HowManyNumberEvenOrOdd.java)

4. Create a program that reads the storage capacity of a flash drive in Gigabytes, calculate and write this measurement in bytes.
	* Simple sequential structure, without the use of conditional operators.

	Solution (Java): [Prog4GigabytesToBytes.java](https://github.com/ramon-pessoa/java_programming/blob/master/conditional_operators/Prog4GigabytesToBytes.java)

5. Create a program that reads a temperature in Farenheit degrees. Calculate and write this temperature in degrees Celsius.
	* Simple sequential structure, without the use of conditional operators.

	Solution (Java): [Prog5FarenheitToCelsius.java](https://github.com/ramon-pessoa/java_programming/blob/master/conditional_operators/Prog5FarenheitToCelsius.java)

Go back to [Contents](#contents)

## Loops

1. Create a program that reads 20 integers and print how many are even and how many are odd.

	Solution (Java): [Prog1EvenOrOdd.java](https://github.com/ramon-pessoa/java_programming/blob/master/loops/Prog1EvenOrOdd.java)

2. Create a program that reads the number of terms of the Series that you want to display on the screen, determine and show the values according to the series:
	* Series: 2, 4, 8, 16, 32, 64, 128 ...

	Solution (Java): [Prog2LoopToPrintSeries.java.java](https://github.com/ramon-pessoa/java_programming/blob/master/loops/Prog2LoopToPrintSeries.java)

3. Create a program that receives the profit of a work A of 400m^2. It is known that the profit of a work B of 200m^2 equivalent to 1/3 of that of 400mm^2. If the company applies the profit of work A entirely in the savings account, which is yielding 2% per month and the work B will fully apply to the fixed income fund, which is yielding 5% per month. Calculate and show the number of months needed for the profit of work B to equal or exceed the profit of Work A.

	Solution (Java): [Prog3MonthsToWorkBExceedsWorkA.java](https://github.com/ramon-pessoa/java_programming/blob/master/loops/Prog3MonthsToWorkBExceedsWorkA.java)

4. Create a program that reads an indeterminate number of numbers, when the number read is zero, ends the data entry. Show the largest number read.

	Solution (Java): [Prog4TheLargestNumber.java](https://github.com/ramon-pessoa/java_programming/blob/master/loops/Prog4TheLargestNumber.java)

5. Calculate how many m^2 of vegetation will be needed to cover the roof of a sustainable house. Consider that the roof of the house is rectangular. The user must inform the dimensions of the roof (length and width). It is known that the vegetation must cover 80% of the area to develop. Create a way to allow the user to do the calculations multiple times (undetermined number of repetitions).

	Solution (Java): [Prog5VegetationToCoverTheRoof.java](https://github.com/ramon-pessoa/java_programming/blob/master/loops/Prog5VegetationToCoverTheRoof.java)

Go back to [Contents](#contents)

## Arrays

1. Create a program that reads 5 student's scores and stores them in a vector. Calculate the arithmetic mean of the scores.

	Solution (Java): [Prog1AverageFiveStudentScores.java](https://github.com/ramon-pessoa/java_programming/blob/master/arrays/Prog1AverageFiveStudentScores.java)

2. Create a program to read and store an X vector with 10 elements. Generate a second vector Y containing all the even and negative elements of X. Print it on the screen.

	Solution (Java): [Prog2VectorWithEvenAndNegativeElements.java](https://github.com/ramon-pessoa/java_programming/blob/master/arrays/Prog2VectorWithEvenAndNegativeElements.java)

3. Create a program to read data in two X and Y vectors with 10 positions each. Create a third vector Z that has the sum of the positions of the previous vectors. For example: Position 1 of X with position 1 of Y and store in position 1 of Z.

	Solution (Java): [Prog3SumOfVectors.java](https://github.com/ramon-pessoa/java_programming/blob/master/arrays/Prog3SumOfVectors.java)

4. Create a program that reads the values and stores it in a 3x3 matrix. Create the 3x3 identity matrix.

	Solution (Java): [Prog4_3x3_IdentityMatrix.java](https://github.com/ramon-pessoa/java_programming/blob/master/arrays/Prog4_3x3_IdentityMatrix.java)

5. Create a program to read and store values in an X 2x3 matrix. Generate a vector Y containing all the even and negative elements of X. Print it on the screen.

	Solution (Java): [Prog5TransferEvenAndNegativeElementsFromMatrixToVector.java](https://github.com/ramon-pessoa/java_programming/blob/master/arrays/Prog5TransferEvenAndNegativeElementsFromMatrixToVector.java)

Go back to [Contents](#contents)

## Methods

1. Write a program to find the largest and smallest number between two numbers.

	Solution (Java): [Prog1FindLargestSmallestNumber.java](https://github.com/ramon-pessoa/java_programming/blob/master/methods_and_recursion/Prog1FindLargestSmallestNumber.java)

2. Create a program that finds the factorial of any number using recursion.

	Solution (Java): [Prog2FactorialWithRecursion.java](https://github.com/ramon-pessoa/java_programming/blob/master/methods_and_recursion/Prog2FactorialWithRecursion.java)

3. Create a program that finds the factorial of any number **without** using recursion.

	Solution (Java): [Prog3FactorialWithoutRecursion.java](https://github.com/ramon-pessoa/java_programming/blob/master/methods_and_recursion/Prog3FactorialWithoutRecursion.java)

4. Create a program in that uses a function called *sumVectorElements* that sums all numbers of a vector of integers passed to this function (first parameter) and returns the sum of the elements. The function must receive a second parameter called *size* that contains the number of elements in the vector.

	Solution (Java): [Prog4SumVectorElements.java](https://github.com/ramon-pessoa/java_programming/blob/master/methods_and_recursion/Prog4SumVectorElements.java)

5. Create a program that uses a function that receives a 5x5 matrix as a parameter. The function should print the elements on the main diagonal of the matrix.

	Solution (Java): [Prog5PrintMatrixMainDiagonal.java](https://github.com/ramon-pessoa/java_programming/blob/master/methods_and_recursion/Prog5PrintMatrixMainDiagonal.java)

Go back to [Contents](#contents)

## Files

1. Create a program that opens a file called *input.txt*, read the contents of this file and save it to a new file called *output.txt*.

	Solution (Java): [Prog1_OpenSaveFiles.java](https://github.com/ramon-pessoa/java_programming/blob/master/file_processing/Prog1_OpenSaveFiles.java)

2. Create a program that reads a file called *input_vector.txt*, where the first value of this file is the size of the vector. Create a file named *output_vector.txt* with the same data as the file *input_vector.txt*. Use functions to read and write the vector.

	Solution (Java): [Prog2_FilesAndVectors.java](https://github.com/ramon-pessoa/java_programming/blob/master/file_processing/Prog2_FilesAndVectors.java)

3. Create a program that reads a file called *input_vector.txt*, where the first value of this file is the size of the vector. Create a file named *largest_smallest.txt* that saves the largest value on the first line and the smallest value on the second line in the vector. Use functions to read and write files.

	Solution (Java): [Prog3_LargestAndSmallestValuesInFiles.java](https://github.com/ramon-pessoa/java_programming/blob/master/file_processing/Prog3_LargestAndSmallestValuesInFiles.java)

4. Create a program that reads a file called *input_matrix.txt*, where the first line has the number of rows and the number of columns separated by space. Create a file called *output_matrix.txt* with the data in the matrix format. Use functions to read and write the array.

	Solution (Java): [Prog4_FilesAndMatrices.java](https://github.com/ramon-pessoa/java_programming/blob/master/file_processing/Prog4_FilesAndMatrices.java)

5. Create a program that reads a file called *input_matrix.txt*, where the first line has the number of rows and the number of columns separated by space. Create a file named *main_diagonal.txt* that saves the values of the main diagonal of the read matrix. Use functions to read and write the array.

	Solution (Java): [Prog5_SaveMainDiagonalMatrix.java](https://github.com/ramon-pessoa/java_programming/blob/master/file_processing/Prog5_SaveMainDiagonalMatrix.java)

Go back to [Contents](#contents)

## OOP