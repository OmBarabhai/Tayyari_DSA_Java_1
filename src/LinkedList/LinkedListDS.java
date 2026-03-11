package LinkedList;
//class Node{
//    int val;
//    Node next; // null
//    Node(int val){
//        this.val = val;
//    }
//}
//class LinkedList{ /// User Defined DS
//    Node head; ///null
//    Node tail; ///null
////    LinkedList(){
/////      head = tail = null; // not required
////    }
//    void addAtHead(int val){
//        Node temp = new Node(val);
//        if (head == null) head = tail = temp;
//        else {
//            temp.next = head;
//            head = temp;
//        }
//    }
//    void addAtTail(int val){
//        Node temp = new Node(val);
//        if(tail == null) head = tail =  temp;
//        else {
//            tail.next = temp;
//            tail = temp;
//        }
//    }
//    void deleteHead(){
//        if(head == null) {
//            System.out.println("LinkList Is Empty");
//            head = tail;
//            // return
//        }
//        else head = head.next;
//    }
//    void display() {
//        if(head == null) return;
//        Node temp = head;
//        while (temp!= null) {
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//public class LinkedListDS {
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();


////        ll.addAtTail(20);
////        ll.addAtTail(40);
////        ll.addAtTail(60);
////        ll.addAtTail(80); ll.display();
////        ll.addAtHead(100);
////        ll.addAtHead(120);ll.display();
//        ll.deleteHead();ll.display();
//    }
//}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteHead(){
        if(head == null) return;
        else head = head.next;
//        size--;
    }
//    void deleteTail(){
//        if(head == null) head = tail;
//        else head = head.next;
//        size--;
//    }
    void display(){
        if (head == null) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insert(int val, int idx) {
        if(idx < 0 || idx > size) {
            System.out.println("Invalid Index!");
        }
        if(idx == 0)addAtHead(val);
        else if(idx == size) addAtTail(val);
        else {
            Node temp = head;
            for (int i = 0;i<=idx-1;i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
}

public class LinkedListDS {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(20);
        ll.addAtTail(40);
        ll.addAtTail(60);
        ll.addAtTail(80); ll.display();
        ll.addAtHead(100);
        ll.addAtHead(120); ll.display();
        ll.deleteHead();ll.display();
        System.out.println(ll.size);
        ll.insert(40,2);

    }
}

