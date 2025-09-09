class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
     
     
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
       
       for(int num1 : b){
           setB.add(num1);
       }
       
       for(int num2 : a){
           if(setB.contains(num2)){
               res.add(num2);
           }
       }
        
        return new ArrayList<>(res);
    }
}