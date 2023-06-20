public class Stack {
    int[] stack;
    int top = -1,size;
    Stack(int capacity){
        if(isFull()==0){
            stack = new int[capacity];
            size = capacity;
        }
    }
    void push(int num) {
        stack[++top] = num;
    }
    int pop() {
        return (isEmpty()==1) ? -1 : stack[top--];
    }
    int top() {
        return (isEmpty()==0) ? stack[top] : -1;
    }
    int isEmpty() {
        return (top==-1) ? 1 : 0;
    }
    int isFull() {
        return (top==size) ? 1 : 0;
    }
}
