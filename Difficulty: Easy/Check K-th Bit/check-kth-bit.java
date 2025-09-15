class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        
        int bitMask = 1<<k;
        if((n & bitMask) == 0){
            return false;
        }
        else
        {
            return true;
        }
    }
}