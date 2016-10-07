package JavaReview;
import static java.lang.System.out;

/**
 * Created by Administrator on 2016/10/7.
 */
public class StaticTypeTest {
    private static int a;
    private double b;

    public void method1() {
        out.println("...");
    }
    public static void method2(){
        a = 20;//静态方法只能引用静态成员。
        int c = 0; //不可在静态方法中定义静态变量或方法。静态变量或方法属于整个类，而并不仅仅属于某个具体对象。
        out.println("This is a static method.");
    }

    public static void main(String[] args) {
        StaticTypeTest at = new StaticTypeTest();
        at.method2();
        StaticTypeTest.method2();  //静态方法可以用类名直接调用，而不需要创建对象。
        out.print("...");
    }
}

