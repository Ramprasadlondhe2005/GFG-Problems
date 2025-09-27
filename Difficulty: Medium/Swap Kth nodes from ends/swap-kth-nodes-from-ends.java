/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        
        int n = 0;
        Node temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        
         if (k <= 0 || k > n) return head; 
        
        Node first = head;
        for(int i=1;i<k;i++){
            first = first.next;
        }
        
        Node second = head;
        for(int i=1;i<n-k+1;i++){
            second = second.next;
        }
        
        int val = first.data;
        first.data = second.data;
        second.data = val;
        
        return head;
    }
}
