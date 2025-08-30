// User function Template for Java

class Solution {
    public int findMatching(String text, String pat) {
        // Code here
        
        if(text.contains(pat))
        {
            return text.indexOf(pat);
        }
        return -1;
    }
}
