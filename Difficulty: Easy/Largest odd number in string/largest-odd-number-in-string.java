class Solution {

    String maxOdd(String s) {
        // code here
        
        if((s.charAt(s.length()-1)-'0')%2 == 1) return s;
        
        char[] arr = s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(((arr[i]-'0')%2)==1){
                return s.substring(0,i+1);
            }
        }
        
        return "";
        
    }
}