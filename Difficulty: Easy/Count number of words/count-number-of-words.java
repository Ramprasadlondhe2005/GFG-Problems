// User function Template for Java
class Solution {
    int countWords(String s) {
        // code here
        
         s = s.replace("\\n", " ").replace("\\t", " ")
             .replace("\n", " ").replace("\t", " ");
             
        s = s.trim();
        
        return s.split("\\s+").length;
    }
}