public class Solution
{
    public static Node removeKthNode(Node head, int n)
    {
        // Write your code here.
        if(head.next == null) return null;
        Node dummy = new Node();
        Node slow = dummy,fast = dummy;
        slow.next = head;

        for(int i = 1;i<=n+1;i++)
            fast = fast.next;

        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}