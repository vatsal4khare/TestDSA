package LL;

public class Main {
    public static void main(String[] args) {
        LL ll=new LL();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertLast(5);
        ll.insert(55,2);
        ll.display();
//        System.out.println(ll.deleteFirst());
        ll.deleteFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
    }
}
