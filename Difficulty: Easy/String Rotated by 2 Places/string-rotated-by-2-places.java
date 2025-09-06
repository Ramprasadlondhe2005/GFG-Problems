class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        
        String str1 = s1 + s1;
        String str2 = s2 + s2;
        
        int x = str1.indexOf(s2);
        int y = str2.indexOf(s1);
        
        if(x == 2 || y == 2){
            return true;
        }
        
        return false;
    }
}