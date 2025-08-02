package LL;

public class CLL {
    private Node head ;
    private Node tail;
    private int size =0;

    CLL(){
        this.size=0;
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
    public void insertAfter(Node afterNode, int val){
        Node node = new Node(val);
        node.next=afterNode.next;
        afterNode.next=node;
        size=size+1;

    }
    public Node find(int val){
        Node temp = head;
        while(temp.next!=head){
            if(temp.value==val) {
                return temp;
            }
            else{
                temp = temp.next;
            }
        }
        return null;
    }
    public void delete(int val){
        if(head.value==val){
            tail.next=tail.next.next;
            head=tail.next;
            return;
        }
        Node temp = head;
        while(temp.next!=head){
            if(temp.next.value==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
    public void display(){
        Node temp = head;
        while(temp.next!=head) {
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print(temp.value + " -> Again  points to Head and continues..");
    }
    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
//        Node(int value, Node next){
//            this.value=value;
//            this.next=next;
//        }
    }
}
