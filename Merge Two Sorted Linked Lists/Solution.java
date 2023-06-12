import java.io.*;
import java.util.* ;

/************************************************************

 Following is the linked list node structure:

 class LinkedListNode<T> {
 T data;
 LinkedListNode<T> next;

 public LinkedListNode(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {
    private static LinkedListNode<Integer> solve(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
        if(head1.next==null){
            head1.next = head2;
            return head1;
        }
        LinkedListNode<Integer> first = head1,second = head2,f_next = head1.next,s_next = head2.next;
        while(f_next!=null && second!=null){
            if(first.data<=second.data && second.data<=f_next.data){
                first.next = second;
                s_next = second.next;
                second.next = f_next;
                first = second;
                second = s_next;
            }
            else{
                first = f_next;
                f_next = f_next.next;
                if(f_next==null){
                    first.next = second;
                    return head1;
                }
            }
        }
        return head1;
    }
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        if(first==null) return second;
        if(second==null) return first;
        if(first.data>second.data) return solve(second,first);
        return solve(first,second);
    }
}
