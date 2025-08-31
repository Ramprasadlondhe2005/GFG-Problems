// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        
        char[] sArr = s1.toCharArray();
        char[] tArr = s2.toCharArray();
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        for(int i=0;i<=sArr.length-1;i++)
        {
            if(sArr[i]!=tArr[i]){
                return tArr[i];
            }
            
        }
        return tArr[tArr.length-1];
    }
}
