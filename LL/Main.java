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
        ll.insertWithRecursion(1,7,);
        ll.display();

//        DLL dll = new DLL();
//        dll.insertFirst(4);
//        dll.insertFirst(3);
//        dll.insertFirst(2);
//        dll.insertFirst(1);
//        dll.insertLast(5);
//        dll.display();
//        dll.displayRev();
//        dll.insertLastWithoutTail(8);
//        dll.display();
//        dll.insertAfter(dll.find(3),10);
//        dll.display();

//        CLL cll = new CLL();
//        cll.insert(1);
//        cll.display();
//        System.out.println();
//        cll.insert(2);
//        cll.display();
//        System.out.println();
//        cll.insert(3);
//        cll.insert(4);
//        cll.insert(5);
//        cll.display();
//        System.out.println();
//        cll.insertAfter(cll.find(3),10);
//        cll.display();
//        System.out.println();
//        cll.delete(1);
//        cll.display();

    }
}
