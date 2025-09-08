package LL;

public class PalindromeLL {

    public static void main(String[] args) {
        PalindromeLL Rll = new PalindromeLL();
        Rll.insertLast(1);
        Rll.insertLast(2);
        Rll.insertLast(3);
//        Rll.insertLast(3);
        Rll.insertLast(2);
        Rll.insertLast(1);

        Rll.display();
        System.out.println(Rll.PalindromeLL(Rll.head));
    }
    private Node head;
    private Node tail;
    private int size;
    public PalindromeLL() {
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
    public Node findMiddle(Node node){
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
    public Node reverseList(Node node){
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
        return prev;
    }
    public boolean PalindromeLL(Node node){
        Node midNode = findMiddle(node);
        Node ogHead= node;
        Node midHead = reverseList(midNode);// mid Node is only the middle node and not the head of the reversed second half of the og LL
        Node midStoredHead=midHead;

        while(ogHead!=null && midHead!=null){
            if(ogHead.value!=midHead.value){
                break;
            }
            ogHead=ogHead.next;
            midHead=midHead.next;
        }

        Node backToOgMidHead=reverseList(midStoredHead);
        display(ogHead);
        if(ogHead==null||midHead==null){
            return true;
        }
        return false;
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

