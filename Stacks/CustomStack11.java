package Stacks;
public class CustomStack11{
    private int[] stack;
    private static final int Default_Size=10;
    private int ptr=-1;
    private int size;
    public CustomStack11(int size) {
        this.size=size;
        this.stack = new int[size];
        this.ptr=-1;

    }
    public CustomStack11(){
        this(Default_Size);
    }
    public boolean push(int value){
        if(isFull()){
            int[] temp = new int[stack.length*2];
            int count = 0 ;
            while(stack.length!=count){
                temp[count]=stack[count];
                count++;
            }
            stack=temp;
            size=stack.length*2;
        }
        if(ptr==size-1){ //this means that the ptr has reached the size of the stack and the stack is full
            System.out.println("Stack Overflow! Cannot push "+value);
            return false;
        }
        ptr++;
        stack[ptr]=value;
        return true;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty!");
        }
        return stack[ptr];
    }
    public boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(ptr==size-1){
            return true;
        }
        return false;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return stack[ptr--];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Empty! - Cannot pop out");
        }
        else {
            System.out.print("Stack Elements: ");
            for (int i = 0; i <= ptr; i++) {
                System.out.print(stack[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws StackException {
        CustomStack11 cs1= new CustomStack11(5); //Creating a stack size specififed by the user
        cs1.push(2);
        cs1.display();

        CustomStack11 cs = new CustomStack11();
        cs.push(11);
        System.out.println(cs.pop());
//        cs.pop(); //Will throw custom made exception
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6);
        cs.push(7);
        cs.push(8);
        cs.push(9);
        cs.push(10);
        cs.push(11);
        cs.display();
        System.out.println(cs.peek());
    }
}
