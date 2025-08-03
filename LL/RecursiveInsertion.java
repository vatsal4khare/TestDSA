package LL;

public class RecursiveInsertion {
    public static void main(String[] args) {
        RecursiveInsertion ri =new RecursiveInsertion();
        ri.insertFirst(3);
        ri.insertFirst(2);
        ri.insertFirst(1);
        ri.insertLast(5);
        ri.insert(55,2);
        ri.display();
//        System.out.println(ri.deleteFirst());
        ri.deleteFirst();
        ri.display();
        ri.deleteLast();
        ri.display();
        ri.insertRec(77,2);
        ri.display();
    }
    private Node head;
    private Node tail;
    private int size;
    public RecursiveInsertion() {
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
    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp= head;
        for(int i= 1; i <index ; i ++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size=size+1;
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
    public void deleteLast(){
        Node temp =head;
        for(int i = 1 ; i < size-1  ; i ++){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
        size=size-1;
    }
    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size=size-1;
//        return size;
    }


    public void insertRec(int val, int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
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


