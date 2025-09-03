import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int[] arr = new int[n];

    
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

    
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

    
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be equal).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

    }
}
