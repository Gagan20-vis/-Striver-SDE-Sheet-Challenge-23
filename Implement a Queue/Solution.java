import java.util.* ;
import java.io.*;
public class Queue {
    private int[] arr;
    private int rear;
    Queue() {
        // Implement the Constructor
        rear = 0;
        arr = new int[5000];
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        return rear==0;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        arr[rear++] = data;
    }

    int dequeue() {
        // Implement the dequeue() function
        if(isEmpty()) return -1;
        int ans = arr[0];
        for(int i = 1;i<rear;i++) arr[i-1] = arr[i];
        rear--;
        return ans;
    }

    int front() {
        // Implement the front() function
        if(isEmpty()) return -1;
        return arr[0];
    }

}
