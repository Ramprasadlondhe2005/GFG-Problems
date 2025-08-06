class Solution {
    public static int largest(int[] arr) {
        // code here
        int Largest = arr[0];
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i] > Largest)
            {
                Largest = arr[i];
            }
            
        }
        return Largest;
    }
}
