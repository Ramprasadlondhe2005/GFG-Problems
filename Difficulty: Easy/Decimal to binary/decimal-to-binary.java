class Solution {
    static String decToBinary(int n) {
        // code here
        
        String binary = "";
        
        if(n == 0)
        {
            return "0";
        }
        
        while(n > 0)
        {
            binary = n % 2 + binary;
            n = n /2;
        }
        return binary;
    }
}