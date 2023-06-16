import java.io.*;
import java.util.* ;

/****************************************************************

 Following is the class structure of the Node class:

 class Node
 {
 public:
 int data;
 Node *next;
 Node(int data)
 {
 this->data = data;
 this->next = NULL;
 }
 };

 *****************************************************************/

public class Solution {
    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        // Write your code here.
        if(head==null || head.next==null || n==1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy,curr = dummy,next=dummy;
        int count = 0;
        while(curr.next!=null){
            count++;
            curr = curr.next;
        }
        for(int i=0;i<n;i++){
            if(count==0) break;
            if(b[i]==0)continue;
            curr = prev.next;
            next = curr.next;
            for(int j = 1;j<Math.min(b[i],count);j++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            count -= Math.min(b[i],count);

        }
        return dummy.next;
    }
}