package LL;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        MergeTwoSortedLL ll =new MergeTwoSortedLL();
        ll.insertFirst(15);
        ll.insertFirst(9);
        ll.insertFirst(4);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.display();

        MergeTwoSortedLL ll1 =new MergeTwoSortedLL();
        ll1.insertFirst(4);
        ll1.insertFirst(3);
        ll1.insertFirst(1);
        ll1.display();

//        MergeTwoSortedLL ml =new MergeTwoSortedLL();
//        LL obj1=ml.mergeTwoSortedLL(ll.head,ll1.head);
//        obj1.display();

        MergeTwoSortedLL msll=new MergeTwoSortedLL();
        Node temp =msll.mergeTwoSortedLL1(ll.head,ll1.head);
        msll.display(temp);

    }
    private Node head;
    private Node tail;
    private int size;
    public MergeTwoSortedLL() {
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
    public void display(Node head){
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

    public LL mergeTwoSortedLL(Node h1, Node h2){
        Node f=h1;
        Node s=h2;

        LL ans = new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }
            else {
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

    public Node mergeTwoSortedLL1(Node h1,Node h2){
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while(h1!=null && h2!=null){
            if(h1.value<h2.value){
            tail.next=h1;
            h1=h1.next;
            tail=tail.next;}
            else {
                tail.next=h2;
                h2=h2.next;
                tail=tail.next;
            }
        }
        tail.next=(h1!=null)?h1:h2;
        return dummyHead.next;
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

        public Node() {

        }
    }
}


