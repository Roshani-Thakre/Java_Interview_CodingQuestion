/*Question: Write a Java program to sort an array in ascending order without using Arrays.sort().

We will use the Bubble Sort algorithm.*/


public class SortArray {

    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
