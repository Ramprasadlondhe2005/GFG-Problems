class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        
        Map<Character,Integer> counts = new HashMap<>();
        for(char c : s.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(counts.get(ch) == 1){
                return ch;
            }
        }
        return '$';
    }
}
