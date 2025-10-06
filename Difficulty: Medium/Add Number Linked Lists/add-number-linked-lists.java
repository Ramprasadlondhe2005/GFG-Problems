/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node l1, Node l2) {
        // code here

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1!=null){
            s1.push(l1.data);
            l1 = l1.next;
        }
         while(l2!=null){
            s2.push(l2.data);
            l2 = l2.next;
        }
        
        Node result = null;
        int carry = 0;
        while(!s1.isEmpty()|| !s2.isEmpty() || carry!=0){
            int a = (!s1.isEmpty()) ? s1.pop() :0;
            int b = (!s2.isEmpty()) ? s2.pop() :0;
            
            int sum = carry + a + b;
            carry = sum /10;
            
            
           Node newNode = new Node(sum % 10);
           newNode.next = result;
           result = newNode;
            
        }
         while (result != null && result.data == 0) {
            result = result.next;
        }
        
        return (result!=null) ? result:new Node(0);
    }
}