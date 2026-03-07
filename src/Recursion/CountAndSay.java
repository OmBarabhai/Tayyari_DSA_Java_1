package Recursion;

public class CountAndSay{

    public static void main(String[] args) {
        System.out.println("Final Answer: " + countAndSay(5));
    }

    public static String countAndSay(int n){

        System.out.println("\nCALL -> countAndSay(" + n + ")");

        // base case
        if(n==1){
            System.out.println("Base case reached, return 1");
            System.out.println();
            return "1";
        }

        // recursive call
        String s = countAndSay(n-1);

        System.out.println("Returned from countAndSay("+(n-1)+") with value: " + s);
        System.out.println();

        String ans = "";

        int i = 0;
        int j = 0;

        System.out.println("Processing string: " + s);
        System.out.println();

        while(j < s.length()){

            System.out.println("i="+i+" j="+j+" comparing "+s.charAt(i)+" and "+s.charAt(j));
            System.out.println();

            if(s.charAt(i) == s.charAt(j)){
                j++;
            }

            else{

                int freq = j-i;

                System.out.println("Group found: "+freq+" of "+s.charAt(i));
                System.out.println();

                ans += freq;
                ans += s.charAt(i);

                i = j;
            }
        }

        int freq = j-i;

        System.out.println("Last group: "+freq+" of "+s.charAt(i));
        System.out.println();

        ans += freq;
        ans += s.charAt(i);

        System.out.println("Generated string for n="+n+" → "+ans);

        return ans;
    }
}