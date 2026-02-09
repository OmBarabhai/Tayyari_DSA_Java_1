package Arrays;

public class PassingArrToMethod {
    public static void main(String[] args) {
        int[] x = {33,44,33,66,88};

        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        System.out.println(y[3]);
        y[2] = 76;
    }
}
