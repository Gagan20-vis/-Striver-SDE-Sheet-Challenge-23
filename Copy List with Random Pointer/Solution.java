import java.io.*;
import java.util.* ;

/*************************************************************

 Following is the LinkedListNode class structure

 class LinkedListNode<T> {
 T data;
 LinkedListNode<T> next;
 LinkedListNode<T> random;

 public LinkedListNode(T data) {
 this.data = data;
 }
 }

 *************************************************************/

public class Solution {
    public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        // Write your code here.
        LinkedListNode<Integer> iter = head,front = head;
        while(iter!=null){
            front = iter.next;
            LinkedListNode<Integer> copy = new LinkedListNode<Integer>(iter.data);
            iter.next = copy;
            copy.next = front;
            iter = front;
        }
        iter = head;
        while(iter!=null){
            if(iter.random!=null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        LinkedListNode<Integer> pseudoHead = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> copy = pseudoHead;
        while(iter!=null){
            front = iter.next.next;
            copy.next = iter.next;
            copy = copy.next;
            iter.next = front;
            iter = front;
        }
        return pseudoHead.next;
    }
}
