/*Question: Write a Java program to check whether a number is prime or not.

A prime number is a number greater than 1 that has exactly two factors: 1 and itself.

Examples: 2, 3, 5, 7, 11, 13.*/


import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / i; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

        sc.close();
    }
}
