class Solution {
    public static String encode(String s) {
        // code here
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<s.length();i++){
            
            int count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count > 0){
                sb.append(count);
            }
        }
        
        return sb.toString();
    }
}