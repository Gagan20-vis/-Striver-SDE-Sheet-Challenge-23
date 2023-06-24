public class Solution {
    public static Node merge(Node l1,Node l2){
        Node temp = new Node(0);
        Node res = temp;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.child = l1;
                temp = temp.child;
                l1 = l1.child;
            }
            else{
                temp.child = l2;
                temp = temp.child;
                l2 = l2.child;
            }
        }
        temp.child = (l1!=null) ? l1 : l2;
        return res.child;
    }
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head==null || head.next==null) return head;
        head.next = flattenLinkedList(head.next);
        head = merge(head,head.next);
        return head;
    }
}