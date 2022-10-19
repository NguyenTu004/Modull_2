package bai_2;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue(){
        this.head=null;
        this.tail=null;
    }
    public void enqueue(int key) {
        Node teamp = new Node(key);
        if (tail == null) {
            head = tail = teamp;
            return;
        }
        tail.next = teamp;
        tail = teamp;
    }
    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null){
            this.tail = null;
        }
        return temp;
    }


}
