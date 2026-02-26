package TwoDimArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30); a.add(40);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(01); b.add(02); b.add(03); b.add(04);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);c.add(3);c.add(5);c.add(7);c.add(11);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(a);ans.add(b);ans.add(c);
        System.out.println(ans);

//        for (int i = 0; i < ans.size(); i++) {
//            for (int j = 0; j < ans.get(i).size(); j++) {
//                System.out.print(ans.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        ans.add(new ArrayList<>());
        ans.get(ans.size()-1).add(90);  ans.get(ans.size()-1).add(80);
        System.out.println(ans);

        for(ArrayList<Integer> list: ans){
            for(int ele:list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }


    public List<List<Integer>> generate(int n){
        ArrayList<List<Integer>>ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                list.add(1);
            }
            ans.add(list);
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == 0||j==i) ans.get(i).set(j,1);
                else {
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).set(j,val);
                }
            }
        }
        return ans;
    }
}
