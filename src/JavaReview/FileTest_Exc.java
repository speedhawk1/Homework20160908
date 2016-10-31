package JavaReview;

import java.io.*;

/**
 * Created by Administrator on 2016/10/20.
 */
public class FileTest_Exc {

    public static int writercheck(String a) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(a));
        int i;
        if ((i = br.read()) != -1) {
            while ((i = br.read()) != -1){
                System.out.print((char)i);
//                return 0;
            }
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:/myproject/Homework20160908/FileUse/FileReader.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/myproject/Homework20160908/FileUse/new_FileReader.txt"));
            /*Writer bw = new FileWriter("D:/myproject/Homework20160908/FileUse/FileReader.txt");*/
            int i;
            while ((i = br.read()) != -1) {
                /*System.out.print((char)i);*/
                bw.write(i);
            }
            bw.close();   //释放缓存
            writercheck("D:/myproject/Homework20160908/FileUse/new_FileReader.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
