/*
Write a program to check whether a number is a Strong number or not.
 Strong number is a special number whose sum of factorial of digits is equal to the
 original number.
 For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 [Hint: conditional operator,method,use parameterized method to take input]
 Sample Input 1:
 145
*/

import java.util.Scanner;

public class StrongNumberChecker {

    // Method to calculate factorial of a digit
    static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Parameterized method to check if a number is Strong
    static void checkStrongNumber(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Conditional operator to print result
        String result = (sum == original) ? "Strong Number" : "Not a Strong Number";
        System.out.println(original + " is " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int input = sc.nextInt();

        checkStrongNumber(input);
    }
}

/*
output1:Enter a number to check: 145
145 is Strong Number
output2:Enter a number to check: 120
120 is Not a Strong Number
*/
