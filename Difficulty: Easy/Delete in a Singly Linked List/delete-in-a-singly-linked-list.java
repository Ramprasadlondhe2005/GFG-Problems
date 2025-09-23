/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        
        // int size = 0;
        // Node temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     size++;
        // }
        
        
        if(x == 1){//First Or Head Node Deleted
            head = head.next;
            return head;
        }
        
        int i=1;
        Node prev = head;
        while(i < x-1){
            prev = prev.next;
            i++;
        }
        
        prev.next = prev.next.next;
        return head;
    }
}