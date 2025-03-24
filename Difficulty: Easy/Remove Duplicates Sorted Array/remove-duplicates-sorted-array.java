//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();
            int len = obj.removeDuplicates(arr);
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        
        LinkedHashSet<Integer> l1=new LinkedHashSet<>();
        for (int num : arr) 
        {
            l1.add(num); 
        }
        
        int i=0;
        for(int num:l1)
        {
            arr[i++]=num;
        }
        return l1.size();
    }
}
