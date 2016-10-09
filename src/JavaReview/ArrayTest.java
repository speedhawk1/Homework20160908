package JavaReview;
import static java.lang.System.out;

/**
 * Created by Administrator on 2016/10/8.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[5];  //数组是一种标准库衍生类型。PS：如想创建一个元素类型不同的数组，可使用Object[]。
        int[] arr2 = {1,2,3,4,5};  //数组可通过参数定义，亦可直接定义。初始化后，其元素个数将不可改变。
        out.println(arr1.length);
        out.println(arr2[2]);
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = i + 1;
            out.println(arr1[i]);
        }
        for (int j : arr2) {  //foreach循环往往比for循环更节省代码量。
            arr2[j-1] = j + 1;
            out.println(arr2[j-1]);
        }
        int[][] arr = new int[5][5];
        for (int[] i : arr) {
            for (int j : i) {
                i[j] = 7;
                out.print(i[j]);
            }
            out.println();   //网上说foreach只能循环遍历却不能对数组元素再次赋值，不知道对不对
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j + 1;
                out.print(arr[i][j]);
            }
            out.println();
        }
    }
}
