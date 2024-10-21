package number;

import java.util.Scanner;

public class digitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        while(temp>0){
            temp /=10;
            count++;
        }
        int div=(int)Math.pow(10,count-1);

        while (div!=0){
            int mod=num/div;
            System.out.println(mod);
            num=num%div;
            div /=10;
        }

    }
}
