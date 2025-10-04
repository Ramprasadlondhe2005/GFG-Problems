/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        
        Node newNode = new Node(x);
        
        if(head==null){
            return newNode;
        }
        
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        
        
        tail.next = newNode;
        
        return head;
    }
}