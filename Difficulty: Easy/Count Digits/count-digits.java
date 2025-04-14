//{ Driver Code Starts

// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int rem=num%10;
            num/=10;
            count++;
           
        }
         System.out.println(count);
    }
}


//{ Driver Code Starts.
// } Driver Code Ends