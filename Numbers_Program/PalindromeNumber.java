/*Question: Write a Java program to check whether a number is a palindrome or not.

A palindrome number is a number that remains the same when reversed.

Examples:
- 121 → Palindrome
- madam is a word example, not a number
- 12321 → Palindrome
- 123 → Not a Palindrome*/


import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        if (num < 0) {
            System.out.println(num + " is Not a Palindrome Number");
        } else {

            while (num != 0) {

                int digit = num % 10;

                reverse = reverse * 10 + digit;

                num = num / 10;
            }

            if (original == reverse) {
                System.out.println(original + " is a Palindrome Number");
            } else {
                System.out.println(original + " is Not a Palindrome Number");
            }
        }

        sc.close();
    }
}
