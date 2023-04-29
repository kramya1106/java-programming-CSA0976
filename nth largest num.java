import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        if (n > size) {
            System.out.println("Error: N is greater than the size of the array.");
        } else {
            Arrays.sort(arr);
            int nthLargest = arr[size - n];
            System.out.println("The " + n + "th largest number is: " + nthLargest);
        }
    }
}
