class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        
       
        HashSet<Integer> res = new HashSet<>();
        
        for(int a : arr1){
            res.add(a);
        }
        
        for(int b : arr2){
           res.add(b);
        }
        
        ArrayList<Integer> ans = new ArrayList<>(res);
        
        Collections.sort(ans);
        
        return ans;
    }
}
