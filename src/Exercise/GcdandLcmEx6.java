package Exercise;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/20.
 */
public class GcdandLcmEx6 {
    private int num1;
    private int num2;
    public int gcd(int a,int b){
        this.num1 = a;
        this.num2 = b;
        while(a%b!=0){
            int c = a%b;
            a = b;
            b = c;
        }
        return b;
    }
    public int lcm(int e,int f){
        this.num1 = e;
        this.num2 = f;
        int g = e * f;
        while(e%f!=0){
            int h = e%f;
            e = f;
            f = h;
        }
        return g/f;
    }
    public static void main(String[] args){
        System.out.println("Imput two numbers:");
        Scanner imput = new Scanner(System.in);
        int n1 = imput.nextInt();
        int n2 = imput.nextInt();
        GcdandLcmEx6 n3 = new GcdandLcmEx6();
        GcdandLcmEx6 n4 = new GcdandLcmEx6();
        System.out.print(n3.gcd(n1,n2)+"\n");
        System.out.print(n4.lcm(n1,n2)+"\n");
    }
}
