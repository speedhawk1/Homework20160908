package JavaReview;
import static java.lang.System.out;

/**
 * Created by Administrator on 2016/10/7.
 */
public interface InterfaceTest {
    int i= 0;
    double j = 1.2;  //接口域都是公有常量，即公有静态并终态域。

    void method();  //接口方法都是公有抽象方法，故无法实例化。
}

    interface SubInterfaceTest extends InterfaceTest{  //父接口亦可被子接口继承，一个子接口可同时继承多个父接口。
    int k =1;
    void met();
    }
class InterfaceClass implements InterfaceTest,SubInterfaceTest {  //接口可通过类实现,一个类可同时实现多个接口。
    public void method(){
        out.print("...");
    }

    @Override
    public void met() {
        out.print("...");
    }
}
