/*Question: Write a Java program to print the Fibonacci series up to N terms.

In the Fibonacci series, each number is the sum of the previous two numbers.

Example:
0 1 1 2 3 5 8 13 21 34*/


import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        long first = 0;
        long second = 1;

        if (n <= 0) {
            System.out.println("Please enter a positive number");
        } else if (n > 93) {
            System.out.println("Maximum supported terms are 93");
        } else {

            System.out.println("Fibonacci Series:");

            for (int i = 1; i <= n; i++) {

                System.out.print(first + " ");

                long next = first + second;

                first = second;
                second = next;
            }
        }

        sc.close();
    }
}
