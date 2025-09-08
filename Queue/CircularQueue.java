package Queue;

import javax.xml.transform.Source;

public class CircularQueue {
    private int[] circularQueue;
    private static final int Default_Size=5;
    private int end =0 ;
    private int front =0;
    private int size = 0 ;
    public CircularQueue(int size) {
        this.circularQueue = new int[size];
    }
    public CircularQueue(){
        this(Default_Size);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        if(size == circularQueue.length){
            return true;
        }
        return false;
    }
    public int remove() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Cannot pop from an empty queue!!");
        }
        int removed = circularQueue[front++];
        front = front % circularQueue.length;
        size--;
        return removed;
    }

    public void add(int value) throws QueueException {
        if(isFull()){
            throw new QueueException("Cannot push in a full queue!!");
        }
        circularQueue[end++]=value;
        end=end%circularQueue.length;
        size++;
    }

    public void display() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Empty queue!!");
        }
        int i = front;
        do {
            System.out.print(circularQueue[i] + " -> ");
            i++;
            i%=circularQueue.length;
        }while(i!=end);
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) throws QueueException {
        CircularQueue cq = new CircularQueue(5);
        cq.add(2);
        cq.add(4);
        cq.add(6);
        cq.add(8);
        cq.add(10);
        cq.display();
        System.out.println(cq.remove());
        cq.display();
        cq.add(12);
        cq.display();
    }
}
