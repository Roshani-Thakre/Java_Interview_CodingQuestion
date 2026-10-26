/*Question: Write a Java program to count the number of vowels and consonants in a given string.

Vowels: a, e, i, o, u

Consonants: All other English alphabet letters.

Example:
Input: Hello World

Vowels: 3
Consonants: 7*/


import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {

                    vowels++;

                } else {

                    consonants++;
                }
            }
        }

        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);

        sc.close();
    }
}
