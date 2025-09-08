package LL;

public class ReverseLL {

    public static void main(String[] args) {
        ReverseLL Rll = new ReverseLL();
        Rll.insertLast(1);
        Rll.insertLast(2);
        Rll.insertLast(3);
        Rll.insertLast(4);
        Rll.insertLast(5);
        Rll.display();
        Rll.reverseLL();
        Rll.display();
    }
    private Node head;
    private Node tail;
    private int size;
    public ReverseLL() {
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
    public void reverseLL(){
        Node prev =null;
        Node present = head;
        Node next = head.next;
        while(present!=null){
        present.next=prev;
        prev=present;
        present=next;
        if(next!=null){
        next=present.next;}
        }
        head=prev;
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

