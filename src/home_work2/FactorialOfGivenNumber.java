package home_work2;

import java.util.Scanner;

//Write a Java program to find the factorial of a given number.
public class FactorialOfGivenNumber {
    public static long factorial(int number) {
        long factorial = 1;  // Initialize factorial as 1 (since 0! and 1! are 1)
        for (int i = 1; i <= number; i++) {
            factorial *= i;   // Multiply all numbers from 1 to the given number
        }
        return factorial;  // Return the final result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take input from the user

        System.out.print("Enter a number: "); // Ask the user to enter a number
        int number = scanner.nextInt();  // Read the number entered
        long result = factorial(number); // call the method

        System.out.println("The factorial of " + number + " is: " + result); // print the result
    }


}
