package Queue;

public class CustomQueue {
    private int[] queue;
    private static final int Default_Size=10;
    private int end =-1;
    private int size;
    public CustomQueue(int size) {
        this.size=size;
        this.queue = new int[size];
        this.end =-1;

    }
    public CustomQueue(){
        this(Default_Size);
    }
    public boolean isEmpty(){
        if(end ==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(end ==size-1){
            return true;
        }
        return false;
    }
    public int remove() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Cannot pop from an empty queue!!");
        }
        int removed = queue[0];

        for(int i = 1 ; i <= end ; i ++){
            queue[i-1]=queue[i];
        }
        end--;
        return removed;
    }

    public void add(int value) throws QueueException {
        if(isFull()){
//            throw new QueueException("Cannot push in a full queue!!");
            int[] temp = new int[queue.length*2];
            int count=0;
            while(count!=queue.length){
                temp[count]=queue[count];
            }
            size=queue.length*2;
            queue=temp;
        }
        end++;
        queue[end]=value;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Empty!");
        }
        else {
            System.out.print("Queue Elements: ");
            for (int i = 0; i <= end; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws QueueException {
        CustomQueue cs= new CustomQueue();
        cs.add(12);
        System.out.println(cs.remove());
        cs.add(10);
        cs.add(11);
        cs.display();

    }
}
