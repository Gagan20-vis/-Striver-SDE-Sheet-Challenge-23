public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        if(head == null || head.next == null) return null;
        Node slow = head,fast = head;
        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast == null) return null;
        if(slow == head)
            while(fast.next != slow) fast = fast.next;
        if(slow == fast) {
            slow = head;
            while(fast.next != slow.next){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return fast.next;
    }
}