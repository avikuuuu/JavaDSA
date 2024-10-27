package functions;

import java.util.Scanner;

public class decimalToAnyBase {

    public static void ConvertBase(int num,int numBase,int base){
        int str=0;
        int ans=0;
        while (num>0){
            int mod=num%base;
            int power=(int) Math.pow(numBase,str);
            ans +=mod*power ;
            str++;
            num /=base;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int numBase= sc.nextInt();
        int base=sc.nextInt();
        ConvertBase(num,numBase,base);
    }
}
