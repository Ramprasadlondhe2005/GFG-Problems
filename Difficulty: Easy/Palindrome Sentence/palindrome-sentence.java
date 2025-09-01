class Solution {
    public boolean isPalinSent(String s) {
        // code here
     
     s = s.toLowerCase();
     
     s = s.replaceAll("[^a-z0-9]","");
     
     String rev = new StringBuilder(s).reverse().toString();
     
     return s.equals(rev);
    }
}