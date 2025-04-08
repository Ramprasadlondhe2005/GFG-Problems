//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<String> result = ob.pattern(S);
            for (String value : result) {
                System.out.println(value);
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<String> pattern(String s) {
        // code here
        
        ArrayList<String> res=new ArrayList<>();
        
        for(int i=s.length();i>0;i--)
        {
            res.add(s.substring(0,i));
        }
        return res;
    }
};