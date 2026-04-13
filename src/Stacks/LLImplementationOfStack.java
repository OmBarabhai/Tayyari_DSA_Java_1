package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }

}
class MyStack{
    Node head;
    int len;
    int peek()throws Exception{
        if(head == null){
            throw new Exception("Stack Underflow Error");
        }
        return head.val;
    }
    int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack Underflow Error");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){//addAtHead

        Node temp = new Node(ele);
        if(len == 0) head = temp;
        else {
            temp.next= head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception{
        MyStack st = new MyStack();
        st.pop();
        st.push(34);
        st.push(44);
        st.push(39);
        st.push(80);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        st.display();
    }
}
