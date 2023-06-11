public class Solution
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
    {
        // Write your code here!
        LinkedListNode<Integer> curr = head,next=null,prev=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}