class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        
        int ans = a^b;
        return Integer.bitCount(ans);
    }
}
