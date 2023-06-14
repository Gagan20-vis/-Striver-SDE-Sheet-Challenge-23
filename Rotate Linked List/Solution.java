public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head==null || head.next==null) return head;
        int length = 1;
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
            length++;
        }
        k %=length;
        curr.next = head;
        int end = length-k;
        while(end-- !=0) curr = curr.next;
        head = curr.next;
        curr.next = null;
        return head;
    }
}