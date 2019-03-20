Some programming examples in Java
===========================

## Contents
1. [Conditional Operators](#conditional)
2. [Loops](#loops)
3. [Arrays](#arrays)
4. [Methods and Recursion](#methods)
5. [Files Processing](#files)
6. [Object Oriented Programming (OOP)](#oop)
7. [Design Patterns](#designpatterns)
8. [Solutions for coding problems](#solutions-for-coding-problems)

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

Go back to [Contents](#contents).

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

Go back to [Contents](#contents).

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

Go back to [Contents](#contents).

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

Go back to [Contents](#contents).

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

Go back to [Contents](#contents).

## OOP

1. Create a program to represent the UML: 

![Prog1_UML_Circle.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog1_UML_Circle.png)

Solution (Java): [P1_Circle](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P1_Circle)

2. Create a program to represent the UML: 

![Prog2_UML_Employee.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog2_UML_Employee.png)

Solution (Java): [P2_Employee](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P2_Employee)

3. Create a program to represent the UML: 

![Prog3_UML_Account.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog3_UML_Account.png)

Solution (Java): [P3_Account](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P3_Account)

4. Create a program to represent the UML: 

![Prog4_UML_Date.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog4_UML_Date.png)

Solution (Java): [P4_Date](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P4_Date)

5. Create a program to represent the UML: 

![Prog5_UML_Time.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog5_UML_Time.png)

Solution (Java): [P5_Time](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P5_Time)

6. Create a program to represent the UML: 

![Prog6_UML_Author.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog6_UML_Author.png)

Solution (Java): [P6_Author](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P6_Author)

7. Create a program to represent the UML: 

![Prog7_UML_Book_Author.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog7_UML_Book_Author.png)

Solution (Java): [P7_Book_Author](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P7_Book_Author)

8. Create a program to represent the UML: 

![Prog8_UML_MyPoint.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog8_UML_MyPoint.png)

Solution (Java): [P8_MyPoint](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P8_MyPoint)

9. Create a program to represent the UML: 

![Prog9_UML_MyCircle_MyPoint.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog9_UML_MyCircle_MyPoint.png)

Solution (Java): [P9_MyCircle_MyPoint](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P9_MyCircle_MyPoint)

10. Create a program to represent the UML: 

![Prog10_UML_Customer.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog10_UML_Customer.png)

Solution (Java): [P10_Customer](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P10_Customer)

11. Create a program to represent the UML: 

![Prog11_UML_Account.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog11_UML_Account.png)

Solution (Java): [P11_Account](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P11_Account)

12. Create a program to represent the UML: 

![Prog12_UML_Person_Student_Staff.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog12_UML_Person_Student_Staff.png)

Solution (Java): [P12_Person_Student_Staff](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P12_Person_Student_Staff)

13. Create a program to represent the UML: 

![Prog13_UML_Shape_Circle_Rectangle_Square.png](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/Unified_Modeling_Language/Prog13_UML_Shape_Circle_Rectangle_Square.png)

Solution (Java): [P13_Shape_Circle_Rectangle_Square](https://github.com/ramon-pessoa/java_programming/blob/master/object_oriented_programming/P13_Shape_Circle_Rectangle_Square)

Go back to [Contents](#contents).

## DesignPatterns

* **Creational Patterns**
	1. **AbstractFactory:** Provides an interface for creating families of related or dependent objects without specifying concrete classes. Also known as *Kit*.
		* Benefits:
			* Isolates the client from the concrete classes (implementation). 
			* It makes changing families of objects easier. 
			* Promotes consistency between objects.
		* Applicable Scenarios: The following scenarios are best suited to the *Abstract Factory* pattern:
			* The system must be independent of how its objects are created, composed, and represented.
			* The system needs to be configured with one of several object families.
			* The family of related objects is intended to be used together and this restriction needs to be enforced.
			* You want to provide a library of objects that does not show implementations and only reveal interfaces.
		* Solution (Java): [AbstractFactory](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/creational_patterns/AbstractFactory)
	2. **Builder:** It separates the construction of a complex object from its representation so that the construction process can create different representations.
		* Benefits:
			* It allows to vary an internal representation of the object.
			* Isolates the code for construction and representation.
			* Provides refined control over the building process.
		* Applicable Scenarios: The following scenarios are best suited to the *Builder* pattern:
			* The algorithm to create a complex object must be independent of the components that make up the object and how they are assembled.
			* The construction process is to allow different representations of the constructed object.
		* Solution (Java): [Builder](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/creational_patterns/Builder)
	3. **Factory Method:** Defines an interface to create an object, allowing subclasses to decide which class to instantiate. Allows a class to set the current instantiation for subclasses. Also known as *Virtual Builder*.
		* Solution (Java): [Factory Method](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/creational_patterns/FactoryMethod)
	4. **Prototype:** Specifies the types of objects to be created using a prototype instance and creates new objects by copying this prototype.
		* Solution (Java): [Prototype](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/creational_patterns/Prototype)
	5. **Singleton:** Ensures that a class has only one instance and provides a global point of access to it.
		* Solution (Java): [Singleton](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/creational_patterns/Singleton)

* **Structural Patterns**
	1. **Adapter:** Converts the interface of the class to another interface and that the client expects. It allows classes to work together that could not do this because of incompatible interfaces.  Also known as *Wrapper*.
		* Solution (Java): [Adapter](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Adapter)
	2. **Bridge:** Ungroup the abstraction from its implementation so that the two can vary independently. Also known as *Handle/Body*.
		* Solution (Java): [Bridge](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Bridge)
	3. **Composite:** Composes objects in tree structures to represent part-whole hierarchies. Allows customers to treat objects and compositions of individual objects in a uniform manner.
		* Solution (Java): [Composite](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Composite)
	4. **Decorator:** Attaches the responsibilities included to an object dynamically. Provides flexible alternative for subclassing to extend functionality. Also known as *Wrapper*.
		* Solution (Java): [Decorator](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Decorator)
	5. **Facade:** Provides a unified interface to a set of interfaces in one or more subsystems. Defines a higher-level interface that makes subsystems easier to use.
		* Solution (Java): [Facade](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Facade)
	6. **Flyweight** It uses sharing to support large numbers of refined objects in an efficient way.
		* Solution (Java): [Flyweight](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Flyweight)
	7. **Proxy** Provides a bookmark or substitute for another object to control access. Also known as *Substitute*.
		* Solution (Java): [Proxy](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/structural_patterns/Proxy)

* **Behavioral Patterns**
	1. **Chain of Responsability:** It avoids grouping the sender of a request to its recipient, giving more than one object a chance to handle the request. The received objects are aligned and transmit the request until it is handled.
		* Solution (Java): [Chain of Responsability](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/ChainOfResponsability)
	2. **Command:** Encapsulates a request as an object, allowing the client to receive parameters with different requests, to align or register requests, and to be able to support and undo operations. Also known as *Action or Transaction*.
		* Solution (Java): [Command](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Command)
	3. **Interpreter:** According to a language, it defines a representation for its grammar along with an interpreter of the grammar that uses the representation to interpret sentences in the language.
		* Solution (Java): [Interpreter](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Interpreter)
	4. **Iterator:** Provides a way to access the elements of a collection object [aggregate] sequentially without having to expose the base representation. Also known as *Cursor*.
		* Solution (Java): [Iterator](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Iterator)
	5. **Mediator:** Defines an object that encapsulates like a set of objects interacts (free grouping), preventing objects from referring to each other directly and varying their interaction independently.
		* Solution (Java): [Mediator](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Mediator)
	6. **Memento:** Without violating the encapsulation, it captures and externalizes an internal state of the object so that the essential state of the object can be restarted later. Also known as *Token*.
		* Solution (Java): [Memento](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Memento)
	7. **Observer:** Defines a one-to-many dependency between objects so that when an object changes state, all its dependents (subscribers) are notified and updated automatically. Also known as *Dependents or Publish-Subscribe*.
		* Solution (Java): [Observer](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Observer)
	8. **State:** Allows an object to change its behavior when its internal state changes; the object will appear to change its class. Also known as *Objects for State*.
		* Solution (Java): [State](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/State)
	9. **Strategy:** It defines a family of algorithms, encapsulating each one and making them interchangeable. Allows the algorithm to vary independently of the clients that use it. Also known as *Policy*.
		* Solution (Java): [Strategy](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Strategy)
	10. **Template Method:** Defines the skeleton of an algorithm (function) in an operation, deferring some steps for subclasses. It allows subclasses to redefine certain steps of an algorithm without changing its structure.
		* Solution (Java): [Template Method](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/TemplateMethod)
	11. **Visitor:** Represents an operation to be performed on the elements of an object structure. Allows you to define a new operation without changing the classes of the elements in which it operates.
		* Solution (Java): [Visitor](https://github.com/ramon-pessoa/java_programming/tree/master/design_patterns/behavioral_patterns/Visitor)


## Solutions for coding problems

1. Problem #1 [Easy]: Given a list of numbers and a number k, return whether any two numbers from the list add up to k. 
	* For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. 
	* Bonus: Can you do this in one pass?

	a. Solution (Java) [VerifyIfTwoNumbersInAListAddUpToK.java](https://github.com/ramon-pessoa/java_programming/blob/master/solutions_for_coding_problems/VerifyIfTwoNumbersInAListAddUpToK.java)

2. Problem #2 [Hard]: Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

	* For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
	* Follow-up: what if you can't use division?

	a. Solution (Python) [ArrayWithTheProductOfAll.java](https://github.com/ramon-pessoa/java_programming/blob/master/solutions_for_coding_problems/ArrayWithTheProductOfAll.java)

Go back to [Contents](#contents).