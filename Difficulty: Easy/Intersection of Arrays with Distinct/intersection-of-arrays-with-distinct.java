class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> res = new HashSet<>();
        
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                res.add(b[i]);
            }
        }
        return res.size();
        
    }
}