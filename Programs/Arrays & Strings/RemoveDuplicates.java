import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array (makes duplicate removal easier)
        Arrays.sort(arr);

        // Remove duplicates
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // Add last element


        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
