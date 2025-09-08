package LL;

public class ReverseLLRecursive {

    public static void main(String[] args) {
        ReverseLLRecursive Rllr = new ReverseLLRecursive();
        Rllr.insertLast(1);
        Rllr.insertLast(2);
        Rllr.insertLast(3);
        Rllr.insertLast(4);
        Rllr.insertLast(5);
        Rllr.display();
        reverseLLrecursive(head);
        Rllr.display();
    }
    private static Node head;
    private static Node tail;
    private int size;
    public ReverseLLRecursive() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head; // whenever adding a new element, whatever the head previously was needs to be the next
        // element of the element we are adding at the first position
        head=node;
        if(tail==null){
            tail=head;
        }
        size =size+1;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size =size+1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void reverseLLrecursive(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverseLLrecursive(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
             this.value=value;
             this.next=next;
        }
    }
}

