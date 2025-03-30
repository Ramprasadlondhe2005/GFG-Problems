//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str1 = read.readLine();
            String str2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(str1, str2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
     static String removeChars(String str1, String str2) 
    {
        // code here
        String res="";
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);

            if(!str2.contains(String.valueOf(ch)))
            {
                res+=ch;
            }
        }
        return res;    
    }
}