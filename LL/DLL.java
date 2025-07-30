package LL;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    DLL(){
        this.size=0;
    }

    public void insert(Node prev, int val){
        if(prev.next==null){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        node.next=prev.next;
        node.prev=prev;
        prev.next=node;
        prev.next.prev=node;
        size=size+1;

    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value==val)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
        head.prev=node;}
        head=node;
        size=size+1;
        if(tail==null){
            tail=node;
        }
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        tail=node;
        size=size+1;
    }
    public void insertLastWithoutTail(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node last = head;
        while(last.next!=null)
        {
            last=last.next;
        }
        Node node = new Node(val);
        node.next=null;
        node.prev=last;
        last.next=node;
        tail=node;
        size=size+1;
    }
    public void display(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print(temp.value + " -> END");
        System.out.println();
    }
    public void displayRev(){
        System.out.println("Print in reverse");
        Node temp = tail;
        while(temp.prev!=null){
            System.out.print(temp.value + " <- ");
            temp=temp.prev;
        }
        System.out.print(temp.value + " <- Start");
        System.out.println();
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value=value;
        }
        Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
