package LL;

public class MergeSort {
    ListNode head;
    ListNode tail;
    int size;

    public static void main(String[] args) {
        MergeSort ll =new MergeSort();
        ll.insertLast(15);
        ll.insertLast(11);
        ll.insertLast(9);
        ll.insertLast(4);
        ll.insertLast(2);
        ll.insertLast(1);
        ll.display();

        MergeSort ll1=new MergeSort();
        ll1.display(ll1.sortList(ll.head));

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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
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

