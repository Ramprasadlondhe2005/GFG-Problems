/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        
        HashSet<Node> hash = new HashSet<>();
        Node temp = head;
        while(temp!=null){
            if(hash.contains(temp)){
                return temp.data;
            }
            hash.add(temp);
            temp = temp.next;
        }
        return -1;
    }
}