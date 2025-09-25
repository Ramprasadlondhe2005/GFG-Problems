// User function Template for Java

class Solution {
    public int reverseBits(int n) {
        // code here
        
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        int num = Integer.parseInt(sb.toString(),2);
        
        return num;
        
    }
}