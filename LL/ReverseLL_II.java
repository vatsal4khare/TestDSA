package LL;

public class ReverseLL_II {

    public static void main(String[] args) {
        ReverseLL_II Rll = new ReverseLL_II();
        Rll.insertLast(1);
        Rll.insertLast(2);
        Rll.insertLast(3);
        Rll.insertLast(4);
        Rll.insertLast(5);
        Rll.display();
        Rll.display(Rll.reverseLL(Rll.head,2,4));
    }
    private Node head;
    private Node tail;
    private int size;
    public ReverseLL_II() {
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
    public void display(Node node){
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public Node reverseLL(Node node, int left, int right){
        if(left==right){
            return node;   // This means when the position left and right are equal, they both are pointing to the same position in the given list and hence 1 node cannot be reversed with itself so the list remains the same.
        }

        //skip the first left - 1 nodes
        Node present =node;
        Node prev = null;
        for(int i = 0 ; present!=null && i < left-1 ; i ++){
             prev=present;
             present=present.next;
        }

        Node last = prev;
        Node newEnd = present;

        //reverse between left and right
        Node tempnext=present.next;
        for(int i = 0 ; present!=null && i < right-left + 1; i ++){
            present.next=prev;
            prev=present;
            present=tempnext;
            if(tempnext!=null){
                tempnext=tempnext.next;
            }
        }

        if(last!=null){
            last.next=prev;
        }else {
            head=prev;
        }
        newEnd.next=present;
        return head;
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

