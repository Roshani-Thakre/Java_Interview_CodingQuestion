/*Question: Write a Java program to calculate the sum of digits of a given number.

Example:
Input: 1234
Output: 10*/


import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }

        System.out.println("Sum of digits is: " + sum);

        sc.close();
    }
}
