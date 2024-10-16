package number;

import java.util.Scanner;

public class MpowerN {

    public  static void powerN(int num ,int power){
    int result=1;
        for(int i=1;i<=power;i++){
            result *=num;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        powerN(num1,num2);

    }

}
