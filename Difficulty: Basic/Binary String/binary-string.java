class Solution {
    public int binarySubstring(String s) {
        // code here
        
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                c++;
            }
        }
        return c*(c-1)/2;
        
    }
}