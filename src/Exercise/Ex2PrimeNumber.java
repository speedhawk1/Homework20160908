package Exercise;
import java.awt.*;
import java.util.Scanner;
/**
 * 练习思路：素数仅能被1与本身整除，故可对每个素数进行求模运算的循环遍历，
 * 有且仅有2次求模为0的数即为素数。
 */
public class Ex2PrimeNumber {
   public static void main(String[] args){
       int c=0,d=0;
       for(int a=101;a<=200;++a){
           for(int b=1;b<=a;++b){
                if(a%b==0){
                    ++c;
                }
           }
           if(c==2) {
               System.out.print(a+"\t");
               ++d;
               if(d%6==0){
                   System.out.print("\n");
               }
           }
           c=0;
       }
       System.out.println("\n此范围内共有"+d+"个素数");
   }
}
