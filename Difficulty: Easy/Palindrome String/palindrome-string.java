class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        
        for(int i=0;i<s.length()/2;i++){
            
            int n = s.length();
            
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        
        return true;
    }
}