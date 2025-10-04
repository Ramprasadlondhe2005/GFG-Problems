/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        
        /*
        Node temp = head;
        while(temp!=null){
            if(temp.data == temp.next.data){
                temp = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
        */
        
        if (head == null) return null;
         
        HashSet<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            if(seen.contains(curr.data)){
                prev.next = curr.next;
            }
            else{
                seen.add(curr.data);
                prev = curr;
            }
             curr = curr.next;
        }
        return head;
       
    }
}