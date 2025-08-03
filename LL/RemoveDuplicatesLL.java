package LL;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDuplicatesLL {
    public static void main(String[] args) {
        RemoveDuplicatesLL ll =new RemoveDuplicatesLL();
        ll.insertFirst(3);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertFirst(1);
        ll.display();
        ll.removeDuplicates();
        ll.display();
    }
    private Node head;
    private Node tail;
    private int size;
    public RemoveDuplicatesLL() {
        this.size = 0;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
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

    public void removeDuplicates(){
        Node temp = head;
        while(temp.next!=null){
            if(temp.value!=temp.next.value){
                temp=temp.next;
            }
            else{
                if(temp.next.next==null){
                    temp.next=null;
                    break;
                }
             temp.next=temp.next.next;
             size--;
            }
        }
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


