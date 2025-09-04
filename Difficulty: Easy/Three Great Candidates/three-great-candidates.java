// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        // code here
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        int max1 = arr[n-1] * arr[n-2] * arr[n-3];
        int max2 = arr[0] * arr[1] * arr[n-1];
        
        int Max = Math.max(max1,max2);
        
        return Max;
    }
}
