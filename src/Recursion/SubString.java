package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {
        String s = "abc";

        List<String> list = new ArrayList<>();
        substring("",s,0,list);
        System.out.println(list);
    }

    public static void substring(String ans, String s, int idx,List<String> list) {
        if(idx == s.length()){
            if(ans.length()!=0) list.add(ans);
//            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(idx);
        substring(ans+ch,s,idx+1,list);
        substring(ans,s,idx+1,list);

    }
}
