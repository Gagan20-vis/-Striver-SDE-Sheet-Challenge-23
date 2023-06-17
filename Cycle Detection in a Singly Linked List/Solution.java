public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head == null || head.next == null)
            return false;
        Node slow = head;
        Node fast = head;
        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}