package Methods;

public class ReturnMandatory {
    public static void main(String[] args) {
        System.out.println(ananya(5));
    }

    public static int ananya(int a) {
        if(a>0) return a;

        return -9;

    }
}
