package Stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
//        st.push(50);
        int ele = 50;
        System.out.println(st);
        pushAtBottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
/*
[10, 20, 30, 40, 50]
[60, 10, 20, 30, 40, 50]
[50, 40, 30, 20, 10, 60]
*/
    private static void reverse(Stack<Integer> st) {
        if(st.size() <= 1)return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    private static void pushAtBottom(Stack<Integer> st, int ele) {
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }
}
