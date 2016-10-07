package JavaReview;
import static java.lang.System.out;

/**
 * Created by Administrator on 2016/10/7.
 */
public final class FinalTypeTest {
    private final int a = 0;  //终态域只能在声明时初始化，且初始化后不可更改
    private int b;
    public final void method() {
        out.println("Final method"); //终态方法不可被子类重载
    }
        public static void main(String[] args){
            out.println("...");
    }
}

