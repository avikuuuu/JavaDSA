package functions;

import java.util.Scanner;

public class digitFrequency {
    public static void freq(long num) {

        long[] arr=new long[9];
        long max=Integer.MIN_VALUE;
        while (num>0){
            int mod=(int)num%10;
            arr[mod]++;
            num/=10;
        }
        for(long ac:arr){
            if(ac>max){
                max=ac;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         long num=sc.nextLong();
        sc.close();
        freq(num);
    }
}
