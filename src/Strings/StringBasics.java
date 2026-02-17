package Strings;

import java.util.Map;
import java.util.Scanner;

public class StringBasics {

    public static int compareTo(String a,String b){
//        Scanner sc = new Scanner(System.in);
//        int n = a.length();
//        int m = b.length()-1;
//
//        for (int i = 0; i < n; i++) {
//            int x = a.charAt(i);
//            for (int j = 0; j < m; j++) {
//                int y = b.charAt(j);
//                if(x == y){
//                    return 0;
//                }
//            }
//        }
//        return -1;

        int n = Math.min(a.length(),b.length());
        for (int i = 0; i < n; i++) {
            int ch1 = a.charAt(i);
            int ch2 = b.charAt(i);

            if(ch1!=ch2){
                return ch1 - ch2;
            }

        }
        return a.length() - b.length();
    }
    public static void main(String[] args) {
        String a = "yash";
        String b= "om";

        System.out.println(compareTo(a,b));


//        char[] arr = {'p','r','i','y','a'};
//        String o="OM";
//        System.out.println(o);
//
//        for(char ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//
//        String str = "Om Rajeshsingh Barabhai";
////        char[] p = {'a','e','i','o','u'};
//        int count =0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
////            System.out.print(str.charAt(i));
//            if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                    count++;
//            }
//        }
//        System.out.println(count+"");
//

    }
}
