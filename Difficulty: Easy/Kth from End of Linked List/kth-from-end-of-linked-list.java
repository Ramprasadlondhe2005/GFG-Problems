/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        
        
        if(count< k) return -1;
        
        temp = head;
        for(int i=0;i<count-k;i++){
            
            temp = temp.next;
            
        }
        return temp.data;
    }
}