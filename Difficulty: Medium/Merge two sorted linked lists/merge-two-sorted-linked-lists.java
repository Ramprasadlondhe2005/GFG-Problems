/*
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
    Node sortedMerge(Node head1, Node head2) {
        // code here
        
        ArrayList<Integer> values = new ArrayList<>();
        while(head1!=null){
            values.add(head1.data);
            head1 = head1.next;
        }
        
        while(head2!=null){
            values.add(head2.data);
            head2 = head2.next;
        }
        
        if(values.isEmpty()){
            return null;
        }
        
        Collections.sort(values);
        
        Node head = new Node(values.get(0));
        Node curr = head;
        for(int i=1;i<values.size();i++){
            curr.next = new Node(values.get(i));
            curr = curr.next;
        }
        return head;
    }
}