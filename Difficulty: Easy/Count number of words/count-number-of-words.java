//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.countWords(S));
        
System.out.println("~");
}
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countWords(String s) 
    { 
        s=s.replace("\\n", " ");
        s=s.replace("\\t", " ");
        
        String[] arr=s.trim().split("\\s+");

        return arr.length;  
        
        
    }
} 