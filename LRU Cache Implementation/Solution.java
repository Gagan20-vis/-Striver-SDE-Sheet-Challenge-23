import java.util.HashMap;
public class LRUCache
{
    class ListNode{
        int key,value;
        ListNode next,prev;
        ListNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    ListNode head = new ListNode(0,0),tail = new ListNode(0,0);
    HashMap<Integer,ListNode> map;
    int capacity;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) remove(map.get(key));
        if(map.size()==capacity) remove(tail.prev);
        insert(new ListNode(key,value));
    }
    private void insert(ListNode node){
        map.put(node.key,node);
        ListNode headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }
    private void remove(ListNode node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

