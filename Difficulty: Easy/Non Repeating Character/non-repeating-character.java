class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        
        for(int i =0; i<s.length(); i++)
        {
            int c = s.charAt(i);
            
            if(s.indexOf(c) == s.lastIndexOf(c))
            {
                return s.charAt(i);
            }
        }
        return '$';
    }
}
