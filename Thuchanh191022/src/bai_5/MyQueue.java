package bai_5;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head=0;
    private int tail=-1;
    private int currentSize=0;

    public MyQueue(int capacitySize) {
        this.capacity=capacitySize;
        queueArr=new int[capacity];
    }
    public boolean isQueueFull() {
        boolean status=false;
        if (currentSize == capacity) {
            status=true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            queueArr[tail] = item;
            if (tail == capacity - 1) {
                tail = -1;
            }

            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
            System.out.println(tail);
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity) {
                System.out.println("Pop operation done ! removed: " + queueArr[head-1]);
                System.out.println(head);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head-1]);
                System.out.println(head);
            }

            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(100);
//        queue.dequeue();
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
//        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
//        queue.enqueue(24);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(98);
        queue.dequeue();
//        queue.enqueue(45);
//        queue.enqueue(23);
//        queue.enqueue(435);
    }
}
