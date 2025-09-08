package LL;

public class ReverseKGroup {
    private static ListNode head;
    private static ListNode tail;
    private int size;
    public static void main(String[] args) {
        ReverseKGroup Rll = new ReverseKGroup();
        Rll.insertLast(1);
        Rll.insertLast(2);
        Rll.insertLast(3);
        Rll.insertLast(4);
        Rll.insertLast(5);

//        Rll.display();
        reverseKGroup(head,2);
        Rll.display();
    }
    public void insertFirst(int value){
        ListNode node=new ListNode(value);
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
        ListNode node=new ListNode(value);
        tail.next=node;
        tail=node;
        size =size+1;
    }
    public static void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }

    private class ListNode{
        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value=value;
        }
        public ListNode(int value, ListNode next){
            this.value=value;
            this.next=next;
        }
    }

}
