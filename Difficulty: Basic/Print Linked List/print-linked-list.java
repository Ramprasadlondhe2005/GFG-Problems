/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        
        ArrayList<Integer> ll = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            ll.add(temp.data);
            temp = temp.next;
        }
        return ll;
    }
}