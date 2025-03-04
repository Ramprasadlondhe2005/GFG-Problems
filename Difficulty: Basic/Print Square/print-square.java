//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static void square(int s) {
    // Complete the code given below
    
    
        for (int i = 0; i < s; i++) {
            if (i == 0 || i == s - 1) { // First and last row
                for (int j = 0; j < s; j++) {
                    System.out.print("* ");
                }
            } else { // Middle rows
                System.out.print("*"); // First '*'
                for (int j = 1; j < s - 1; j++) {
                    System.out.print("  "); // Spaces between '*'
                }
                System.out.print(" *"); // Last '*'
            }
            System.out.println(); // Move to the next line
        }
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int s = scn.nextInt();
            square(s);

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends