/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        
        if(head == null || head.next == null) return head;
        
        int size =0;
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        
        k = k % size;
        if(k == 0) return head;
        
        Node temp = head;
        for(int i = 1;i<k;i++){
            temp = temp.next;
        }
        Node newHead = temp.next;
        temp.next = null;
        
        Node tail = newHead;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = head;
        return newHead;
    }
}