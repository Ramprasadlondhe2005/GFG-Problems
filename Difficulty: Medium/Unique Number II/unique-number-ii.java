//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends

class Solution {
    // public int[] singleNum(int[] arr) {
    //     // Code here
        
    //     HashSet<Integer> h1=new HashSet<>();
        
    //     for(int num:arr)
    //     {
    //         if(h1.contains(num))
    //         {
    //             h1.remove(num);
    //         }
    //         else
    //         {
    //             h1.add(num);
    //         }
    //     }
        
    //     int[] a1 = new int[h1.size()];
    //     int idx = 0;
    //     for(int num : h1){
    //         a1[idx++] = num;
    //     }
        
    //     return a1;
    // }
    
    
    public int[] singleNum(int[] nums) {
        
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i] , 1);
            }
            else{
                hm.put(nums[i] , hm.get(nums[i])+1);
            }
        }
        
        ArrayList<Integer> Al = new ArrayList<>();
        for(int num : hm.keySet()){
            if(hm.get(num) == 1){
                Al.add(num);
            }
        }
        
        int[] ans = new int[Al.size()];
        int idx=0;
        for(int num : Al){
            ans[idx++] = num;
        }
        Arrays.sort(ans);
        return ans;
        
    }
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            // int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int[] ans = ob.singleNum(arr);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends