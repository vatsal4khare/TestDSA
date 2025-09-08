package LL;

public class MiddleOfLL {
    public static int size ;
    public Node head;
    public Node tail;
    public static void main(String[] args) {

        MiddleOfLL ll =new MiddleOfLL();
        ll.insertLast(15);
        ll.insertLast(11);
        ll.insertLast(9);
        ll.insertLast(4);
        ll.insertLast(2);
        ll.insertLast(1);
        ll.display();
        printNode(middleNode(ll.head));
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void printNode(Node head){
        System.out.println(head.val);
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
    public static Node middleNode(Node head){
        Node fast= head;
        Node slow= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
            return slow;

    }

    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
        Node(){
        }
    }
}
