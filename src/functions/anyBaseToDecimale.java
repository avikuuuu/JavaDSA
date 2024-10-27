package functions;

import java.util.Scanner;

public class anyBaseToDecimale {
    public static void anyBaseConvertToDecimale(int num,int numBase){
        int str=0;
        int ans=0;
        while (num>0){
            int mod=num%10;
            int power=(int) Math.pow(numBase,str);
            ans +=mod*power;
            str++;
            num /=10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int numBase= sc.nextInt();
//        int base=sc.nextInt();
        anyBaseConvertToDecimale(num,numBase);
    }
}
