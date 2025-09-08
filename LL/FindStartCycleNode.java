package LL;

public class FindStartCycleNode {
    public static void main(String[] args) {
        FindStartCycleNode ll =new FindStartCycleNode();
        ll.insert(15);
        ll.insert(9);
        ll.insert(4);
        ll.insert(2);
        ll.insert(1);
        ll.display();
        System.out.println();

        FindStartCycleNode clc=new FindStartCycleNode();
//        if(clc.checkListCycle(ll.head)==true){
//            System.out.println("Cycle Exists");
//        }else
//        {
//            System.out.println("Cycle does not exist");
//        }
//        System.out.println(clc.checkListCycleLength(ll.head));

        clc.PrintNode(clc.detectCycle(ll.head));
    }

    private Node head;
    private Node tail;
    private int size;
    public FindStartCycleNode() {
        this.size = 0;
    }
    public void PrintNode(Node node){
        System.out.println(node.value);
    }
    public void display(){
        Node temp = head;
        while(temp.next!=head) {
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print(temp.value + " -> Again  points to Head and continues..");
    }
    public void insert(int val){ //insert after tail and before head
        if(head==null && tail==null){
            Node node = new Node(val);
            head=node;
            tail=node;
            tail.next=head;
            head.next=tail;
            size = size+1;
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        node.next=head;
        tail = node;
        size=size+1;
    }

    public boolean checkListCycle(Node head){
            Node fast = head;
            Node slow = head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
    }

    public int checkListCycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
//                find length
                Node temp = slow;
                temp=temp.next;
                int length=1;
                while(temp!=fast){
                    length++;
                    temp=temp.next;
                }
                return length;
            }
        }
        return 0;
    }


    public Node detectCycle(Node head) {
            int length = 0;

            Node fast = head;
            Node slow = head;

            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    length=checkListCycleLength(slow);
                    break;
                }
            }
            Node first  = head;
            Node second = head;

            if(length==0){
                return null;
            }

            while(length>0){
                second=second.next;
                length--;
            }

            while(first!=second){
                first=first.next;
                second=second.next;
            }
            return first;
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


