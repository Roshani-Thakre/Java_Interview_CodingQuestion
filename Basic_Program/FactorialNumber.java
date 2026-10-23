/*Question: Write a Java program to find the factorial of a given number.

Factorial is the product of all positive integers from 1 to the given number.

Example:
\
5! = 5 \times 4 \times 3 \times 2 \times 1 = 120
\

Also, 0! = 1.*/


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else if (num > 20) {
            System.out.println("Number is too large for long datatype");
        } else {

            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is " + factorial);
        }

        sc.close();
    }
}
