/*Question: Write a Java program to check whether a string is a palindrome or not.

A palindrome string reads the same forward and backward.

Examples:
- madam → Palindrome
- level → Palindrome
- hello → Not a Palindrome*/


import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String original = str;

        // Ignore case differences
        str = str.toLowerCase();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {

            System.out.println(original + " is a Palindrome String");

        } else {

            System.out.println(original + " is Not a Palindrome String");
        }

        sc.close();
    }
}
