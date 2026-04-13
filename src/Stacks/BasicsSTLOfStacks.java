package Stacks;

import java.util.Stack;

public class BasicsSTLOfStacks {
      public static void main(String args[]){
        Stack<String> st = new Stack<>();
        st.push("Om");
        st.push("sanyukta");
        st.push("harshada");
        st.push("tushar");
        System.out.println(st.size());
        System.out.println(st);
//        st.pop();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);

    }
}
