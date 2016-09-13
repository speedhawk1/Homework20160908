package Exercise;

import java.awt.*;
import java.util.Scanner;
/**
 * Created by Administrator on 2016/9/10.
 */
public class exercise3 {
    public static void main(String[] args){
        int b=0;
        for(int a = 100;a<=999;++a){
            if((a%10)*(a%10)*(a%10)+((a/10)%10)*((a/10)%10)*((a/10)%10)+(a/100)*(a/100)*(a/100)==a){
                System.out.print(a+"\n");
                ++b;
                if(b!=0 && b%6==0){
                    System.out.print("\n");
                }
            }
        }
        int x=0,y=1,z=x+y;
        for(int n=1;n<15;++n){
            x=y;
            y=z;
            z=x+y;
            System.out.print(z+"\t");
        }
        System.out.print("\n"+z);
    }
}
