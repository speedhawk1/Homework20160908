package Exercise;
/*
* 练习思路：首先求出num的因数并累加，其次输出完数相应的累加数，再次对输出数排列。
* */
public class Ex9PerfectNumber {
    public static void main(String[] args){
        int c = 0;
        int d = 0;
        for(int num = 1;num <= 1000;++num){
            for(int sum = 1;sum <= num;++sum){
                if(num == 1){
                    c=sum;
                }else if(num % sum == 0 && num != sum){
                    c+=sum;
                }
            }
            if(c==num){
                System.out.print(c+"\t");
                ++d;
            }
            c=0;
        }
        if(d != 0 && d%6 == 0){
            System.out.print("\n");
        }
    }
}
