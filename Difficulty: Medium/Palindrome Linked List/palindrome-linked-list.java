/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        
        List<Integer> ll = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            ll.add(temp.data);
            temp=temp.next;
        }
        
        int i = 0;
        int j = ll.size()-1;
        
        while(i<j){
            if(!ll.get(i).equals(ll.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}