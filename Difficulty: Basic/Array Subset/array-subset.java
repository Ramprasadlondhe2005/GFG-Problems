
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int ptr=0;
        for(int i=0;i<a.length;i++){
            if(b[ptr] == a[i]){
                ptr++;
            }
            if(ptr == b.length)
            {
                return true;
            }
        }
        return false;
    }
}
