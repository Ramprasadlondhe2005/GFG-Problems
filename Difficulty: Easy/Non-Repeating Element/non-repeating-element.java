class Solution {
    public int firstNonRepeating(int[] arr) {
      
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (freq.get(arr[i]) == 1) {
                return arr[i];   
            }
        }

        return 0; 
    }
}
