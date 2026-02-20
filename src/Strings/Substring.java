package Strings;

public class Substring {
    public static void main(String[] args) {
        String s = "Bhakti";


        for (int i = 0; i < s.length(); i++) {
//            String ch = s.substring(s.charAt(),i);
            for (int j = i+1; j <= s.length(); j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();

        }
        System.out.println();



    }
}
