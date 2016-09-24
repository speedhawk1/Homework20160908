package MethodTest;
import sun.nio.cs.US_ASCII;
import sun.nio.cs.UTF_32;
import sun.text.normalizer.UTF16;

import static java.lang.System.out;

/**
 * Created by Administrator on 2016/9/24.
 */
public class MethodTest {
    public static void main(String[] args){
        String a = "String";
        String c = "Std";
        char b = a.charAt(0);
        String d = "\n";
        out.println(b);

        out.println("String".concat("Test"));
        out.println(a.contains(c));
        out.println(a.getBytes());
        out.println(d.matches("\n"));
        out.println(a.replace("Str","Abc"));
    }
}
