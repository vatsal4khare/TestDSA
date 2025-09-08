package LL;

public class ReverseNodeInKGroup {

    public static void main(String[] args) {
        ReverseNodeInKGroup Rll = new ReverseNodeInKGroup();
        Rll.insertLast(1);
        Rll.insertLast(2);
        Rll.insertLast(3);
        Rll.insertLast(4);
        Rll.insertLast(5);

        Rll.display();
        ReverseInKGroup(Rll.head,2);
        Rll.display();
    }
    private static Node head;
    private Node tail;
    private int size;
    public ReverseNodeInKGroup() {
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
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void display(Node node){
        Node temp=node;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static Node findMiddle(Node node){
        if(node==null){
            return node;
        }
        Node slow = node;
        Node fast = node;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        display(slow);
        return slow;
    }
    public static Node reverseList(Node node){
        if(node == null){
            return node;
        }
        Node prev = null;
        Node present = node;
        Node tempnext = node.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=tempnext;
            if(tempnext!=null){
                tempnext = tempnext.next;
            }
        }
        display(prev);
        while(prev.next!=null){
            prev=prev.next;
        }
        return prev;
    }
    public static void ReverseInKGroup(Node node, int k) {

        if (node == null || node.next == null) {
            return;
        }
        if (k == 0) {
            return;
        }
        Node ogHead = node;
        Node temphead = node;
        while (ogHead != null) {
            for (int i = 0; i < k-1 && temphead.next!=null; i++) {
                temphead = temphead.next;
            }
            Node nexthead = temphead.next;
            temphead.next = null;
            Node reversedhead = reverseList(ogHead);
            reversedhead.next = nexthead;
            ogHead = nexthead;
            temphead=nexthead;
        }

        display();
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

