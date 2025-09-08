package LL;

public class BubbleSort {
    ListNode head;
    ListNode tail;
    int size;

    public static void main(String[] args) {
        BubbleSort ll =new BubbleSort();
        ll.insertLast(15);
        ll.insertLast(11);
        ll.insertLast(9);
        ll.insertLast(4);
        ll.insertLast(2);
        ll.insertLast(1);
        ll.display();
//        BubbleSort ll1=new BubbleSort();
//        ll1.display(ll1.sortList(ll.head));

//        BubbleSort list = new BubbleSort();
//        for (int i = 7; i > 0; i--) {
//            list.insertLast(i);
//        }
//        list.display();
        ll.bubbleSort();
        ll.display();
    }
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }
    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }
    public ListNode get(int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        ListNode ListNode=new ListNode(value);
        tail.next=ListNode;
        tail=ListNode;
        size =size+1;
    }
    public void insertFirst(int value){
        ListNode ListNode=new ListNode(value);
        ListNode.next=head; // whenever adding a new element, whatever the head previously was needs to be the next
        // element of the element we are adding at the first position
        head=ListNode;
        if(tail==null){
            tail=head;
        }
        size =size+1;
    }
    public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class ListNode{
        int val;
        ListNode next;
        int size;

        ListNode(ListNode next){
            this.next=next;
        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(){

        }

    }
}

