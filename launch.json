/*
Write a program to check leap year using if else. How to check whether a given year
 is a leap year or not.
 [Hint:Take an input of any number. Store it in some variable say year.
 If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year. Or if a
 year is exactly divisible by 400 then it is a leap year.]
 Sample Input 1:
 2004
*/
package Lab2;
import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check leap year using if-else
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}
/*
output1:Enter a year: 2002
2002 is Not a Leap Year.
output2:Enter a year: 2012
2012 is a Leap Year.

*/