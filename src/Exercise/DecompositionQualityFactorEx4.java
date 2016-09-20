package Exercise;
import java.util.Scanner;
/**
 * 练习思路：分解质因数需要将num中每个质因数呈现，可先对小于num的整数for循环遍历，
 * 进一步通过if判断语句筛选质因数，并同时更新num，刷新a。
 */
public class DecompositionQualityFactorEx4 {
    private int num;

    public DecompositionQualityFactorEx4(int n) {
        this.num = n;
        if (num == 0 || num == 1) {
            System.out.print("Execution failed,please input the valid value.");
        } else {
            System.out.print(num + "=" + 1);
            for (int a = 2; a <= num; ++a) {
                if (num % a == 0) {
                    System.out.print("*" + a);
                    num /= a;
                    a = 1;
                }
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        DecompositionQualityFactorEx4 dqf = new DecompositionQualityFactorEx4(number);
        System.out.print(dqf);
    }

}
