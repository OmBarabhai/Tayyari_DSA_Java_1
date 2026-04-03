package LinkedList;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
     ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail.prev = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(int val){
        if(head.next == null) head = tail = null;
        else {
           head = head.next;
           head.prev = null;
        }
        size--;
    }
    void deleteAtTail(int val){
        if(head == null) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }
    void display(){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list =new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
//        list.display();
        list.insertAtTail(50);
//        list.display();
        list.displayReverse();


    }
}