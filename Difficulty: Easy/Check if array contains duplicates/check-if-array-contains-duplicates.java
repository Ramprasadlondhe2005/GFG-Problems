// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}