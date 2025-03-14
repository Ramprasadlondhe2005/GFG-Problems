//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            // Read array input
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            long[] arr = new long[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Long.parseLong(inputArray[i]);
            }

            Solution solution = new Solution();
            System.out.println(solution.countFibonacciNumbers(arr));
            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
   public int countFibonacciNumbers(long[] arr) {
        int count = 0;
        for (long num : arr) {
            if (isFibonacci(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check if a number is a Fibonacci number
    private boolean isFibonacci(long n) {
        if (n == 0 || n == 1) return true;
        long a = 0, b = 1;
        while (b < n) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b == n;
    }
}
