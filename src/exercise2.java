import java.awt.*;
import java.util.Scanner;
/**
 * Created by Administrator on 2016/9/8.
 */
public class exercise2 {
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
