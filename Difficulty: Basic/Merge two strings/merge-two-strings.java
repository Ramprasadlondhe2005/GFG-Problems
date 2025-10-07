// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here
        
        int max = Math.max(S1.length(),S2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<max;i++){
            
            if(i<S1.length()){
                sb.append(S1.charAt(i));
            }
            
            if(i<S2.length()){
                sb.append(S2.charAt(i));
            }
        }
        return sb.toString();
    }
}