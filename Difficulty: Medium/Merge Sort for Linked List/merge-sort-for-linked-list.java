/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node mergeSort(Node head) {
        // code here
        
        if(head == null || head.next == null){
            return head;
        }
        List<Integer> ll = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            ll.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(ll);
        
        temp = head;
        for(int val : ll){
            temp.data = val;
            temp = temp.next;
        }
        
        return head;
    }
}