package Exercise;

import java.util.Hashtable;

/**
 * Created by Administrator on 2016/10/7.
 */
public class Ex34RandomNumber {
    public static void main(String[] args) {
        Hashtable<String,Integer> hash = new Hashtable<>();
        hash.put("zhangsan",1);
        hash.put("lisi",2);
        hash.put("wangwu",3);
        hash.put("maliu",4);
//        System.out.print(hash.isEmpty());
        System.out.println(hash.hashCode());
        System.out.println(hash.keySet());
    }
}
