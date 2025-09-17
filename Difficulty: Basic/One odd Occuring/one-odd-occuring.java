class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        
        int xor = 0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }
}