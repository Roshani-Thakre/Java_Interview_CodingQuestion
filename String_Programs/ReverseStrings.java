/*Question: Write a Java program to reverse a string without using the built-in reverse() method.

Example:
Input:  Hello
Output: olleH */


import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);

        sc.close();
    }
}
