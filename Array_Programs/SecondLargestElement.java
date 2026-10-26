/*Question: Write a Java program to find the second-largest 
            distinct element in an array without sorting.*/


public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 25, 40, 15, 30};

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {

            if (largest == null || num > largest) {

                secondLargest = largest;
                largest = num;

            } else if (num < largest &&
                       (secondLargest == null || num > secondLargest)) {

                secondLargest = num;
            }
        }

        if (secondLargest == null) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
