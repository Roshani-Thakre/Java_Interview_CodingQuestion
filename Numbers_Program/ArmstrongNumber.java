/*Question: Write a Java program to check whether a number is an Armstrong number or not.

An Armstrong number is a number whose sum of digits raised to the power of the number of digits is equal to the original number.

For example:
153 = 1^3 + 5^3 + 3^3

153 = 1 + 125 + 27 = 153

Therefore, 153 is an Armstrong number.

Other examples: 0, 1, 153, 370, 371, 407, 1634, 9474.*/


import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        long sum = 0;

        if (num < 0) {

            System.out.println(num + " is Not an Armstrong Number");

        } else {

            // Count the number of digits
            do {
                digits++;
                temp = temp / 10;
            } while (temp != 0);

            temp = num;

            // Calculate the sum of digits raised to the power
            // of the total number of digits
            do {
                int digit = temp % 10;

                sum = sum + (long) Math.pow(digit, digits);

                temp = temp / 10;

            } while (temp != 0);

            // Compare the sum with the original number
            if (sum == original) {

                System.out.println(original + " is an Armstrong Number");

            } else {

                System.out.println(original + " is Not an Armstrong Number");
            }
        }

        sc.close();
    }
}
