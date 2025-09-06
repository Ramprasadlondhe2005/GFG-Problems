class Solution {
    boolean isBinary(String s) {
        // Your code here
        
        char arr [] = s.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != '0' && arr[i] != '1'){
                return false;
            }
        }
        return true;
    }
}