package Exercise;

import java.util.Scanner;
/**
 * Created by Administrator on 2016/9/8.
 */
public class problem1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=20;
        int num1=input.nextInt();
        if(num1<num){
            System.out.print("Sorry,your number is smaller than the truth!!");
        }else if(num1>num){
            System.out.print("Sorry,your number is larger than the truth!!");
        }else{
            System.out.print("Congratulations!U got it!!");
        }
    }
}
