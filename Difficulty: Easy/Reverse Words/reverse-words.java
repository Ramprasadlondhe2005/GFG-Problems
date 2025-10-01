class Solution {
    public String reverseWords(String s) {
        // Code here
        
        String[] arr = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].isEmpty()){
                
             if(sb.length()>0) sb.append(".");
             
                  sb.append(arr[i]);
                    
                    
            }
        }
        
        return sb.toString();
        
    }
}
