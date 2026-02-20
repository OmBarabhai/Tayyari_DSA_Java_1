package Strings;
import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("OM");
        System.out.println("String Length is: "+sb.length()+" "+"\n"+"String Capacity is: "+ sb.capacity());
        System.out.println();
        sb.append("Rajput");
        System.out.println("New String Length is: "+sb.length()+" "+"\n"+"New String Capacity is: "+ sb.capacity());

    }
}
