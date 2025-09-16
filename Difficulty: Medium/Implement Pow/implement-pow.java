class Solution {
    double power(double x, int n) {
        // code here
        
        double ans = 1;
        
        if(n<0)
        {
            
            x = 1 / x;
            n = -n;
        }
        
        
        while(n>0)
        {
            if((n&1) !=0)
            {
                ans = ans * x;
            }
            x = x * x;
            n = n>>1;
        }
         return ans;
    }
   
}